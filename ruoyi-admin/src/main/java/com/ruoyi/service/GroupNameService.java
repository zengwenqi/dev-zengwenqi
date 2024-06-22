package com.ruoyi.service;

import com.ruoyi.web.controller.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("组业务")
public interface GroupNameService {

    @ApiOperation("查找所有小组数据")
    Result groupData();
}
