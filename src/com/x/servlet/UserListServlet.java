package com.x.servlet;
import com.x.pojo.PageUtils;
import com.x.pojo.User;
import com.x.service.UserService;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class UserListServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //查询条件
        String name = request.getParameter("name");
        name = StringUtils.isEmpty(name) ? "" : name;

        PageUtils page = new PageUtils();

        //总记录数
        Integer count = userService.count(name);
        page.setTotalNumber(count);

        //当前页
        String currpage = request.getParameter("page");
        if(currpage!=null){
            page.setCurrPage(Integer.parseInt(currpage));
        }
        List<User> list = userService.listUser(name, page);
        request.setAttribute("list", list);
        request.setAttribute("name", name);
        request.setAttribute("page", page);
        request.getRequestDispatcher("/sucess.jsp").forward(request, response);
    }

//
//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        //查询条件
//        String account = request.getParameter("account");
//        account = StringUtils.isEmpty(account) ? "" : account;
//
//        //总记录数
//        Integer count = userService.count(account);
//        //总页数
//        Integer pageTotal = 0;
////        if (count % 2 == 0) {
////            pageTotal = count / 2;
////        } else if (count % 2 == 1) {
////            pageTotal = count / 2 + 1;
////        }
//        pageTotal = count % 2 == 0 ? count / 2 : count / 2 + 1;
//
//
//        Integer page = 1;
//        String pageStr = request.getParameter("page");
//        if (!StringUtils.isEmpty(pageStr)) {
//            page = Integer.valueOf(pageStr);
//        }
//
//        //如果前端的页码大于总页数
//        if (page > pageTotal) {
//            page = pageTotal;
//        }
//
//        if (page <= 0) {
//            page = 1;
//        }
//
//        List<User> list = userService.listAll(account, page);
//
//        request.setAttribute("list", list);
//        request.setAttribute("account", account);
//        request.setAttribute("page", page);
//        request.setAttribute("pageTotal", pageTotal);
//        request.setAttribute("count", count);
//        request.getRequestDispatcher("/userList.jsp").forward(request, response);
//    }
}
