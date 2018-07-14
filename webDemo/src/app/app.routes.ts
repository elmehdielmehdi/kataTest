import {Routes, RouterModule} from '@angular/router';

import {AppComponent} from './app.component';
import {DetailsContactComponent} from './contact/details-contact/details-contact.component';
import {ListContactComponent} from './contact/list-contact/list-contact.component';
import {CreateContactComponent} from './contact/create-contact/create-contact.component';
import {PageNotFoundComponent} from '../app/errors-page/page-not-found/page-not-found.component';
import { UpdateContactComponent } from './contact/update-contact/update-contact.component';

const route: Routes =
  [
    {
      path: 'contact/:id',
      component: DetailsContactComponent

    },

    {
      path: 'createContact',
      component: CreateContactComponent
    },
    
    {
      path: 'updateContact/:id',
      component : UpdateContactComponent
      
    },

    {
      path: 'contacts',
      component: ListContactComponent
    },

    {
      path: '',
      redirectTo: '/contacts',
      pathMatch: 'full'

    },

    {
      path: '**',
      component: PageNotFoundComponent
    }];

export const AppRouterModule = RouterModule.forRoot(route, {enableTracing: true});
