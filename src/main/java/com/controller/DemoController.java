package com.controller;

import com.Entity.User;
import com.netflix.discovery.converters.Auto;
import com.repo.UserRepo;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DemoController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String demo1()
    {
        return " Demo Project " + "   Jai Shree Ram";

    }

    @PostMapping("/addUser")
    public ResponseEntity<?> addUser(@RequestBody User user)
    {
        User user1 = userRepo.save(user);
        return ResponseEntity.status(HttpStatus.SC_OK).body(user1);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> demo2()
    {
        List<User> user1 = userRepo.findAll();
        return ResponseEntity.status(HttpStatus.SC_OK).body(user1);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<?> getById(@PathVariable int id)
    {
        Optional<User> user1 = userRepo.findById(id);
        return ResponseEntity.status(HttpStatus.SC_OK).body(user1);
    }

}
