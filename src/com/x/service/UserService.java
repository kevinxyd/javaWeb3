package com.x.service;


import com.x.dao.UserDao;
import com.x.pojo.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public User login(String name, Integer age) {
        return userDao.login(name,age);
    }

    public List<User> listUser() {
        return userDao.listUser();
    }

    public void deleteUserById(Integer id) {
        userDao.deleteUserById(id);
    }

    public User selectById(Integer id) {
        return userDao.selectById(id);
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }
    public void addUser(User user) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        user.setCreateTime(format);
        userDao.addUser(user);
    }
}
