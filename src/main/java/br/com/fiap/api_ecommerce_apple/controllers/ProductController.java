package br.com.fiap.api_ecommerce_apple.controllers;

import br.com.fiap.api_ecommerce_apple.models.Product;
import br.com.fiap.api_ecommerce_apple.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping
    public List<Product> findAll(){
        return service.findAll();
    }
}
