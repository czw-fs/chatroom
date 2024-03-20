package com.fs.chatroom.controller;

import com.fs.chatroom.entity.RespUtils;
import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import com.fs.chatroom.entity.pojo.FriendMsg;
import com.fs.chatroom.entity.pojo.Group;
import com.fs.chatroom.entity.pojo.User;
import com.fs.chatroom.service.initListAndMsg.InitListAndMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/init")
public class InitListAndMsgController {

    @Autowired
    private InitListAndMsgService initListAndMsgService;

    @GetMapping("/getAllGroupList")
    public RespUtils<List<Group>> getAllGroupList(){
        List<Group> groupList = initListAndMsgService.getAllGroupList();
        return RespUtils.success(groupList);
    }

    @GetMapping("/getAllGroupMsg")
    public RespUtils<Map<Integer,List<ChatGroupMsg>>> getAllGroupMsg(){
        Map<Integer,List<ChatGroupMsg>> groupMsgMap = initListAndMsgService.getAllGroupMsg();
        return RespUtils.success(groupMsgMap);
    }

    @GetMapping("/getAllFriendList/{userId}")
    public RespUtils<List<User>> getAllFriendInfo(@PathVariable("userId")Integer userId){
        List<User> friendMsgMap = initListAndMsgService.getAllFriendList(userId);
        return RespUtils.success(friendMsgMap);
    }

    @GetMapping("/getAllFriendMsg/{userId}")
    public RespUtils<Map<Integer, List<FriendMsg>>> getAllFriendMsg(@PathVariable("userId")Integer userId){
        Map<Integer, List<FriendMsg>> friendMsgMap = initListAndMsgService.getAllFriendMsg(userId);
        return RespUtils.success(friendMsgMap);
    }

}
