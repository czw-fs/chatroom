package com.fs.chatroomadmin.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RobotListDto {

    private Integer pageNum;//第几页
    private Integer pageSize;//一页多少条
}
