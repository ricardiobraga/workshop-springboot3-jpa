package com.projetoweb.projetowebspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.projetowebspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
