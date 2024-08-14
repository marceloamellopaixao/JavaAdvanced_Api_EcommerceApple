package br.com.fiap.api_ecommerce_apple.repositories;

import br.com.fiap.api_ecommerce_apple.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
