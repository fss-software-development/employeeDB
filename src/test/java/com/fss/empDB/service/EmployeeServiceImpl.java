package com.user.usermanagement.service;

import com.user.usermanagement.dao.UserDaoImpl;
import com.user.usermanagement.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    Logger logger= LoggerFactory.getLogger("UserServiceImpl");
    @Autowired
    private UserDaoImpl userDao;

   /* @Override
    public List<User> getAllUsers() {
        return userDao.findAllById();
    }*/

    @Override
    public User getUser(Long id) {
        logger.info(id+"Inside get User", id);
        User user = userDao.findById(id).get();
        logger.info("User from the DB - {} ", user);
        return user;
    }
}
