package com.xxd.blog.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xxd
 * @create 2021-01-29 11:42
 */
@Entity
@Table(name = "t_comment")
public class Comment {

    @Id
    @GeneratedValue

    private Long id;
    private String nikename;    //昵称
    private String email;   //邮箱
    private String content; //内容
    private String avatar;  //头像
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime; //创建时间

    /*实体关系*/
    @ManyToOne
    private Blog blog;

    /*自关联关系*/
    @OneToMany(mappedBy = "parentComment")
    private List<Comment> replayComments = new ArrayList<>();

    @ManyToOne
    private Comment parentComment;

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Comment> getReplayComments() {
        return replayComments;
    }

    public void setReplayComments(List<Comment> replayComments) {
        this.replayComments = replayComments;
    }

    public Comment getParentComment() {
        return parentComment;
    }

    public void setParentComment(Comment parentComment) {
        this.parentComment = parentComment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nikename='" + nikename + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
