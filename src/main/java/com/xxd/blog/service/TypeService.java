package com.xxd.blog.service;

import com.xxd.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author xxd
 * @create 2021-01-30 10:14
 */
public interface TypeService {

    /*新增*/
    Type saveType(Type type);
    /*查询*/
    Type getType(Long id);
    /*名称查询类型*/
    Type getTypeByName(String name);
    /*分页查询*/
    Page<Type> listType(Pageable pageable);
    /*修改*/
    Type updateType(Long id,Type type);
    /*删除*/
    void deleteType(Long id);


}
