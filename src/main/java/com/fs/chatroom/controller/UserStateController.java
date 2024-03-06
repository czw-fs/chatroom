package com.fs.chatroom.controller;

import com.fs.chatroom.entity.UserState;
import com.fs.chatroom.service.userState.UserStateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("userState")
public class UserStateController {
    /**
     * 服务对象
     */
    @Resource
    private UserStateService userStateService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserState selectOne(Integer id) {
        return this.userStateService.queryById(id);
    }

}