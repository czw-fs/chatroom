package com.fs.chatroom.controller;

import com.fs.chatroom.entity.pojo.ChatGroupMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ReceiveAndSendReceiveMsg {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    /**
     * 群发消息
     */
    @MessageMapping("/group/chat")
    public void groupMsg(ChatGroupMsg chatGroupMsg){
        // todo 保存该条群聊消息记录到数据库中




        //转发该条数据
        simpMessagingTemplate.convertAndSend("/topic/group",chatGroupMsg);

    }


    /**
     * 私发消息：friend
     */


}
