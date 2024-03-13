package com.fs.chatroom.controller;

import com.fs.chatroom.entity.RespUtils;
import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import com.fs.chatroom.service.group.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/getGroupMsgById/{groupId}")
    public RespUtils<List> getGroupMsgById(@PathVariable("groupId") Integer groupId){

        // todo 添加消息排序
        List<ChatGroupMsg> groupList = groupService.getGroupMsgById(groupId);
        return RespUtils.success(groupList);
    }

}
