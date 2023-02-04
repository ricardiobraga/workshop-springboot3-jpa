package com.projetoweb.projetowebspringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.projetowebspringboot.entities.Product;
import com.projetoweb.projetowebspringboot.repositories.ProductRepositoty;


@Service
public class ProductService {
    
    @Autowired
    private ProductRepositoty repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
