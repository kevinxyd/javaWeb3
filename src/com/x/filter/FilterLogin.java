/*
package com.x.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(value = "/*",initParams = {@WebInitParam(name ="index" , value = "index.jsp;login")})
public class FilterLogin implements Filter {

    private String excludedPages;
    private String[] excludedPageArray;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        excludedPages = filterConfig.getInitParameter("index");
        if (null!=excludedPages && excludedPages.length()!=0) { // 例外页面不为空
            excludedPageArray = excludedPages.split(String.valueOf(';'));
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        boolean isExcludedPage = false;
        for (String page : excludedPageArray) {// 遍历例外url数组
            // 判断当前URL是否与例外页面相同
            if(request.getServletPath().substring(1).equals(page)){ // 从第2个字符开始取（把前面的/去掉）
                System.out.println(page + ", you're excluded.");
                isExcludedPage = true;
                break;
            }
        }
        if (isExcludedPage) {//在过滤url之外
            filterChain.doFilter(request, response);
        } else {// 不在过滤url之外
            Object user = request.getSession().getAttribute("user");
            if (user == null){
                response.sendRedirect("/index.jsp");
            } else {
                filterChain.doFilter(servletRequest,servletResponse);
            }
        }
    }
}
*/
