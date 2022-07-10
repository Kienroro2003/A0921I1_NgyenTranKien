import { Component, OnInit } from '@angular/core';
import {ProductService} from "../service/product.service";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {Product} from "../model/product";

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {
  product: any;

  constructor(private productService: ProductService, private activatedRoute: ActivatedRoute) {
    activatedRoute.paramMap.subscribe((paramMap:ParamMap)=>{
      const id = paramMap.get("id");
      console.log(id);
      if (typeof id === "string") {
        this.product = this.productService.findById(parseInt(id));

      }
    })
  }

  ngOnInit(): void {
  }

}
