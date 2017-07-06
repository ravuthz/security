package com.khmergroup.security.model;

/**
 * Created by Vannaravuth Yo
 * Date : 7/6/2017, 9:43 AM
 * User : Ravuthz
 * Email : ravuthz@gmail.com
 */

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id")
    private int id;
    @Column(name="role")
    private String role;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }


}
