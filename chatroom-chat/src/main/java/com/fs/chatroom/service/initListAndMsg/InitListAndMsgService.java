package com.fs.chatroom.service.initListAndMsg;

import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import com.fs.chatroom.entity.pojo.FriendMsg;
import com.fs.chatroom.entity.pojo.Group;
import com.fs.chatroom.entity.pojo.User;

import java.util.List;
import java.util.Map;

public interface InitListAndMsgService {


    List<Group> getAllGroupList();

    Map<Integer, List<ChatGroupMsg>> getAllGroupMsg();

    List<User> getAllFriendList(Integer userId);

    Map<Integer, List<FriendMsg>> getAllFriendMsg(Integer userId);
}
