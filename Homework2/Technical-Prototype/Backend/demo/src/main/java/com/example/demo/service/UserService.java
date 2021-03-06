package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("fakeDao") UserDao userDao)
    {
        this.userDao = userDao;
    }

    public int addUser(User user)
    {
        return userDao.insertUser(user);
    }

    public List<User> getAllUsers()
    {
        return userDao.selectAllUsers();
    }
}
