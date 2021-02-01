package com.xxd.blog.service;

import com.xxd.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author xxd
 * @create 2021-01-30 10:14
 */
public interface TagService {

    /*新增*/
    Tag saveTag(Tag tag);
    /*查询*/
    Tag getTag(Long id);
    /*名称查询类型*/
    Tag getTagByName(String name);
    /*分页查询*/
    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    List<Tag> listTagTop(Integer size);

    /*修改*/
    Tag updateTag(Long id,Tag tag);
    /*删除*/
    void deleteTag(Long id);



}
