package com.fs.chatroomadmin.entity.dto;

import com.fs.chatroomadmin.entity.pojo.GroupInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupInfoListDto {

    private Integer pageNum;//第几页
    private Integer pageSize;//一页多少条

}
