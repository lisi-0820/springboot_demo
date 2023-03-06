package com.yuan.demo.product.service.impl;

import com.yuan.demo.product.entity.Product;
import com.yuan.demo.product.mapper.ProductMapper;
import com.yuan.demo.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getList() {
        return productMapper.getList();
    }
}
