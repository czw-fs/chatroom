package com.fs.chatroom.mapper;

import com.fs.chatroom.entity.pojo.GroupInfo;

import java.util.List;

public interface GroupInfoMapper {
    List<GroupInfo> queryList(Integer pageNum, Integer pageSize);
}