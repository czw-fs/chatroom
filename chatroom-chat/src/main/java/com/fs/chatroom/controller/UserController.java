package com.fs.chatroom.controller;


import com.fs.chatroom.entity.RespUtils;
import com.fs.chatroom.entity.pojo.User;
import com.fs.chatroom.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取用户个人信息
     * @param userId
     * @return
     */
    @GetMapping("/getInfoByUserId/{id}")
    public RespUtils<User> getInfoById(@PathVariable("id") Integer userId){
        User user = userService.getInfoByUserId(userId);
        return RespUtils.success(user);
    }

}
