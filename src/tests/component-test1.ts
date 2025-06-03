import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';

type Product = {
  id: number;
  name: string;
  image: string;
  details: string;
};

@Component({
  selector:'app-root',
  templateUrl:'./app.component.html',
  styleUrls: ['./app-style.css']
})
export class AppComponent {
  products: Product[] = [
    {
      id: 1,
      name: 'product 1',
      image: 'https://placehold.co/100x100',
      details: 'Details product 1',
    },
    {
      id: 2,
      name: 'product 2',
      image: 'https://placehold.co/100x100',
      details: 'Details product 2',
    },
    {
      id: 3,
      name: 'product 3',
      image: 'https://placehold.co/100x100',
      details: 'Details product 3',
    },
    {
      id: 4,
      name: 'product 4',
      image: 'https://placehold.co/100x100',
      details: 'Details product 4',
    },
    {
      id: 5,
      name: 'product 5',
      image: 'https://placehold.co/100x100',
      details: 'Details product 5',
    },
    {
      id: 6,
      name: 'product 6',
      image: 'https://placehold.co/100x100',
      details: 'Details product 6',
    },
    {
      id: 7,
      name: 'product 7',
      image: 'https://placehold.co/100x100',
      details: 'Details product 7',
    },
    {
      id: 4 + 4,
      name: 'product 8',
      image: 'https://placehold.co/100x100',
      details: 'Details product 8',
    },
  ];

  selectedProduct: any;

  constructor(http: HttpClient) {}

  selectProduct(product: any): void {
    this.selectedProduct = product;
  }
}

let ahmad = 1 + 1;

function test() {}
