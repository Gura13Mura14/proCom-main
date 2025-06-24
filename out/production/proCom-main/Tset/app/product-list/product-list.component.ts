<script>
import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Product } from '../product.model';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];
  @Output() selectedProduct = new EventEmitter<Product>();

  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.products = this.productService.getProducts();
  }

  selectProduct(product: Product): void {
    this.selectedProduct.emit(product); // تأكد من إرسال كائن من نوع Product
  }
}
</script>
