package com.fs.chatroomadmin.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupInfo {
    private Integer id;
    private String groupName;
    private String groupIntro;//群简介
    private String createUser;
    private Integer createUserId;
    private Date createTime;
    private Date updateTime;
}
