package com.fs.chatroomadmin.service.group.impl;

import com.fs.chatroomadmin.entity.dto.GroupInfoListDto;
import com.fs.chatroomadmin.entity.pojo.GroupInfo;
import com.fs.chatroomadmin.mapper.GroupInfoMapper;
import com.fs.chatroomadmin.service.group.GroupInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GroupInfoServiceImpl implements GroupInfoService {

    @Autowired
    private GroupInfoMapper groupInfoMapper;

    @Override
    public PageInfo<GroupInfo> getList(GroupInfoListDto groupInfoListDto) {
        PageHelper.startPage(groupInfoListDto.getPageNum(),groupInfoListDto.getPageSize());
        List<GroupInfo> groupInfoList = groupInfoMapper.queryList(groupInfoListDto.getPageNum(),
                groupInfoListDto.getPageSize());
        PageInfo<GroupInfo> pageInfo = new PageInfo<>(groupInfoList);
        return pageInfo;
    }
}
