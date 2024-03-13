package com.fs.chatroom.mapper;

import com.fs.chatroom.entity.pojo.Group;

import java.util.List;

public interface GroupMapper {

    List<Group> selectAll();

}