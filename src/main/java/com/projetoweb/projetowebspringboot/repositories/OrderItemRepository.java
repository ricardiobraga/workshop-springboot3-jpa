package com.projetoweb.projetowebspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.projetowebspringboot.entities.OrderItem;


// @Repository - nesse caso a annotation é opcional pq a interface já está herdando o "JpaRepository"
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
