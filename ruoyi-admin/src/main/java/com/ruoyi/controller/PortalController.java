package com.ruoyi.controller;

import com.ruoyi.service.GroupNameService;
import com.ruoyi.service.RoleNameService;
import com.ruoyi.web.controller.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("公共请求数据的api")
@RestController
@RequestMapping("/zengwenqi/portal")
public class PortalController {

    @Autowired
    private GroupNameService groupNameService;

    @Autowired
    private RoleNameService roleNameService;


    @ApiOperation("小组下拉框数据")
    @GetMapping("groupData")
    public Result groupData(){
        Result result = groupNameService.groupData();
        return result;
    }

    @ApiOperation("角色下拉框数据")
    @GetMapping("roleData")
    public Result roleData(){
        Result result = roleNameService.roleData();
        return result;
    }

}
