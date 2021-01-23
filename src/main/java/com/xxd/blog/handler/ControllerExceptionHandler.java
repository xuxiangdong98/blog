package com.xxd.blog.handler;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xxd
 * @create 2021-01-23 13:32
 */
/*拦截所有controller*/
@ControllerAdvice
public class ControllerExceptionHandler {

    /*日志记录：获取日志*/
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /*标识该方法是异常处理*/
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest request,Exception e) throws Exception {
        logger.error("Request URL : {}, Exception : {}", request.getRequestURL(),e);

        /*判断状态是否改变*/
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }

        ModelAndView mav = new ModelAndView();
        mav.addObject("url",request.getRequestURL());
        mav.addObject("exception",e);
        mav.setViewName("error/error");
        return mav;
    }
}
