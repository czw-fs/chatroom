package com.fs.chatroomadmin.controller.system;


import com.fs.chatroomadmin.entity.dto.SystemUserListDto;
import com.fs.chatroomadmin.entity.pojo.SystemUser;
import com.fs.chatroomadmin.entity.vo.RespUtils;
import com.fs.chatroomadmin.service.systemUser.SystemUserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/user")
public class SystemUserController {

    @Autowired
    private SystemUserSerivce systemUserSerivce;

    @GetMapping("/list")
    public RespUtils<List<SystemUser>> list(SystemUserListDto systemUserListDto){
        List<SystemUser> systemUserList = systemUserSerivce.queryList(systemUserListDto);
        return RespUtils.success(systemUserList);
    }

}
