//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/entities/entity-detail.component.ts.e.vm
//
import {Component, OnInit, OnDestroy, Input, Output, EventEmitter} from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { SelectItem } from 'primeng/primeng';
import { MessageService} from '../../service/message.service';
import {InvTaxItemGstr1} from './invTaxItemGstr1';
import {InvTaxItemGstr1Service} from './invTaxItemGstr1.service';
import {InvGstr1} from '../invGstr1/invGstr1';

@Component({
    moduleId: module.id,
	templateUrl: 'invTaxItemGstr1-detail.component.html',
	selector: 'invTaxItemGstr1-detail',
})
export class InvTaxItemGstr1DetailComponent implements OnInit, OnDestroy {
    invTaxItemGstr1 : InvTaxItemGstr1;

    private params_subscription: any;


    @Input() sub : boolean = false;
    @Input() // used to pass the parent when creating a new InvTaxItemGstr1
    set inv(inv : InvGstr1) {
        this.invTaxItemGstr1 = new InvTaxItemGstr1();
        this.invTaxItemGstr1.inv = inv;
    }

    @Output() onSaveClicked = new EventEmitter<InvTaxItemGstr1>();
    @Output() onCancelClicked = new EventEmitter();

    constructor(private route: ActivatedRoute, private router: Router, private messageService: MessageService, private invTaxItemGstr1Service: InvTaxItemGstr1Service) {
    }

    ngOnInit() {
        if (this.sub) {
            return;
        }

        this.params_subscription = this.route.params.subscribe(params => {
            let id = params['id'];
            console.log('ngOnInit for invTaxItemGstr1-detail ' + id);

            if (id === 'new') {
                this.invTaxItemGstr1 = new InvTaxItemGstr1();
            } else {
                this.invTaxItemGstr1Service.getInvTaxItemGstr1(id)
                    .subscribe(invTaxItemGstr1 => {
                            this.invTaxItemGstr1 = invTaxItemGstr1;
                        },
                        error =>  this.messageService.error('ngOnInit error', error)
                    );
            }
        });
    }

    ngOnDestroy() {
        if (!this.sub) {
            this.params_subscription.unsubscribe();
        }
    }

    gotoInv() {
        this.router.navigate(['/invGstr1', this.invTaxItemGstr1.inv.id]);
    }

    clearInv() {
        this.invTaxItemGstr1.inv = null;
    }

    onSave() {
        this.invTaxItemGstr1Service.update(this.invTaxItemGstr1).
            subscribe(
                invTaxItemGstr1 => {
                    this.invTaxItemGstr1 = invTaxItemGstr1;
                    if (this.sub) {
                        this.onSaveClicked.emit(this.invTaxItemGstr1);
                        this.messageService.info('Saved OK and msg emitted', 'Angular Rocks!')
                    } else {
                        this.messageService.info('Saved OK', 'Angular Rocks!')
                    }
                },
                error =>  this.messageService.error('Could not save', error)
            );
    }

    onCancel() {
        if (this.sub) {
            this.onCancelClicked.emit("cancel");
            this.messageService.info('Cancel clicked and msg emitted', 'Angular Rocks!')
        }
    }

}
