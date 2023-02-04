package com.projetoweb.projetowebspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.projetowebspringboot.entities.Product;

public interface ProductRepositoty extends JpaRepository<Product, Long> {
    
}
