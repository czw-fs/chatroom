package com.fs.chatroom.service.common;

import com.fs.chatroom.entity.pojo.FriendMsg;

import java.util.List;

public interface CommonService {
    List<FriendMsg> getMsgListByChatId(Integer chatId, String chatType);

}
