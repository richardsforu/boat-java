import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'components';

   msg="Default Message from Parent Component";
   childMsg:string;
   greetMessage(str){
     this.msg=str;
   }

   parentFunction(s1){
     console.log(">>>>>> parentFunction of APP Component");
     console.log(s1);
     this.childMsg=s1;
     
     
   }


}
