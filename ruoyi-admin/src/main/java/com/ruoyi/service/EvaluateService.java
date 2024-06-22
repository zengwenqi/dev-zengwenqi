package com.ruoyi.service;

import com.ruoyi.pojo.Evaluate;
import com.ruoyi.pojo.vo.EvaluateVo;
import com.ruoyi.web.controller.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("评价数据业务")
public interface EvaluateService {

    @ApiOperation("评价列表带分页带模糊")
    Result list(EvaluateVo evaluateVo);

    @ApiOperation("添加评价")
    Result add(Evaluate evaluate);

    @ApiOperation("查询数据")
    Result search(Integer id);
}
