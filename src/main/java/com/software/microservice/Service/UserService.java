package com.software.microservice.Service;

import com.software.microservice.dao.UserDao;
import com.software.microservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public List<User> findAllUsers();

    public User findUserByID(Integer id);

    public boolean addUser(User user);

    public boolean deleteUser(Integer id);

}
