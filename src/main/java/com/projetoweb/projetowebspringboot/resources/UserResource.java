package com.projetoweb.projetowebspringboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.projetowebspringboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Ricardo", "ricardo@gmail.com", "41 99104.4444", "1234567");
        return ResponseEntity.ok().body(u);
    }
}
