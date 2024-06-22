package com.ruoyi.service;

import com.ruoyi.web.controller.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("角色数据业务")
public interface RoleNameService {

    @ApiOperation("查找所有角色数据")
    Result roleData();
}
