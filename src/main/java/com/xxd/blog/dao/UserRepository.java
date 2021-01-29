package com.xxd.blog.dao;

import com.xxd.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xxd
 * @create 2021-01-29 18:27
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);
}
