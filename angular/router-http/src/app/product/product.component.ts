import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  @Input()
  product: Product;

  constructor(private ps:ProductService,private router:Router) { }

  editProduct(product) {
    console.log(product);
    this.router.navigate(['form',product.id])
  }

  deleteProduct(id) {

    console.log('deleting product with id '+id);
    this.ps.deleteProduct(id);
    console.log('product witgh id '+id +' deleted ');
    this.router.navigate(['home'])

  }

  ngOnInit(): void {




  }

}
