package com.devfalco.integerbd.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.integerbd.model.ProductModel;
import com.devfalco.integerbd.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
  private final ProductService productService;

  public ProductController(ProductService productService){
    this.productService = productService;
  }

  @PostMapping
  public ProductModel createProduct(@RequestBody ProductModel productModel){
      return productService.create(productModel);
  }

  @GetMapping
  public List<ProductModel> findProduct(@RequestParam(required = false) Integer id){
      return productService.find(id);
  }

  @DeleteMapping
  public String deleteProduct(@RequestParam(required = true) Integer id){
    boolean value =  productService.delete(id);
    if (value == true) {
      return "Produto Deletado com Sucesso";
    } else {
      return "Produto não encontrado"; 
    }
  }
  
}
