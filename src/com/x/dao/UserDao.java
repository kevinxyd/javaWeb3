package com.x.dao;

import com.x.pojo.User;
import com.x.util.JdbcTemplateUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {

    private JdbcTemplate template = new JdbcTemplate(JdbcTemplateUtil.getDataSource());


    public User login(String name, Integer age) {
        String sql = "select * from sys_user where name = ? and age = ?";
        return template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),name,age);
    }

    public User selectById(Integer id) {
        String sql = "select * from sys_user where id=?";
        return template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),id);
    }

    public void deleteUserById(Integer id) {
        String sql = "delete from sys_user where id=?";
        template.update(sql,id);
    }

    public void updateUser(User user){
        String sql = "update sys_user set name = ? ,age = ?,sex = ? where id = ?";
        template.update(sql, user.getName(), user.getAge(), user.getSex(), user.getId());
    }
    public void addUser(User user) {
        String sql = "insert into sys_user(name,age,sex,create_time) values( ?,?,?,?)";
        template.update(sql, user.getName(), user.getAge(), user.getSex(), user.getCreateTime());
    }

    public List<User> listUser2(String name, Integer age) {
        String sql = "select * from sys_user where name like ? and age> ?";
        return template.query(sql, new BeanPropertyRowMapper<>(User.class), "%" + name + "%", age);
    }

    public List<User> listUser() {
        String sql = "select * from sys_user";
        return template.query(sql, new BeanPropertyRowMapper<>(User.class));
    }
}
