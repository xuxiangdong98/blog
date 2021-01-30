package com.xxd.blog.dao;

import com.xxd.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xxd
 * @create 2021-01-30 10:20
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);
}
