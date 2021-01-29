package com.xxd.blog.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xxd
 * @create 2021-01-29 19:34
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        if (request.getSession().getAttribute("user") == null){
            request.setAttribute("message","亲，您还没有登录，请先登录");
            request.getRequestDispatcher("/admin").forward(request, response);
//            response.sendRedirect("/admin");
            return false;
        }
        return true;
    }
}
