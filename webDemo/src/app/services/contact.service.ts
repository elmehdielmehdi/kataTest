import {Injectable, Inject} from '@angular/core';
import {HttpClient} from '@angular/common/http';

import {Observable} from 'rxjs/Observable';
import {Contact} from '../data.model';
import {environment} from '../../environments/environment';



@Injectable()
export class ContactService {

  constructor(private http: HttpClient) {}

  getAllContacts(): Observable<Contact[]> {
    return this.http.get<Contact[]>(environment.host + '/getContacts');
  }

  getContact(idContact): Observable<Contact> {
    return this.http.get<Contact>(environment.host + '/getContact/' + idContact);
  }

  deleteContact(idContact): Observable<Contact> {
    return this.http.delete<Contact>(environment.host + '/deleteContact/' + idContact);
  }

  createContact(contact: Contact): Observable<Contact> {
    return this.http.post<Contact>(environment.host + '/createContact', contact)
  }

  updateContact(contact: Contact): Observable<Contact> {
    return this.http.put<Contact>(environment.host + '/updateContact', contact);
  }

}
