package com.x.servlet;

import com.x.pojo.User;
import com.x.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateList")
public class UpdateListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserService();
        User user = userService.selectById(Integer.valueOf(req.getParameter("id")));
        req.setAttribute("user",user);
        req.getRequestDispatcher("/update.jsp").forward(req,resp);
    }
}
