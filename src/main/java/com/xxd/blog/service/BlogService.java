package com.xxd.blog.service;

import com.xxd.blog.po.Blog;
import com.xxd.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author xxd
 * @create 2021-01-30 16:06
 */
public interface BlogService {

    Blog getBlog(Long id);

    /*markdown转换html*/
    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(Long tagId,Pageable pageable);

    /*博客首页查询*/
    Page<Blog> listBlog(String query,Pageable pageable);

    List<Blog> listRecommendBlogTop(Integer size);

    /*归档查询*/
    Map<String,List<Blog>> archiveBlog();

    /*博客总条数*/
    Long countBlog();

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id,Blog blog);

    void deleteBlog(Long id);

}
