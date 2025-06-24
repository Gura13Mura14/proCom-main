<script>
import { Injectable } from '@angular/core';
import { Product } from './product.model';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  private products: Product[] = [
    { id: 1, name: 'Product 1', image: 'assets/product1.jpg', description: 'Details of Product 1' },
    { id: 2, name: 'Product 2', image: 'assets/product2.jpg', description: 'Details of Product 2' },
    { id: 3, name: 'Product 3', image: 'assets/product3.jpg', description: 'Details of Product 3' },
  ];

  getProducts(): Product[] {
    return this.products;
  }
}
</script>
