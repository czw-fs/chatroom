package com.fs.chatroomadmin.controller.chatUser;


import com.fs.chatroomadmin.entity.dto.ChatUserListDto;
import com.fs.chatroomadmin.entity.pojo.ChatUser;
import com.fs.chatroomadmin.entity.RespUtils;
import com.fs.chatroomadmin.service.chatUser.ChatUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户详情
 */
@RestController
@RequestMapping("/chat/user")
public class ChatUserController {

    @Autowired
    private ChatUserService chatUserService;

    @GetMapping("/list")
    public RespUtils<Map> list(ChatUserListDto chatUserListDto){
        PageInfo<ChatUser> pageInfo = chatUserService.getList(chatUserListDto);
        Map<String, Object> map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return RespUtils.success(map);
    }

}
