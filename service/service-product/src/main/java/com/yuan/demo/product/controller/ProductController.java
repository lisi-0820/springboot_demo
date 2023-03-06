package com.yuan.demo.product.controller;

import com.yuan.demo.product.entity.Product;
import com.yuan.demo.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("demo/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("getList")
    public List<Product> getProductList(){
        return productService.getList();
    }
}
