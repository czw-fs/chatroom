package com.fs.chatroom.controller;

import com.fs.chatroom.entity.RespUtils;
import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import com.fs.chatroom.entity.pojo.FriendMsg;
import com.fs.chatroom.service.getMsg.GetMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/msg")
public class GetMsgController {

    @Autowired
    private GetMsgService getMsgService;

    @GetMapping("/getGroupMsg/{groupId}")
    public RespUtils<List> getGroupMsgById(@PathVariable("groupId") Integer groupId){

        // todo 添加消息排序
        List<ChatGroupMsg> groupList = getMsgService.getGroupMsgById(groupId);
        return RespUtils.success(groupList);
    }

    @GetMapping("/getFriendMsg/{receiveUserId}/{sendUserId}")
    public RespUtils<List> getGroupMsgById(@PathVariable("receiveUserId") Integer receiveUserId,@PathVariable("sendUserId") Integer sendUserId){

        // todo 添加消息排序
        List<FriendMsg> groupList = getMsgService.getFriendMsgById(receiveUserId,sendUserId);
        return RespUtils.success(groupList);
    }
}
