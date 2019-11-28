package com.x.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter("/*")
public class FilterLogin2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpSession session = request.getSession();
        //获取请求头uri信息
        String uri = request.getRequestURI();
        if (uri.endsWith("index.jsp") || uri.endsWith("login")){
            filterChain.doFilter(request,response);
            return;
        }
        Object user = session.getAttribute("user");
        if (user!=null){
            filterChain.doFilter(request,response);
        } else {
            response.sendRedirect("/index.jsp");
        }
    }
}
