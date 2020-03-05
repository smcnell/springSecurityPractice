package com.shannon.securityPractice.service;

import com.shannon.securityPractice.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}