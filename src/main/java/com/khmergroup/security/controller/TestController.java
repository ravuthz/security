package com.khmergroup.security.controller;

import com.khmergroup.security.model.Role;
import com.khmergroup.security.model.User;
import com.khmergroup.security.repository.RoleRepository;
import com.khmergroup.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ravuthz on 7/9/17.
 */

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @RequestMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @RequestMapping("/roles")
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }
}
