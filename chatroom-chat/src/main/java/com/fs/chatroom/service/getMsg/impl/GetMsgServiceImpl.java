package com.fs.chatroom.service.getMsg.impl;

import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import com.fs.chatroom.entity.pojo.FriendMsg;
import com.fs.chatroom.mapper.FriendMsgMapper;
import com.fs.chatroom.mapper.GroupMsgMapper;
import com.fs.chatroom.service.getMsg.GetMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetMsgServiceImpl implements GetMsgService {

    @Autowired
    private GroupMsgMapper groupMsgMapper;

    @Autowired
    private FriendMsgMapper friendMsgMapper;


    @Override
    public List<ChatGroupMsg> getGroupMsgById(Integer groupId) {
        List<ChatGroupMsg> chatGroupMsgList = groupMsgMapper.getGroupMsgById(groupId);
        return chatGroupMsgList;
    }

    @Override
    public List<FriendMsg> getFriendMsgById(Integer receiveUserId, Integer sendUserId) {
        List<FriendMsg> friendMsgList = friendMsgMapper.selectCurrentMsgByFriendId(receiveUserId,sendUserId);
        return friendMsgList;
    }

}
