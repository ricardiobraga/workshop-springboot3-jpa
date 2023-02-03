package com.projetoweb.projetowebspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoweb.projetowebspringboot.entities.User;

// @Repository - nesse caso a annotation é opcional pq a interface já está herdando o "JpaRepository"
public interface UserRepository extends JpaRepository<User, Long> {
    
}
