package com.xxd.blog.web;

import com.xxd.blog.service.BlogService;
import com.xxd.blog.service.TagService;
import com.xxd.blog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xxd
 * @create 2021-01-23 13:08
 */
@Controller
public class IndexController {

    private static final Integer TYPETOP_SIZE = 6;
    private static final Integer TAGTOP_SIZE = 10;
    private static final Integer BLOGTOP_SIZE = 8;

    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private TagService tagService;

    @GetMapping("/")
    public String index(@PageableDefault(size = 6, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable
            , Model model) {
        model.addAttribute("page", blogService.listBlog(pageable));
        model.addAttribute("types", typeService.listTypeTop(TYPETOP_SIZE));
        model.addAttribute("tags", tagService.listTagTop(TAGTOP_SIZE));
        model.addAttribute("recommendBlogs", blogService.listRecommendBlogTop(BLOGTOP_SIZE));
        return "index";
    }

    /*首页查询列表*/
    @PostMapping("/search")
    public String search(@PageableDefault(size = 6, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable
                        ,@RequestParam String query, Model model) {

        model.addAttribute("page",blogService.listBlog("%"+query+"%",pageable));
        model.addAttribute("query",query);
        return "search";
    }


    /*博客详情*/
    @GetMapping("/blog/{id}")
    public String blog(@PathVariable Long id,Model model) {
        model.addAttribute("blog",blogService.getAndConvert(id));
        return "blog";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
