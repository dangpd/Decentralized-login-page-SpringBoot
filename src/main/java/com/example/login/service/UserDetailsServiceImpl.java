package com.example.login.service;

import com.example.login.Repository.UserRepository;
import com.example.login.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
    private UserRepository repo;

    public MyUserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user =repo.findByUserName(username);
        if(user==null){
            throw new UsernameNotFoundException("User not found");
        }
        return new MyUserDetails(user);
    }

    public List<User> listAll() {
        return repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

    public User get(long id) {
        return repo.findById(id).get();
    }

    public void detele(long id) {
        repo.deleteById(id);
    }

    public void find(long id) {
        repo.findById(id);
    }
}
