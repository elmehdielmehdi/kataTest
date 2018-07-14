import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import {AppComponent} from './app.component';

import {ErrorsPageModule} from './errors-page/errors-page.module';
import {ContactModule} from './contact/contact.module';
import {AppRouterModule} from './app.routes';
import {BrowserModule} from '@angular/platform-browser';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    ErrorsPageModule,
    ContactModule,
    AppRouterModule
  ],
  providers: [
  ],

  bootstrap: [AppComponent]
})
export class AppModule {}
