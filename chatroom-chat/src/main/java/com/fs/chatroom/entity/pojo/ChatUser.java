package com.fs.chatroom.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatUser {

    private Integer id;
    private String userName;
    private String password;
    private String userProfile;
    private Integer userStateId;
    private Integer isEnabled;
    private Date createTime;
    private Date updateTime;

}
