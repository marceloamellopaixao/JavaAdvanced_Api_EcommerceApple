package br.com.fiap.api_ecommerce_apple.services;

import br.com.fiap.api_ecommerce_apple.models.Product;
import br.com.fiap.api_ecommerce_apple.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
}
