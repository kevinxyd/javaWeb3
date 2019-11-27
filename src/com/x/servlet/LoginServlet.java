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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {


    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("utf-8");
        String contextPath = req.getContextPath();
        UserService userService = new UserService();
        String username = req.getParameter("username");
        Integer age = Integer.valueOf(req.getParameter("age"));
        if (username.equals("武大郎")&&age==56){
            User users = userService.login(username, age);

            List<User> listUser = userService.listUser();
            if (users != null){
                req.setAttribute("list",listUser);
                req.getRequestDispatcher(contextPath + "/sucess.jsp").forward(req,resp);
            }else {
                resp.sendRedirect("/index.jsp");
            }
        }

    }
}
