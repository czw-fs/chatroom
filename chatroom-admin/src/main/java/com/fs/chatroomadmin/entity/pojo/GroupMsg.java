package com.fs.chatroomadmin.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 群消息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupMsg {
    private Integer id;
    private Integer groupId;
    private Integer sendUserId;
    private String sendUserName;
    private String sendUserProfile;
    private Date sendTime;
    private String content;
    private Integer msgTypeId;
}
