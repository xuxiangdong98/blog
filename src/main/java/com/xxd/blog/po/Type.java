package com.xxd.blog.po;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xxd
 * @create 2021-01-29 11:36
 */
@Entity
@Table(name = "t_type")
public class Type {

    @Id
    @GeneratedValue

    private Long id;    //唯一标识
    @NotBlank(message = "分类名称不能为空")
    private String name;    //分类名称

    /*实体类关系*/
    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();

    public Type() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
