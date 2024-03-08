package com.fs.chatroomadmin.service.robot.impl;

import com.fs.chatroomadmin.entity.dto.RobotListDto;
import com.fs.chatroomadmin.entity.pojo.Robot;
import com.fs.chatroomadmin.entity.pojo.SystemUser;
import com.fs.chatroomadmin.mapper.RobotMapper;
import com.fs.chatroomadmin.service.robot.RobotService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RobotServiceImpl implements RobotService {


    @Autowired
    private RobotMapper robotMapper;

    @Override
    public PageInfo<Robot> getList(RobotListDto robotListDto) {
        PageHelper.startPage(robotListDto.getPageNum(),robotListDto.getPageSize());
        List<Robot> systemUserList = robotMapper.queryList(robotListDto.getPageNum(), robotListDto.getPageSize());
        PageInfo<Robot> pageInfo = new PageInfo<>(systemUserList);
        return pageInfo;
    }
}
