package com.xxd.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xxd
 * @create 2021-01-29 19:28
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    @GetMapping("/blogs")
    public String blogs(){
        return "/admin/blogs";
    }
}
