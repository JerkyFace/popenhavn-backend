package com.golie.popenhavn.api;

import com.golie.popenhavn.core.User.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserApi{
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/user")
    public User user(@RequestParam(value = "email", defaultValue = "@example.com") String email,
                     @RequestParam(value = "userName") String userName) {
        return new User(email, userName);
    }
}