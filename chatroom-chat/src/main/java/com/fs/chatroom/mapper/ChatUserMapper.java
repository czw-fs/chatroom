package com.fs.chatroom.mapper;

import com.fs.chatroom.entity.pojo.ChatUser;
import org.apache.ibatis.annotations.Param;

public interface ChatUserMapper {

    ChatUser selectChatUserById(@Param("userId") Integer userId);
}
