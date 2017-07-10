package com.khmergroup.security.repository;

import com.khmergroup.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

/**
 * Created by Vannaravuth Yo
 * Date : 7/6/2017, 9:43 AM
 * User : Ravuthz
 * Email : ravuthz@gmail.com
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    // custom query example and return a stream
    @Query("select c from Customer c where c.email = :email")
    Stream<User> findByEmailReturnStream(@Param("email") String email);
}