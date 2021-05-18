import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CustomValidationService } from '../custom-validation.service';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  productForm: FormGroup;
  isSubmited: boolean=false;

  constructor(private fb: FormBuilder,private customValidator:CustomValidationService) { }

  handleSubmit() {
    this.isSubmited=true;
    console.log(">>>>> submited <<<<<<");
    console.log(this.productForm.status);

    if (this.productForm.status === "VALID") {
      // do db operations
      console.log(this.productForm.value);

    } else {
      console.log(">>> Form Not Submited .. Errors");
    }
  }

  get fc() {
    return this.productForm.controls;
  }


  ngOnInit(): void {

    this.productForm = this.fb.group(
      {
        id: ['', [Validators.required,Validators.minLength(3)]],
        name: ['',[Validators.required]],
        price: [,[Validators.required,Validators.pattern('^[0-9]+(\\.[0-9]{2})?$')]],
        description: [],
        inventoryDate:[,[Validators.required,this.customValidator.inventoryDateValidator()]]
      }
    )


  }

}
