package com.fs.chatroomadmin.controller.group;


import com.fs.chatroomadmin.entity.dto.GroupMsgListDto;
import com.fs.chatroomadmin.entity.pojo.GroupMsg;
import com.fs.chatroomadmin.entity.RespUtils;
import com.fs.chatroomadmin.service.groupMsg.GroupMsgService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 群聊记录
 */

@RestController
@RequestMapping("/group/msg")
public class GroupMsgController {

    @Autowired
    private GroupMsgService groupMsgService;

    @GetMapping("/list")
    public RespUtils<Map> list(GroupMsgListDto groupMsgListDto){
        PageInfo<GroupMsg> pageInfo = groupMsgService.getList(groupMsgListDto);
        Map<String, Object> map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return RespUtils.success(map);
    }

}
