package com.fs.chatroom.service.initListAndMsg.impl;

import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import com.fs.chatroom.entity.pojo.FriendMsg;
import com.fs.chatroom.entity.pojo.Group;
import com.fs.chatroom.entity.pojo.User;
import com.fs.chatroom.mapper.FriendMsgMapper;
import com.fs.chatroom.mapper.GroupMapper;
import com.fs.chatroom.mapper.GroupMsgMapper;
import com.fs.chatroom.mapper.UserMapper;
import com.fs.chatroom.service.initListAndMsg.InitListAndMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InitListAndMsgServiceImpl implements InitListAndMsgService {

    @Autowired
    private GroupMapper groupMapper;

    @Autowired
    private GroupMsgMapper groupMsgMapper;

    @Autowired
    private FriendMsgMapper friendMsgMapper;

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<Group> getAllGroupList() {
        List<Group> groupList = groupMapper.selectAll();
        return groupList;
    }

    @Override
    public Map<Integer, List<ChatGroupMsg>> getAllGroupMsg() {
        HashMap<Integer, List<ChatGroupMsg>> resultMap = new HashMap<>();

        List<Group> groupList = groupMapper.selectAll();
        for (Group group : groupList) {
            List<ChatGroupMsg> groupMsgList = groupMsgMapper.getGroupMsgById(group.getId());
            resultMap.put(group.getId(),groupMsgList);
        }

        return resultMap;
    }

    @Override
    public List<User> getAllFriendList(Integer userId) {
        List<User> userList = userMapper.selectUserWithoutSelf(userId);
        return userList;
    }

    @Override
    public Map<Integer, List<FriendMsg>> getAllFriendMsg(Integer userId) {
        List<User> userList = userMapper.selectUserWithoutSelf(userId);

        HashMap<Integer, List<FriendMsg>> resultMap = new HashMap<>();
        for (User user : userList) {
            List<FriendMsg> friendMsgList = friendMsgMapper.selectRelationMeMsg(user.getId());
            resultMap.put(user.getId(),friendMsgList);
        }

        return resultMap;
    }
}
