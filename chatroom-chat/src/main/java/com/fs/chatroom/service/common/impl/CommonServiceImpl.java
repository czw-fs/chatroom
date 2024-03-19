package com.fs.chatroom.service.common.impl;

import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import com.fs.chatroom.entity.pojo.FriendMsg;
import com.fs.chatroom.mapper.GroupMsgMapper;
import com.fs.chatroom.mapper.UserMapper;
import com.fs.chatroom.service.common.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private GroupMsgMapper groupMsgMapper;

    @Autowired
    private UserMapper userMapper;


    @Override
    public List getMsgListByChatId(Integer chatId, String chatType) {
        if("friend".equals(chatType)){
            List<FriendMsg> friendMsgList = userMapper.selectCurrentMsgByFriendId(chatId);
            return friendMsgList;
        }else if("group".equals(chatType)){
            List<ChatGroupMsg> chatGroupMsgList = groupMsgMapper.getGroupMsgById(chatId);
            return chatGroupMsgList;
        }
        return null;
    }
}
