package com.microservice.first.api.controller;

import com.microservice.first.api.model.Product;
import com.microservice.first.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;



    @GetMapping(value = "hello")
    public ResponseEntity<List<Product>> getHello() {
        List<Product> value = productService.getListProduct();
        return new ResponseEntity<>(value, HttpStatus.OK);
    }
}
