package com.fs.chatroomadmin.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 私聊消息
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPrivateMsg {
  private Integer id;
  private String sendUserId;
  private String sendUserName;
  private String sendUserProfile;
  private String receiveUserId;
  private String receiveUserName;
  private String receiveUserProfile;
  private String content;
  private Date sendTime;
  private Integer msgTypeId;
}
