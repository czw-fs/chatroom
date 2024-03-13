package com.fs.chatroom.mapper;

import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GroupMsgMapper {
    List<ChatGroupMsg> getGroupMsgById(@Param("groupId") Integer groupId);
}
