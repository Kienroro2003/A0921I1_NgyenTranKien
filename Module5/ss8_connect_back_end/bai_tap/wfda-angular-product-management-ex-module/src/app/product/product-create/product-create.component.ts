import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {CategoryService} from '../../service/category.service';
import {Category} from '../../model/category';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl()
  });

  categories: Category[] = [];

  constructor(private productService: ProductService, private categoryService: CategoryService, private router: Router) {
  }

  ngOnInit() {
    this.getAllCategory();
  }

  getAllCategory() {
    this.categoryService.getAll().subscribe(next => {
      console.log(next);
      this.categories = next;
    }, error => {
      console.log(error);
    });
  }

  submit() {
    console.log(this.productForm.controls);
    const product = this.productForm.value;
    this.productService.saveProduct(product).subscribe(next=>{
      this.router.navigateByUrl("product/list");
    })
    // const product = this.productForm.value;
    // this.productService.saveProduct(product);
    // this.productForm.reset();
  }
}
