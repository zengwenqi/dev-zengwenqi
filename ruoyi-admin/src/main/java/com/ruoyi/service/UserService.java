package com.ruoyi.service;

import com.ruoyi.pojo.vo.UserVo;
import com.ruoyi.web.controller.tool.Result;
import io.swagger.annotations.ApiOperation;

public interface UserService {

    @ApiOperation("查询账号带分页")
    Result list(UserVo userVo);
}
