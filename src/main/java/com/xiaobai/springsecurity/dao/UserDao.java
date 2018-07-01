package com.xiaobai.springsecurity.dao;

import com.xiaobai.springsecurity.model.User;

public interface UserDao {

    User findById(int id);

    User findBySSO(String sso);

}
