package com.khmergroup.security.repository;

import com.khmergroup.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vannaravuth Yo
 * Date : 7/6/2017, 9:44 AM
 * User : Ravuthz
 * Email : ravuthz@gmail.com
 */

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role);

}