package com.xxd.blog.dao;

import com.xxd.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author xxd
 * @create 2021-01-30 10:20
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);

    /*查询分类的博客数目从大到小取size个 Pageable包含排序方法和大小*/
    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
