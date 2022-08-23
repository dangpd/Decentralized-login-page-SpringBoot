package com.example.login.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Embeddable;
import javax.transaction.Transactional;
@Repository
public interface RoleUserRepository {
    @Modifying
    @Transactional
    @Query(value = "delete from RoleUser u where u.userId = ?1")
    public int deleteUser(Integer id);
}
