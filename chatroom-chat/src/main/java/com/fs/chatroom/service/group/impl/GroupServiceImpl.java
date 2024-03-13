package com.fs.chatroom.service.group.impl;

import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import com.fs.chatroom.mapper.GroupMsgMapper;
import com.fs.chatroom.service.group.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupMsgMapper groupMsgMapper;


    @Override
    public List<ChatGroupMsg> getGroupMsgById(Integer groupId) {
        List<ChatGroupMsg> chatGroupMsgList = groupMsgMapper.getGroupMsgById(groupId);
        return chatGroupMsgList;
    }
}
