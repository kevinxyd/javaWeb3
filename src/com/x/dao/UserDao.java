package com.x.dao;

import com.x.pojo.PageUtils;
import com.x.pojo.User;
import com.x.util.JdbcTemplateUtil;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {

    private JdbcTemplate template = new JdbcTemplate(JdbcTemplateUtil.getDataSource());


    public User login(String name, Integer age) {
        User user;
        String sql = "select * from sys_user where name = ? and age = ?";
        try{
            user = template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),name,age);
        }catch (EmptyResultDataAccessException e){
            user = null;
        }
        return user;
    }

    public User selectById(Integer id) {
        User user;
        String sql = "select * from sys_user where id=?";
        try{
            user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
        }catch (EmptyResultDataAccessException e){
            user = null;
        }
        return user;
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

    public List<User> listUser(String name, PageUtils page) {
//        String sql = "select * from sys_user where account like '%?%'";
        String sql = "select * from sys_user where name like ? limit ?,?";
        return template.query(sql, new BeanPropertyRowMapper<>(User.class), "%" + name + "%", (page.getCurrPage() - 1) * page.getRows(), page.getRows());
    }
    //查询总记录数
    public Integer count(String name) {
        String sql = "select count(1) from sys_user where name like ?";
        return template.queryForObject(sql, Integer.class, "%" + name + "%");
    }
}
