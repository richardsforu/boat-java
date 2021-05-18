import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-search-product',
  templateUrl: './search-product.component.html',
  styleUrls: ['./search-product.component.css']
})
export class SearchProductComponent implements OnInit {

  constructor(private route: ActivatedRoute, private ps: ProductService) { }
  product:Product

  ngOnInit(): void {

    console.log(">>>>>>>>>>");
    this.route.paramMap.subscribe(params => {
      console.log(params.get('id'));
     // this.product=this.ps.findById(params.get('id'));
     this.ps.findById(params.get('id')).subscribe(product=>this.product=product);

    })

  }

}