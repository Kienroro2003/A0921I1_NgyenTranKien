import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {

  productForm: FormGroup;
  id: number;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.productService.findById(this.id).subscribe(next => {
        this.productForm = new FormGroup({
          id: new FormControl(this.id),
          name: new FormControl(next.name),
          price: new FormControl(next.price),
          description: new FormControl(next.description),
          category: new FormControl(next.category)
        });
      });
    });
  }

  ngOnInit() {
  }

  getProduct(id: number) {
    return this.productService.findById(id);
  }

  deleteProduct(id: number) {
    // this.productService.deleteProduct(id);
    // this.router.navigate(['/product/list']);
    this.productService.deleteProduct(this.id).subscribe(()=>{
      this.router.navigateByUrl("product/list")
    })
  }
}
