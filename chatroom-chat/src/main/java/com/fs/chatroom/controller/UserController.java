package com.fs.chatroom.controller;


import com.fs.chatroom.entity.RespUtils;
import com.fs.chatroom.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getInfoByUserId/{id}")
    public RespUtils<Map> getInfoById(@PathVariable("id") Integer userId){
        //返回用户对应的所有信息，包括用户所属群聊和好友
        Map<String,Object> userMap = userService.getInfoByUserId(userId);
        return RespUtils.success(userMap);
    }

}
