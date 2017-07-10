package com.viraj.spring.service;

import com.viraj.spring.model.User;

/**
 * Created by DangerROSS on 7/9/2017.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
