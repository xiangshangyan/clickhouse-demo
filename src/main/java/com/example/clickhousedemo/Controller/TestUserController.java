package com.example.clickhousedemo.Controller;

import com.example.clickhousedemo.entity.User;
import com.example.clickhousedemo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class TestUserController {
    @Resource
    private UserRepository userRepository;

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        User user1 = userRepository.save(user);
        return user1;
    }

    @GetMapping("/{userId}")
    public User getByUserId(@PathVariable String userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.orElse(new User());
    }
}
