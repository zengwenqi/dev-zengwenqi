package com.ruoyi.controller;

import com.ruoyi.pojo.Evaluate;
import com.ruoyi.pojo.vo.EvaluateVo;
import com.ruoyi.service.EvaluateService;
import com.ruoyi.web.controller.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("评价管理")
@RestController
@RequestMapping("/zengwenqi/evaluate")
@Slf4j
@SuppressWarnings("all")
public class EvaluateController {

    @Autowired
    private EvaluateService evaluateService;

    @ApiOperation("评价列表带分页带模糊")
    @PostMapping("list")
    public Result list(@RequestBody EvaluateVo evaluateVo){
        Result result = evaluateService.list(evaluateVo);
        return result;
    }


    @ApiOperation("添加评价")
    @PostMapping("add")
    public Result add(@RequestBody Evaluate evaluate){
        Result result = evaluateService.add(evaluate);
        return result;
    }

    @ApiOperation("查看作品详情")
    @GetMapping("{id}")
    public Result search(@PathVariable Integer id){
        Result result = evaluateService.search(id);
        return result;
    }
}
