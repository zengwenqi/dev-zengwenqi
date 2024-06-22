package com.ruoyi.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.mapper.EvaluateMapper;
import com.ruoyi.pojo.Evaluate;
import com.ruoyi.pojo.vo.EvaluateList;
import com.ruoyi.pojo.vo.EvaluateVo;
import com.ruoyi.service.EvaluateService;
import com.ruoyi.web.controller.tool.Result;
import com.ruoyi.web.controller.tool.ResultCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Api("评价数据业务实现")
@Service
public class EvaluateServiceImpl implements EvaluateService {

    @Autowired(required = false)
    private EvaluateMapper evaluateMapper;

    @ApiOperation("评价列表带分页带模糊")
    @Override
    public Result list(EvaluateVo evaluateVo) {
        PageHelper.startPage(evaluateVo.getPageMa(),evaluateVo.getPageSize());
        List<EvaluateList> evaluateListList = evaluateMapper.list(evaluateVo.getVipNickname(),
                evaluateVo.getWorksName(),evaluateVo.getSchool(),evaluateVo.getNickname(),evaluateVo.getGroup());
        PageInfo<EvaluateList> evaluateListPageInfo = new PageInfo<>(evaluateListList);
        if (!(evaluateListPageInfo.getPages()==0)){
            return Result.ok(evaluateListPageInfo);
        }
        return Result.build(null, ResultCodeEnum.NODATA);
    }

    @ApiOperation("添加评价")
    @Transactional
    @Override
    public Result add(Evaluate evaluate) {
        Integer i = evaluateMapper.add(evaluate);
        if (i==0){
            return Result.build(null,ResultCodeEnum.UNKNOW_ERROR);
        }
        return Result.ok(null);
    }

    @ApiOperation("查询数据")
    @Override
    public Result search(Integer id) {
        EvaluateList evaluateList = evaluateMapper.search(id);
        if (evaluateList.getEvalId()==null){
            return Result.build(null,ResultCodeEnum.UNKNOW_ERROR);
        }
        return Result.ok(evaluateList);
    }
}
