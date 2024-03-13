package com.fs.chatroom.controller;

import com.fs.chatroom.entity.RespUtils;
import com.fs.chatroom.entity.dto.LoginDto;
import com.fs.chatroom.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/getUserId")
    public RespUtils<Integer> login(@RequestBody LoginDto loginDto){
        Integer userId = loginService.getUserId(loginDto);
        // todo 获取jwt
        return RespUtils.success(userId);
    }

}
