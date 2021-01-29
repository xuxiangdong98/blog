package com.xxd.blog.service;

import com.xxd.blog.po.User;

/**
 * @author xxd
 * @create 2021-01-29 18:25
 */
public interface UserService {

    User checkUser(String username, String password);
}
