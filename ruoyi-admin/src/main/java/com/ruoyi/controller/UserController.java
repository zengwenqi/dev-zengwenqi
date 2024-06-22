package com.ruoyi.controller;

import com.ruoyi.pojo.User;
import com.ruoyi.pojo.vo.UserVo;
import com.ruoyi.service.UserService;
import com.ruoyi.web.controller.tool.Result;
import com.ruoyi.web.controller.tool.ResultCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Api("账号管理")
@RestController
@RequestMapping("/zengwenqi/user")
@Slf4j
public class UserController {

    @Value("${file.upload-file}")
    private String uploadDir;

    @Autowired
    private UserService userService;

    @ApiOperation("账号列表并查询带分页带模糊")
    @PostMapping("list")
    public Result list(@RequestBody UserVo userVo){
        log.info("接收到的数据是 {}",userVo);
        Result result = userService.list(userVo);
        return result;
    }

    @ApiOperation("账号新增")
    @PostMapping("add")
    public Result add(@RequestBody User user){
        Result result = userService.add(user);
        return result;
    }

    @ApiOperation("账号数据更新")
    @PutMapping("update")
    public Result update(@RequestBody User user){
        log.info("收到的数据是 {}",user);
        Result result = userService.update(user);
        return result;
    }

    @ApiOperation("删除数据")
    @DeleteMapping("delete/{id}")
    public Result deleteById(@PathVariable Integer id){
        Result result = userService.deleteById(id);
        return result;
    }

    @ApiOperation("接收文件上传的数据")
    @PostMapping("upload")
    public Result upload(@RequestParam("file") MultipartFile file){
        try {
            java.util.UUID uuid = UUID.randomUUID();
            String originalFilename = file.getOriginalFilename();
            String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
            Path filePath = Paths.get(uploadDir + "/" + uuid + extension);
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
            String urlImg = uuid + extension;
            return Result.ok(urlImg.toString());
        } catch (IOException e) {
            return Result.build(null, ResultCodeEnum.UNKNOW_ERROR);
        }
    }

}
