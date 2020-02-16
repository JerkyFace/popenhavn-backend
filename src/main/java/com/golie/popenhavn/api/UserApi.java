package com.golie.popenhavn.api;

import com.golie.popenhavn.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi{
    @GetMapping("/api/user")
    public User user(@RequestParam(value = "email", defaultValue = "@example.com") String email,
                     @RequestParam(value = "userName") String userName) {
        return new User(email, userName);
    }
}