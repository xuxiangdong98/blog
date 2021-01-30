package com.xxd.blog.dao;

import com.xxd.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xxd
 * @create 2021-01-30 10:20
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
}
