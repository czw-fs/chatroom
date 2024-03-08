package com.fs.chatroomadmin.service.UserPrivateMsg.impl;

import com.fs.chatroomadmin.entity.dto.UserPrivateMsgListDto;
import com.fs.chatroomadmin.entity.pojo.SystemUser;
import com.fs.chatroomadmin.entity.pojo.UserPrivateMsg;
import com.fs.chatroomadmin.mapper.UserPrivateMsgMapper;
import com.fs.chatroomadmin.service.UserPrivateMsg.UserPrivateMsgService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPrivateMsgServiceImpl implements UserPrivateMsgService {

    @Autowired
    private UserPrivateMsgMapper userPrivateMsgMapper;

    @Override
    public PageInfo<UserPrivateMsg> getList(UserPrivateMsgListDto userPrivateMsgListDto) {
        PageHelper.startPage(userPrivateMsgListDto.getPageNum(),userPrivateMsgListDto.getPageSize());
        List<UserPrivateMsg> userPrivateMsgList = userPrivateMsgMapper.queryList(userPrivateMsgListDto.getPageNum(),
                userPrivateMsgListDto.getPageSize());
        PageInfo<UserPrivateMsg> pageInfo = new PageInfo<>(userPrivateMsgList);
        return pageInfo;
    }
}
