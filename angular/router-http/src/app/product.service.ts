import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }


  /*
    products = [
      { id: "P001", name: 'Pen', priice: 87, description: "Good" },
      { id: "P002", name: 'Abc', priice: 22, description: "Baad" },
      { id: "P003", name: 'Xyz', priice: 12, description: "Okay" },
      { id: "P004", name: 'Aaa', priice: 98, description: "Nott" },
      { id: "P005", name: 'Bbb', priice: 76, description: "Test" },
  
  
    ]
  
    */

  // load all products

  apiServer = "http://localhost:8080/api/products"

  // fetch al;
  findAll(): any {
    return this.http.get(this.apiServer);
  }

  //find by id
  findById(id): any {
    // return this.products.find(product => product.id === id);
    return this.http.get(this.apiServer + `/${id}`);
  }

  // save product
  save(product:Product):any{
    return this.http.post(this.apiServer,product);
  }

  // editt

  updateProduct(product): any {
    return this.http.put(this.apiServer,product);
  }

  // delete

  deleteProduct(id){
    this.http.delete(this.apiServer+`/${id}`).subscribe();
  }





}
