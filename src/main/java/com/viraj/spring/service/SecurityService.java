package com.viraj.spring.service;

/**
 * Created by DangerROSS on 7/9/2017.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
