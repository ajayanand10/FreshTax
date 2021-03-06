//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/entities/entity-list.component.ts.e.vm
//
import { Component, Input, Output, OnChanges, EventEmitter, SimpleChanges } from '@angular/core';
import { Router } from '@angular/router';
import { DataTable, LazyLoadEvent } from 'primeng/primeng';
import { PageResponse } from "../../support/paging";
import { MessageService } from '../../service/message.service';
import { MdDialog } from '@angular/material';
import { ConfirmDeleteDialogComponent } from "../../support/confirm-delete-dialog.component";
import { InvItemGstr1 } from './invItemGstr1';
import { InvItemGstr1DetailComponent } from './invItemGstr1-detail.component';
import { InvItemGstr1Service } from './invItemGstr1.service';
import { InvGstr1 } from '../invGstr1/invGstr1';
import { InvGstr1LineComponent } from '../invGstr1/invGstr1-line.component';

@Component({
    moduleId: module.id,
	templateUrl: 'invItemGstr1-list.component.html',
	selector: 'invItemGstr1-list'
})
export class InvItemGstr1ListComponent {

    @Input() header = "InvItemGstr1s...";

    // When 'sub' is true, it means this list is used as a one-to-many list.
    // It belongs to a parent entity, as a result the addNew operation
    // must prefill the parent entity. The prefill is not done here, instead we
    // emit an event.
    // When 'sub' is false, we display basic search criterias
    @Input() sub : boolean;
    @Output() onAddNewClicked = new EventEmitter();

    invItemGstr1ToDelete : InvItemGstr1;

    // basic search criterias (visible if not in 'sub' mode)
    example : InvItemGstr1 = new InvItemGstr1();

    // list is paginated
    currentPage : PageResponse<InvItemGstr1> = new PageResponse<InvItemGstr1>(0,0,[]);

    // X to one: input param is used to filter the list when displayed
    // as a one-to-many list by the other side.
    private _inv : InvGstr1;

    constructor(private router : Router,
        private invItemGstr1Service : InvItemGstr1Service,
        private messageService : MessageService,
        private confirmDeleteDialog: MdDialog) {
    }

    /**
     * When used as a 'sub' component (to display one-to-many list), refreshes the table
     * content when the input changes.
     */
    ngOnChanges(changes: SimpleChanges) {
        this.loadPage({ first: 0, rows: 10, sortField: null, sortOrder: null, filters: null, multiSortMeta: null });
    }

    /**
     * Invoked when user presses the search button.
     */
    search(dt : DataTable) {
        if (!this.sub) {
            dt.reset();
            this.loadPage({ first: 0, rows: dt.rows, sortField: dt.sortField, sortOrder: dt.sortOrder, filters: null, multiSortMeta: dt.multiSortMeta });
        }
    }

    /**
     * Invoked automatically by primeng datatable.
     */
    loadPage(event : LazyLoadEvent) {
        this.invItemGstr1Service.getPage(this.example, event).
            subscribe(
                pageResponse => this.currentPage = pageResponse,
                error => this.messageService.error('Could not get the results', error)
            );
    }

    // X to one: input param is used to filter the list when displayed
    // as a one-to-many list by the other side.
    @Input()
    set inv(inv : InvGstr1) {
        if (inv == null) {
            return;
        }
        this._inv = inv;

        this.example = new InvItemGstr1();
        this.example.inv = new InvGstr1();
        this.example.inv.id = this._inv.id;
    }


    onRowSelect(event : any) {
        let id =  event.data.id;
        this.router.navigate(['/invItemGstr1', id]);
    }

    addNew() {
        if (this.sub) {
            this.onAddNewClicked.emit("addNew");
        } else {
            this.router.navigate(['/invItemGstr1', 'new']);
        }
    }

    showDeleteDialog(rowData : any) {
        let invItemGstr1ToDelete : InvItemGstr1 = <InvItemGstr1> rowData;

        let dialogRef = this.confirmDeleteDialog.open(ConfirmDeleteDialogComponent);
        dialogRef.afterClosed().subscribe(result => {
            if (result === 'delete') {
                this.delete(invItemGstr1ToDelete);
            }
        });
    }

    private delete(invItemGstr1ToDelete : InvItemGstr1) {
        let id =  invItemGstr1ToDelete.id;

        this.invItemGstr1Service.delete(id).
            subscribe(
                response => {
                    this.currentPage.remove(invItemGstr1ToDelete);
                    this.messageService.info('Deleted OK', 'Angular Rocks!');
                },
                error => this.messageService.error('Could not delete!', error)
            );
    }
}