package com.fs.chatroom.service.getMsg;

import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import com.fs.chatroom.entity.pojo.FriendMsg;

import java.util.List;

public interface GetMsgService {
    List<ChatGroupMsg> getGroupMsgById(Integer groupId);

    List<FriendMsg> getFriendMsgById(Integer friendId, Integer curId);
}
