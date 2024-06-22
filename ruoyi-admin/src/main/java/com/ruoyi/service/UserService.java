package com.ruoyi.service;

import com.ruoyi.pojo.User;
import com.ruoyi.pojo.vo.UserVo;
import com.ruoyi.web.controller.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("账号数据业务")
public interface UserService {

    @ApiOperation("查询账号带分页带模糊")
    Result list(UserVo userVo);

    @ApiOperation("添加账号")
    Result add(User user);

    @ApiOperation("更新账号")
    Result update(User user);

    @ApiOperation("根据id删除账号数据")
    Result deleteById(Integer id);
}
