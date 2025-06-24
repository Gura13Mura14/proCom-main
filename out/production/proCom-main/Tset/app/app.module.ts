<script>
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { ProductListComponent } from './product-list/product-list.component'; // استيراد مكون قائمة المنتجات
import { ProductDetailComponent } from './product-detail/product-detail.component'; // استيراد مكون تفاصيل المنتج
import { ProductService } from './product.service'; // استيراد خدمة المنتجات

@NgModule({
  declarations: [
    AppComponent, // مكون التطبيق الرئيسي
    ProductListComponent, // مكون قائمة المنتجات
    ProductDetailComponent // مكون تفاصيل المنتج
  ],
  imports: [
    BrowserModule // استيراد وحدة المتصفح
  ],
  providers: [ProductService], // التأكد من إضافة الخدمة في providers
  bootstrap: [AppComponent] // المكون الذي سيتم تحميله أولاً
})
export class AppModule { }
</script>
