package com.fs.chatroom.controller;

import com.fs.chatroom.entity.RespUtils;
import com.fs.chatroom.entity.pojo.FriendMsg;
import com.fs.chatroom.service.common.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommonController {

    @Autowired
    private CommonService CommonService;

    @GetMapping("/getMsgListByChatId/{chatId}/{chatType}")
    public RespUtils<List> getMsgListByChatId(@PathVariable("chatId") Integer chatId,@PathVariable("chatType")String chatType){

        // todo 添加消息排序
        List<FriendMsg> currentMsg = CommonService.getMsgListByChatId(chatId,chatType);

        return RespUtils.success(currentMsg);
    }
}
