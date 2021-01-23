package com.xxd.blog.web;

import com.xxd.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xxd
 * @create 2021-01-23 13:08
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
//        int i = 9/0;
        String blog = null;
        if (blog == null){
            throw new NotFoundException("博客不存在");
        }
        return "index";
    }
}
