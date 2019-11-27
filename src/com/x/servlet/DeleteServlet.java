package com.x.servlet;

import com.x.pojo.User;
import com.x.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("utf-8");
        Integer id = Integer.valueOf(req.getParameter("id"));
        UserService userService = new UserService();
        userService.deleteUserById(id);
        List<User> listUser = userService.listUser();
        req.setAttribute("list",listUser);
        req.getRequestDispatcher("/sucess.jsp").forward(req,resp);
    }
}
