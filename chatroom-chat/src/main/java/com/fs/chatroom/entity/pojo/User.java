package com.fs.chatroom.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * chat_user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    private String userName;
    //用户端不反回密码
//    private String password;
    private String userProfile;
    private Integer userStateId;
    private Integer isEnabled;
    private Date createTime;
    private Date updateTime;

}
