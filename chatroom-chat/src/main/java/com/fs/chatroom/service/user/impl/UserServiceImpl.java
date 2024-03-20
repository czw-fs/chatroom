package com.fs.chatroom.service.user.impl;

import com.fs.chatroom.entity.pojo.User;
import com.fs.chatroom.mapper.GroupMapper;
import com.fs.chatroom.mapper.UserMapper;
import com.fs.chatroom.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GroupMapper groupMapper;




    @Override
    public User getInfoByUserId(Integer userId) {
        User user = userMapper.selectChatUserById(userId);
        return user;
    }
}
