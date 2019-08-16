package com.alibaba.ssm.service.impl;

import com.alibaba.ssm.dao.IProductDao;
import com.alibaba.ssm.domain.Product;
import com.alibaba.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//声明是service
@Service
//事务
@Transactional
public class ProductServiceimpl implements IProductService {

    @Autowired//自动注入
    private IProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception{
        return productDao.findAll();
    }
}
