package com.fs.chatroom.service.user;

import java.util.Map;

public interface ChatUserService {
    Map<String,Object> getInfoByUserId(Integer userId);
}
