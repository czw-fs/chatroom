package com.fs.chatroom.service.group;

import com.fs.chatroom.entity.pojo.ChatGroupMsg;

import java.util.List;

public interface GroupService {
    List<ChatGroupMsg> getGroupMsgById(Integer groupId);
}
