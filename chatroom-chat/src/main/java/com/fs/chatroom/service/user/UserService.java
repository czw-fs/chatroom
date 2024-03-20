package com.fs.chatroom.service.user;

import com.fs.chatroom.entity.pojo.User;

import java.util.Map;

public interface UserService {
    User getInfoByUserId(Integer userId);
}
