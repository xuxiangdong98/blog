package com.xxd.blog.dao;

import com.xxd.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xxd
 * @create 2021-02-02 9:42
 */
public interface CommentRepository extends JpaRepository<Comment,Long> {

   /* List<Comment> findByBlogId(Long blogId, Sort sort);*/
    /*优化评论*/
   List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
