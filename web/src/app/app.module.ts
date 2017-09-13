//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/app.module.ts.p.vm
//
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule  }  from '@angular/router';
import { MaterialModule, MdDatepickerModule, MdNativeDateModule } from '@angular/material';
import { ConfirmDialogModule, FileUploadModule, PanelModule, GrowlModule, MenubarModule, DialogModule, ButtonModule, AutoCompleteModule, DataTableModule, SharedModule, DropdownModule,PickListModule,CheckboxModule,TriStateCheckboxModule, InputTextModule,InputTextareaModule,CalendarModule,PasswordModule,TabViewModule } from 'primeng/primeng';
import { ConfirmationService } from 'primeng/primeng';
import { AppComponent }   from './app.component';
import { HomeComponent }  from './home.component';
import { AuthService } from './service/auth.service';
import { MessageService } from './service/message.service';
import { routing }        from './app.routes';
import { EmailValidator } from './support/email.validator';
import { ConfirmDeleteDialogComponent } from './support/confirm-delete-dialog.component';


// InvGstr1 ...
import { InvGstr1Service } from './entities/invGstr1/invGstr1.service';
import { InvGstr1ListComponent } from './entities/invGstr1/invGstr1-list.component';
import { InvGstr1DetailComponent } from './entities/invGstr1/invGstr1-detail.component';
import { InvGstr1LineComponent } from './entities/invGstr1/invGstr1-line.component';
import { InvGstr1CompleteComponent } from './entities/invGstr1/invGstr1-auto-complete.component';

// InvItemGstr1 ...
import { InvItemGstr1Service } from './entities/invItemGstr1/invItemGstr1.service';
import { InvItemGstr1ListComponent } from './entities/invItemGstr1/invItemGstr1-list.component';
import { InvItemGstr1DetailComponent } from './entities/invItemGstr1/invItemGstr1-detail.component';
import { InvItemGstr1LineComponent } from './entities/invItemGstr1/invItemGstr1-line.component';
import { InvItemGstr1CompleteComponent } from './entities/invItemGstr1/invItemGstr1-auto-complete.component';

// User ...
import { UserService } from './entities/user/user.service';
import { UserListComponent } from './entities/user/user-list.component';
import { UserDetailComponent } from './entities/user/user-detail.component';
import { UserLineComponent } from './entities/user/user-line.component';
import { UserCompleteComponent } from './entities/user/user-auto-complete.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EmailValidator,
    ConfirmDeleteDialogComponent
    ,
    InvGstr1ListComponent,
    InvGstr1DetailComponent,
    InvGstr1LineComponent,
    InvGstr1CompleteComponent
    ,
    InvItemGstr1ListComponent,
    InvItemGstr1DetailComponent,
    InvItemGstr1LineComponent,
    InvItemGstr1CompleteComponent
    ,
    UserListComponent,
    UserDetailComponent,
    UserLineComponent,
    UserCompleteComponent
    ],
    imports: [
// angular
        BrowserModule,
        BrowserAnimationsModule,
        FormsModule,
        HttpModule,

// angular material,
        MaterialModule,
        MdDatepickerModule,
        MdNativeDateModule,

// primeng
        ConfirmDialogModule,
        FileUploadModule,
        PanelModule,
        GrowlModule,
        MenubarModule,
        DialogModule,
        ButtonModule,
        AutoCompleteModule,
        DataTableModule,
        SharedModule,
        DropdownModule,
        PickListModule,
        CheckboxModule,
        TriStateCheckboxModule,
        InputTextModule,
        InputTextareaModule,
        CalendarModule,
        PasswordModule,
        TabViewModule,

// our application routes
        routing
    ],
    providers: [
// our application entity services
        InvGstr1Service,
        InvItemGstr1Service,
        UserService,

// our application services
        AuthService,
        MessageService,

// primeng service
        ConfirmationService
    ],
    entryComponents: [ConfirmDeleteDialogComponent],
    bootstrap: [ AppComponent ]
})
export class AppModule {}