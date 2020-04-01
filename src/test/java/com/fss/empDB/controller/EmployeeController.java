package com.user.usermanagement.controller;

import com.user.usermanagement.dto.User;
import com.user.usermanagement.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    Logger logger= LoggerFactory.getLogger("UserController");

    @Autowired
    private UserService userService;

//    @GetMapping
//    public List<User> getAllUsers(){
//        logger.info("getting users..");
//        return userService.getAllUsers();
//    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        System.out.println("inside user method ");
       return userService.getUser(id);
      //  return null;
    }
}
