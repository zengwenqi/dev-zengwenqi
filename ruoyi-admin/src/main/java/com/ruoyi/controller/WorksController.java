package com.ruoyi.controller;

import com.ruoyi.pojo.Works;
import com.ruoyi.pojo.vo.UserVo;
import com.ruoyi.pojo.vo.WorksVo;
import com.ruoyi.service.WorksService;
import com.ruoyi.web.controller.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("作品接口api")
@RequestMapping("/zengwenqi/works")
@Slf4j
public class WorksController {

    @Autowired
    private WorksService worksService;

    @ApiOperation("添加作品数据")
    @PostMapping("add")
    public Result add(@RequestBody Works works){
        Result result = worksService.add(works);
        return result;
    }

    @ApiOperation("作品列表查询带分页")
    @PostMapping("list")
    public Result list(@RequestBody WorksVo worksVo){
        log.info("接收到的数据是 {}",worksVo);
        Result result = worksService.list(worksVo);
        return result;
    }

    @ApiOperation("查看作品详情")
    @GetMapping("{id}")
    public Result getData(@PathVariable("id") Integer id){
        Result result = worksService.getData(id);
        return result;
    }
}
