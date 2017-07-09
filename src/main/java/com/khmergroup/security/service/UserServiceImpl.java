package com.khmergroup.security.service;

import com.khmergroup.security.model.Role;
import com.khmergroup.security.model.User;
import com.khmergroup.security.repository.RoleRepository;
import com.khmergroup.security.repository.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Vannaravuth Yo
 * Date : 7/6/2017, 9:46 AM
 * User : Ravuthz
 * Email : ravuthz@gmail.com
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User findUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        logger.debug("findUserByEmail: " + user);
        return user;
//        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        logger.debug("saveUser: " + user);
        userRepository.save(user);
    }

}
