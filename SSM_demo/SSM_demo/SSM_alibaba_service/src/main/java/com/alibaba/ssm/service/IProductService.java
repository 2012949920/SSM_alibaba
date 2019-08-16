package com.alibaba.ssm.service;

import com.alibaba.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll() throws Exception;
}
