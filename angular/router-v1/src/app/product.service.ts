import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor() { }

  products = [
    { id: "P001", name: 'Pen', priice: 87, description: "Good" },
    { id: "P002", name: 'Abc', priice: 22, description: "Baad" },
    { id: "P003", name: 'Xyz', priice: 12, description: "Okay" },
    { id: "P004", name: 'Aaa', priice: 98, description: "Nott" },
    { id: "P005", name: 'Bbb', priice: 76, description: "Test" },


  ]

  // load all products

  findAll() {
    return this.products;
  }

  findById(id) {
    return this.products.find(product => product.id === id);
  }



}
