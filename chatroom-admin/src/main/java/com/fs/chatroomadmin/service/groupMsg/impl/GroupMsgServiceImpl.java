package com.fs.chatroomadmin.service.groupMsg.impl;


import com.fs.chatroomadmin.entity.dto.GroupMsgListDto;
import com.fs.chatroomadmin.entity.pojo.GroupMsg;
import com.fs.chatroomadmin.mapper.GroupMsgMapper;
import com.fs.chatroomadmin.service.groupMsg.GroupMsgService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupMsgServiceImpl implements GroupMsgService {

    @Autowired
    private GroupMsgMapper groupMsgMapper;

    @Override
    public PageInfo<GroupMsg> getList(GroupMsgListDto groupMsgListDto) {
        PageHelper.startPage(groupMsgListDto.getPageNum(),groupMsgListDto.getPageSize());
        List<GroupMsg> groupInfoList = groupMsgMapper.queryList(groupMsgListDto.getPageNum(), groupMsgListDto.getPageSize());
        return new PageInfo<>(groupInfoList);
    }
}
