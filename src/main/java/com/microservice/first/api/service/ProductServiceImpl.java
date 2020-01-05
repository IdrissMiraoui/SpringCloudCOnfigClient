package com.microservice.first.api.service;

import com.microservice.first.FirstApplication;
import com.microservice.first.api.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

@RefreshScope
@Service
public class ProductServiceImpl implements ProductService {


    @Value("#{'${app.list}'.split(',')}")
    private List<String> myList;




    @Override
    public List<Product> getListProduct() {

        if (myList.contains("BB")){
            System.out.println("hello");
        }

        if (myList.contains("DD")){
            System.out.println("hello");
        }

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Analyse", "20E"));
        products.add(new Product("Informatics", "50E"));
        products.add(new Product("Informatics2", "50E"));
        products.add(new Product("Informatics3", "50E"));
        products.add(new Product("Informatics4", "50E"));

        return products.stream().limit(2).collect(Collectors.toList());
    }
}
