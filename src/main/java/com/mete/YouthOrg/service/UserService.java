package com.mete.YouthOrg.service;


import com.mete.YouthOrg.model.User;

public interface UserService {
    
    User findByUsername(String username);
}
