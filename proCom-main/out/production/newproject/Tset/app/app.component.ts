<script>
import { Component } from '@angular/core';
import { Product } from './product.model'; // تأكد من أنك قد استوردت نموذج الـ Product

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  selectedProduct?: Product; // تعريف المتغير

  onProductSelected(product: Product): void {
    this.selectedProduct = product; // التأكد من أن المنتج هو من نوع Product
  }
}
</script>
