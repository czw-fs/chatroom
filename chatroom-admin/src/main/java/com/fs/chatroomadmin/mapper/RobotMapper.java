package com.fs.chatroomadmin.mapper;

import com.fs.chatroomadmin.entity.pojo.Robot;

import java.util.List;

public interface RobotMapper {

    List<Robot> queryList(Integer pageNum, Integer pageSize);
}
