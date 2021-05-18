import { Component } from '@angular/core';
import {Moment as moment } from 'moment';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  query:string;
  
employees=[{
  "id": 1,
  "first_name": "Eudora",
  "last_name": "Thieme",
  "email": "ethieme0@angelfire.com"
}, {
  "id": 2,
  "first_name": "Babbette",
  "last_name": "Babon",
  "email": "bbabon1@slate.com"
}, {
  "id": 3,
  "first_name": "Dunn",
  "last_name": "Fulep",
  "email": "dfulep2@harvard.edu"
}, {
  "id": 4,
  "first_name": "Westley",
  "last_name": "Stockey",
  "email": "wstockey3@furl.net"
}, {
  "id": 5,
  "first_name": "Brice",
  "last_name": "Kolyagin",
  "email": "bkolyagin4@issuu.com"
}, {
  "id": 6,
  "first_name": "Lorry",
  "last_name": "Lisimore",
  "email": "llisimore5@ucla.edu"
}, {
  "id": 7,
  "first_name": "Alwyn",
  "last_name": "Hayle",
  "email": "ahayle6@gov.uk"
}, {
  "id": 8,
  "first_name": "Prissie",
  "last_name": "Putland",
  "email": "pputland7@google.cn"
}, {
  "id": 9,
  "first_name": "Rinaldo",
  "last_name": "Penkman",
  "email": "rpenkman8@hao123.com"
}, {
  "id": 10,
  "first_name": "Barnie",
  "last_name": "Scolts",
  "email": "bscolts9@ifeng.com"
}, {
  "id": 11,
  "first_name": "Gilles",
  "last_name": "Antonietti",
  "email": "gantoniettia@wunderground.com"
}, {
  "id": 12,
  "first_name": "Patrica",
  "last_name": "Croxall",
  "email": "pcroxallb@de.vu"
}, {
  "id": 13,
  "first_name": "Klemens",
  "last_name": "Ivey",
  "email": "kiveyc@ucsd.edu"
}, {
  "id": 14,
  "first_name": "Tabitha",
  "last_name": "Scriver",
  "email": "tscriverd@wisc.edu"
}, {
  "id": 15,
  "first_name": "Corry",
  "last_name": "Vinter",
  "email": "cvintere@samsung.com"
}, {
  "id": 16,
  "first_name": "Ursuline",
  "last_name": "Zeplin",
  "email": "uzeplinf@ehow.com"
}, {
  "id": 17,
  "first_name": "Danya",
  "last_name": "Cherrison",
  "email": "dcherrisong@ifeng.com"
}, {
  "id": 18,
  "first_name": "Ambrose",
  "last_name": "Sandcroft",
  "email": "asandcrofth@bing.com"
}, {
  "id": 19,
  "first_name": "Josias",
  "last_name": "M'Quharge",
  "email": "jmquhargei@fda.gov"
}, {
  "id": 20,
  "first_name": "Skyler",
  "last_name": "Bavridge",
  "email": "sbavridgej@merriam-webster.com"
}]

​


  title = 'filters';

  url={
    path:'http://abc.com',
    method: 'GET',
    body:'data'
  }





  getUrl(){
    return JSON.stringify(this.url);

  }

}
