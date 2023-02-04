package com.projetoweb.projetowebspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.projetowebspringboot.entities.Category;

public interface CategoryRepositoty extends JpaRepository<Category, Long> {
    
}
