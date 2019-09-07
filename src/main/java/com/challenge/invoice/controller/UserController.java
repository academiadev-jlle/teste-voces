package com.challenge.invoice.controller;

import com.challenge.invoice.entity.User;
import com.challenge.invoice.exception.MessageException;
import com.challenge.invoice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService service;

    @GetMapping("/user")
    public List<User> findAll() {
        return service.findAll();
    }

    @PostMapping("/user")
    public User save(User user) throws MessageException {
        return service.save(user);
    }

}
