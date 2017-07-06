package com.khmergroup.security.repository;

import com.khmergroup.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vannaravuth Yo
 * Date : 7/6/2017, 9:43 AM
 * User : Ravuthz
 * Email : ravuthz@gmail.com
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}