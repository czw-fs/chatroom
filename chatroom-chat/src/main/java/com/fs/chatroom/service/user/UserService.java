package com.fs.chatroom.service.user;

import java.util.Map;

public interface UserService {
    Map<String,Object> getInfoByUserId(Integer userId);
}
