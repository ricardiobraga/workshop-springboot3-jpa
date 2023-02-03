package com.projetoweb.projetowebspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.projetowebspringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
