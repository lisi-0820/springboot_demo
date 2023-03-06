package com.yuan.demo.product.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuan.demo.product.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {

    List<Product> getList();

}
