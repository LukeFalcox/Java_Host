package com.devfalco.integerbd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devfalco.integerbd.model.ProductModel;
import com.devfalco.integerbd.repository.ProductRepository;

@Service
public class ProductService {
  private ProductRepository productRepository;

  public ProductService(ProductRepository productRepository){
    this.productRepository = productRepository;
  }

  public ProductModel create(ProductModel productModel){
      return productRepository.save(productModel);
  }
  public List<ProductModel> find(Integer id){
    if (id == null) {
      return productRepository.findAll();
    } else {
      return productRepository.findById(id).map(List::of).orElse(List.of());
    }
  }
  public boolean delete(Integer value){
    if (value == null) {
      return false;
    } else{
      productRepository.deleteById(value);
        return true;
    }
      
  }
}
