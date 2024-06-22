package com.ruoyi.service.Impl;

import com.ruoyi.mapper.GroupNameMapper;
import com.ruoyi.pojo.GroupName;
import com.ruoyi.service.GroupNameService;
import com.ruoyi.web.controller.tool.Result;
import com.ruoyi.web.controller.tool.ResultCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Api("组业务实现")
@Service
public class GroupNameServiceImpl implements GroupNameService {

    @Autowired(required = false)
    private GroupNameMapper groupNameMapper;

    @ApiOperation("查找所有小组数据")
    @Override
    public Result groupData() {
        List<GroupName> groupNameList = groupNameMapper.groupData();
        if (!(groupNameList.isEmpty())){
            return Result.ok(groupNameList);
        }
        return Result.build(null, ResultCodeEnum.NODATA);
    }
}
