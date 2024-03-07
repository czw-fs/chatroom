package com.fs.chatroomadmin.mapper;

import com.fs.chatroomadmin.entity.pojo.GroupInfo;

import java.util.List;

public interface GroupInfoMapper {
    List<GroupInfo> queryList(Integer pageNum, Integer pageSize);
}
