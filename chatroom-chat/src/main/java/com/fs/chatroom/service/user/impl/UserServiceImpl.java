package com.fs.chatroom.service.user.impl;

import com.fs.chatroom.entity.pojo.User;
import com.fs.chatroom.entity.pojo.Group;
import com.fs.chatroom.mapper.UserMapper;
import com.fs.chatroom.mapper.GroupMapper;
import com.fs.chatroom.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GroupMapper groupMapper;




    @Override
    public Map<String, Object> getInfoByUserId(Integer userId) {
        User user = userMapper.selectChatUserById(userId);

        // todo 目前返回所有group，
        List<Group> groupInfoList = groupMapper.selectAll();

        // todo 目前返回出自己外的所有用户
        List<User> friendList = userMapper.selectUserWithoutSelf(userId);

        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("user", user);
        resultMap.put("friendList",friendList);
        resultMap.put("group",groupInfoList);

        return resultMap;
    }
}
