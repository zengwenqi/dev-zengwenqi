package com.ruoyi.service.Impl;

import com.ruoyi.mapper.RoleNameMapper;
import com.ruoyi.pojo.RoleName;
import com.ruoyi.service.RoleNameService;
import com.ruoyi.web.controller.tool.Result;
import com.ruoyi.web.controller.tool.ResultCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Api("角色业务实现")
@Service
public class RoleNameServiceImpl implements RoleNameService {

    @Autowired(required = false)
    private RoleNameMapper roleNameMapper;

    @ApiOperation("查找所有角色数据")
    @Override
    public Result roleData() {
        List<RoleName> roleNameList = roleNameMapper.roleData();
        if (!(roleNameList.isEmpty())){
            return Result.ok(roleNameList);
        }
        return Result.build(null, ResultCodeEnum.NODATA);
    }
}
