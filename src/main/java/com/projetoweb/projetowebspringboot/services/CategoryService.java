package com.projetoweb.projetowebspringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.projetowebspringboot.entities.Category;
import com.projetoweb.projetowebspringboot.repositories.CategoryRepositoty;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepositoty repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
