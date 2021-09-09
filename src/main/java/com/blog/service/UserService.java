package com.blog.service;

import com.blog.po.User;

/**
 * Created by XieXianhui on 2021/09/05.
 */
public interface UserService {

    User checkUser(String username, String password);
}
