package com.x.servlet;

import com.x.pojo.User;
import com.x.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        UserService userService = new UserService();
        String username = req.getParameter("username");
        String age1 = req.getParameter("age");
        System.out.println(age1);
        Integer age =  age1 == null || age1 == "" ? (int)System.currentTimeMillis() : Integer.valueOf(age1);
        User users = userService.login(username, age);
        if (users!=null){
            req.getSession().setAttribute("user",users);
            req.getSession().setMaxInactiveInterval(30*60);
            req.getRequestDispatcher( "/list").forward(req, resp);
        }else {
            resp.sendRedirect("/index.jsp");
        }

    }

}
