import {Component, OnInit} from '@angular/core';
import {Contact} from '../../data.model'
import {NgForm} from '@angular/forms';

import {ContactService} from '../../services/contact.service';

@Component({
  selector: 'app-create-contact',
  templateUrl: './create-contact.component.html',
  styleUrls: ['./create-contact.component.css']
})
export class CreateContactComponent implements OnInit {

  contact: Contact = new Contact();
  
  constructor(private contactService: ContactService) {}

  ngOnInit() {

  }

  createContact() {
    console.log(this.contact);
    this.contactService.createContact(this.contact).subscribe(data => {
      console.log("hello",data)
    }, error => console.log(error));
  }
}
