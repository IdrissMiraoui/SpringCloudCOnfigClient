package com.microservice.first.api.service;

import com.microservice.first.api.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public List<Product> getListProduct();
}
