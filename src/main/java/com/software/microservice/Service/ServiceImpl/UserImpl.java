package com.software.microservice.Service.ServiceImpl;

import com.software.microservice.Service.UserService;
import com.software.microservice.dao.UserDao;
import com.software.microservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User findUserByID(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public boolean addUser(User user) {
        userDao.save(user);
        return true;
    }

    @Override
    public boolean deleteUser(Integer id) {
        userDao.delete(id);
        return true;
    }
}
