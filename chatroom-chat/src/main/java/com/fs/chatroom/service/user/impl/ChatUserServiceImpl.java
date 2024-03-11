package com.fs.chatroom.service.user.impl;

import com.fs.chatroom.entity.pojo.ChatUser;
import com.fs.chatroom.entity.pojo.GroupInfo;
import com.fs.chatroom.mapper.ChatUserMapper;
import com.fs.chatroom.mapper.GroupInfoMapper;
import com.fs.chatroom.service.user.ChatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChatUserServiceImpl implements ChatUserService {

    @Autowired
    private ChatUserMapper chatUserMapper;

    @Autowired
    private GroupInfoMapper groupInfoMapper;




    @Override
    public Map<String, Object> getInfoByUserId(Integer userId) {
        ChatUser chatUser = chatUserMapper.selectChatUserById(userId);

        // todo 目前返回所有group，
        List<GroupInfo> groupInfoList = groupInfoMapper.selectAll();

        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("user",chatUser);
        resultMap.put("group",groupInfoList);

        return resultMap;
    }
}
