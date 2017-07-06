package com.khmergroup.security.service;

import com.khmergroup.security.model.User;

/**
 * Created by Vannaravuth Yo
 * Date : 7/6/2017, 9:45 AM
 * User : Ravuthz
 * Email : ravuthz@gmail.com
 */

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}