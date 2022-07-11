import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../service/product.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {FormControl, FormGroup} from '@angular/forms';
import {Product} from '../../model/product';
import {Category} from '../../model/category';
import {CategoryService} from '../../service/category.service';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  productForm: FormGroup;
  categories: Category[] = [];
  id: number;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute,
              private router: Router,
              private categoryService: CategoryService) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      // const product = this.getProduct(this.id);

      this.productService.findById(this.id).subscribe(next=>{
        this.productForm = new FormGroup({
          id: new FormControl(this.id),
          name: new FormControl(next.name),
          price: new FormControl(next.price),
          description: new FormControl(next.description),
          category: new FormControl(next.category)
        });
      },error => {
        console.log(error);
      })

    });
  }

  ngOnInit() {
    this.getAllCategory();
  }

  getAllCategory(){
    this.categoryService.getAll().subscribe(next=>{
      console.log(next);
      this.categories = next;
    })
  }

  // getProduct(id: number) {
  //   return this.productService.findById(id);
  // }

  updateProduct(id: number) {
    let temp: Product = this.productForm.controls;
    console.log(temp);
    this.productService.updateProduct(id,temp).subscribe(next=>{
      this.router.navigateByUrl("product/list");
    })
  }
}
