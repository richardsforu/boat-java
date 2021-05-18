import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor(private ps:ProductService){}
  products=new Array<Product>();

  ngOnInit(): void {
    //this.products=this.ps.findAll();
    this.ps.findAll().subscribe(products =>this.products=products);
  }

}
