package com.fs.chatroomadmin.controller.group;

import com.fs.chatroomadmin.entity.dto.GroupInfoListDto;
import com.fs.chatroomadmin.entity.pojo.GroupInfo;
import com.fs.chatroomadmin.entity.RespUtils;
import com.fs.chatroomadmin.service.group.GroupInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 群组详情
 */

@RestController
@RequestMapping("/group")
public class GroupInfoController {

    @Autowired
    private GroupInfoService groupInfoService;

    @GetMapping("/list")
    public RespUtils<Map>  list(GroupInfoListDto groupInfoListDto){
        PageInfo<GroupInfo> pageInfo = groupInfoService.getList(groupInfoListDto);
        Map<String, Object> map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return RespUtils.success(map);
    }

}
