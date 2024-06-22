package com.ruoyi.service;

import com.ruoyi.pojo.Works;
import com.ruoyi.pojo.vo.UserVo;
import com.ruoyi.pojo.vo.WorksVo;
import com.ruoyi.web.controller.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("作品业务")
public interface WorksService {

    @ApiOperation("查询作品带分页")
    Result list(WorksVo worksVo);

    @ApiOperation("查看作品详情")
    Result getData(Integer id);

    @ApiOperation("添加作品")
    Result add(Works works);
}
