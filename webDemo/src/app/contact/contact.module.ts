import {NgModule} from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule }   from '@angular/forms';
import {ListContactComponent} from './list-contact/list-contact.component';
import {DetailsContactComponent} from './details-contact/details-contact.component';

import {ContactService} from '../services/contact.service';

import {MaterialModule} from '../material.module';
import {AppRouterModule} from '../app.routes';
import {CreateContactComponent} from './create-contact/create-contact.component';
import { UpdateContactComponent } from './update-contact/update-contact.component';

@NgModule({
  declarations: [
    ListContactComponent,
    DetailsContactComponent,
    CreateContactComponent,
    UpdateContactComponent
  ],
  imports: [
    BrowserAnimationsModule,
    MaterialModule,
    AppRouterModule,
    FormsModule,
    ReactiveFormsModule
    
  ],
  providers: [
    ContactService
  ]
})
export class ContactModule {}
