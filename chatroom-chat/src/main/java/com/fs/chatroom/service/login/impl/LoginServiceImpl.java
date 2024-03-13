package com.fs.chatroom.service.login.impl;

import com.fs.chatroom.entity.dto.LoginDto;
import com.fs.chatroom.entity.pojo.User;
import com.fs.chatroom.mapper.UserMapper;
import com.fs.chatroom.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public Integer getUserId(LoginDto loginDto) {
        User user = userMapper.findUserByUserName(loginDto.getUserName());
        return user.getId();
    }
}
