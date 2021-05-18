import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomValidationService } from '../custom-validation.service';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  productForm: FormGroup;
  isSubmited: boolean = false;
  isAddMode:boolean=true;

  constructor(private route:ActivatedRoute, private router: Router, private ps: ProductService, private fb: FormBuilder, private customValidator: CustomValidationService) { }
  handleSubmit() {
    this.isSubmited = true;
    if (this.isAddMode) {
      this.saveProduct();
    } else {
      this.editProduct();
    }
  }

  saveProduct() {
    console.log("--- save mode");
    if (this.productForm.valid) {
      this.ps.save(this.productForm.value).subscribe(response => {
        console.log(response);
      })

      this.router.navigate(['findAll']);
    }
  }

  editProduct() {
    console.log("--- edit mode");
    if (this.productForm.valid) {
      this.ps.updateProduct(this.productForm.value).subscribe(response => {
        console.log(response);
        this.router.navigate(['/findAll']);

      })
    }
  }

  get fc() {
    return this.productForm.controls;
  }

  ngOnInit(): void {
    let id=null;
    this.route.paramMap.subscribe((params=>{
     this.isAddMode=!params.get('id');
      id=params.get('id');
    }))

    this.productForm = this.fb.group(
      {
        id: [''],
        name: ['', [Validators.required]],
        price: [, [Validators.required, Validators.pattern('^[0-9]+(\\.[0-9]{2})?$')]],
        description: [],
      }
    )
    if(!this.isAddMode){ 
      this.ps.findById(id).subscribe(product=>{
        this.productForm.patchValue(product);
      })
    }
  }





}
