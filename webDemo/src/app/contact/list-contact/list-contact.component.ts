import {Component, OnInit, OnDestroy} from '@angular/core';
import {ContactService} from '../../services/contact.service';
import {Contact} from '../../data.model';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-list-contact',
  templateUrl: './list-contact.component.html',
  styleUrls: ['./list-contact.component.css']
})
export class ListContactComponent implements OnInit, OnDestroy {

  public contacts: Contact[];
  public sub: Subscription;
  constructor(private contactService: ContactService) {}

  ngOnInit() {
    this.sub = this.contactService.getAllContacts().subscribe(data => this.contacts = data);
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  deleteContact(contact: Contact): void {
    this.sub = this.contactService.deleteContact(contact.id).subscribe(data => {
      this.contacts = this.contacts.filter(c => c !== contact);
    });
  }
}
