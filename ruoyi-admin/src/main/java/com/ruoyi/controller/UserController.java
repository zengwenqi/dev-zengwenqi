package com.ruoyi.controller;

import com.ruoyi.pojo.vo.UserVo;
import com.ruoyi.service.UserService;
import com.ruoyi.web.controller.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("账号管理")
@RestController
@RequestMapping("/zengwenqi/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;


    @ApiOperation("账号列表并查询带分页")
    @PostMapping("list")
    public Result list(@RequestBody UserVo userVo){
        log.info("接收到的数据是 {}",userVo);
        Result result = userService.list(userVo);
        return result;
    }

}
