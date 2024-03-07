package com.fs.chatroomadmin.service.systemUser.impl;

import com.fs.chatroomadmin.entity.dto.SystemUserListDto;
import com.fs.chatroomadmin.entity.pojo.SystemUser;
import com.fs.chatroomadmin.mapper.SystemUserMapper;
import com.fs.chatroomadmin.service.systemUser.SystemUserSerivce;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemUserSerivceImpl implements SystemUserSerivce {

    @Autowired
    private SystemUserMapper systemUserMapper;

    @Override
    public PageInfo<SystemUser> queryList(SystemUserListDto systemUserListDto) {
        PageHelper.startPage(systemUserListDto.getPageNum(),systemUserListDto.getPageSize());
        List<SystemUser> systemUserList = systemUserMapper.queryList(systemUserListDto.getPageNum(),
                                                                      systemUserListDto.getPageSize());
        PageInfo<SystemUser> pageInfo = new PageInfo<>(systemUserList);
        return pageInfo;
    }
}
