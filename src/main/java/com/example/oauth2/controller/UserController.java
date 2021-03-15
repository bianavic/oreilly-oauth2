package com.example.oauth2.controller;

import com.example.oauth2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<User> someUsers = List.of(
            new User(1, "Maria"),
            new User(2, "Joao"),
            new User(3, "Marcos")
    );

    @GetMapping
    public List<User> users() {
        return someUsers;
    }

    @GetMapping("/{id}")
    public User user(@PathVariable("id") String id) {
        return someUsers.stream()
                .filter(user -> Integer.toString(user.getId()).equals(id))
                .findFirst()
                .orElse(null);
    }
}

