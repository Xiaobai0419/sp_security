package com.xiaobai.springsecurity.service;

import com.xiaobai.springsecurity.model.User;

public interface UserService {

    User findById(int id);

    User findBySso(String sso);

}
