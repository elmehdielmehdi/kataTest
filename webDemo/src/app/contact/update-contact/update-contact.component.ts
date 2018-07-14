import {Component, OnInit, OnDestroy} from '@angular/core';
import {ActivatedRoute} from '@angular/router';

import {Subscription} from 'rxjs/Subscription';

import {Contact} from '../../data.model';
import {ContactService} from '../../services/contact.service';

@Component({
  selector: 'app-update-contact',
  templateUrl: './update-contact.component.html',
  styleUrls: ['./update-contact.component.css']
})
export class UpdateContactComponent implements OnInit, OnDestroy {

  public contact: Contact = new Contact();
  public sub: Subscription

  constructor(private router: ActivatedRoute, private contactService: ContactService) {}

  ngOnInit() {
    this.sub = this.router.params.subscribe(params => {
      const id = params['id'];
      if (id) {
        this.contactService.getContact(id).subscribe((data: Contact) => {
          this.contact = data;
        }, error => {
          console.log(error);
        });
      }
    });
  }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }

  updateContact(): void {
    this.contactService.updateContact(this.contact).subscribe(data => {
      console.log("update ", data)
    },error => console.log(error))
  }

}
