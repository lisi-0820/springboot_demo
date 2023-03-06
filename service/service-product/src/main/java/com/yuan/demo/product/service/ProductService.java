package com.yuan.demo.product.service;

import com.yuan.demo.product.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

     List<Product> getList();
}
