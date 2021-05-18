import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app3';
  
  status=true;

  myColor='green';

  s1:string;
  s2:string;

  name='Praveen';

  test(e){
    console.log('--- clicked....');
    console.log(e);
    
    
  }

  test1(e){
   //console.log(e.target.value);
   this.s1=e.target.value;
   
    
  }
  
  test2(){

  }


}
