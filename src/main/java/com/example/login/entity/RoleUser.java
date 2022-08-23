package com.example.login.entity;

import lombok.Data;

import javax.persistence.*;

@Embeddable

@Entity
@Table(name = "users_roles")
public class RoleUser {

    @Column(name = "users_id")
    private Integer userId;

    @Column(name = "roles_id")
    private Integer roleId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
