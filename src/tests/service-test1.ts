import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'  // يحدد أن هذه الخدمة متاحة في كامل التطبيق
})

export class ProductService {
  getProducts(): Product {
    return [
      { id: 1, name: 'منتج 1', price: 100 },
      { id: 2, name: 'منتج 2', price: 200 },
    ];
  }
}
