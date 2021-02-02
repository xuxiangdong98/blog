package com.xxd.blog.service;

import com.xxd.blog.po.Comment;

import java.util.List;

/**
 * @author xxd
 * @create 2021-02-02 9:39
 */
public interface CommentService {

    /*获取列表*/
    List<Comment> listCommentByBlogId(Long blogId);

    /*保存Comment*/
    Comment savaComment(Comment comment);
}
