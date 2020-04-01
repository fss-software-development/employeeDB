package com.user.usermanagement.service;

import com.user.usermanagement.dto.User;

public interface UserService {
    //List<User> getAllUsers();

    User getUser(Long id);
}
