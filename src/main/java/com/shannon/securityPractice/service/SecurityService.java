package com.shannon.securityPractice.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}