import { Component, Input, OnInit, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
  styleUrls: ['./greet.component.css']
})
export class GreetComponent implements OnInit {

  constructor() { }


  @Input("msg")
  greetMsg: string;

  @Output()
  parentEvent = new EventEmitter();

  f1() {
    this.parentEvent.emit(this.greetMsg);
    
  }


  ngOnInit(): void {
  }

}
