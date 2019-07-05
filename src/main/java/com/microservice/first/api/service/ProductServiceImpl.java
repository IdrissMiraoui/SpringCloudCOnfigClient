package com.microservice.first.api.service;

import com.microservice.first.api.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductServiceImpl implements ProductService {


    @Value("${size.element}")
    public int size;

    @Override
    public List<Product> getListProduct() {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Analyse", "20E"));
        products.add(new Product("Informatics", "50E"));
        products.add(new Product("Informatics2", "50E"));
        products.add(new Product("Informatics3", "50E"));
        products.add(new Product("Informatics4", "50E"));

        return products.stream().limit(size).collect(Collectors.toList());
    }
}
