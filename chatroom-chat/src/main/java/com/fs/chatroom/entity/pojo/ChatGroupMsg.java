package com.fs.chatroom.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGroupMsg {
    private Integer id;
    private String msgId;
    private Integer groupId;
    private Integer sendUserId;
    private String sendUserName;
    private String sendUserProfile;
    private Date sendTime;
    private String content;
    private Integer msgTypeId;
}
