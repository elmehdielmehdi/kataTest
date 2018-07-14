import {Component, OnInit, OnDestroy} from '@angular/core';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {Subscription} from 'rxjs/Subscription';
import {NgForm} from '@angular/Forms';

import {ContactService} from '../../services/contact.service';
import {Contact} from '../../data.model';

@Component({
  selector: 'app-details-contact',
  templateUrl: './details-contact.component.html',
  styleUrls: ['./details-contact.component.css']
})
export class DetailsContactComponent implements OnInit, OnDestroy {
  public contact: Contact;
  public sub: Subscription;


  constructor(private route: ActivatedRoute, private contactService: ContactService) {}

  ngOnInit() {
    //    this.route.paramMap
    //      .switchMap(params => this.contactService.getContact(params.get('id')))
    //      .subscribe(data => this.conta );

    this.sub = this.route.params.subscribe(params => {
      const id = params['id'];
      if (id) {
        this.contactService.getContact(id).subscribe((data: Contact) => {
          this.contact = data;
        });
      }
    });
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

}
