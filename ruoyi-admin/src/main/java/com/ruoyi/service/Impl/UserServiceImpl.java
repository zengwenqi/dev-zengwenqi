package com.ruoyi.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.mapper.UserMapper;
import com.ruoyi.pojo.User;
import com.ruoyi.pojo.vo.UserList;
import com.ruoyi.pojo.vo.UserVo;
import com.ruoyi.service.UserService;
import com.ruoyi.web.controller.tool.Result;
import com.ruoyi.web.controller.tool.ResultCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Api("实现账号业务的接口")
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @ApiOperation("查询账号数据带分页带模糊")
    @Override
    public Result list(UserVo userVo) {
        PageHelper.startPage(userVo.getPageMa(),userVo.getPageSize());
        List<UserList> userList = userMapper.list(userVo.getGroup(),userVo.getRole(),userVo.getSchool());
        PageInfo<UserList> userPageInfo = new PageInfo<>(userList);
        if (!(userPageInfo.getPages()==0)){
            return Result.ok(userPageInfo);
        }
        return Result.build(null,ResultCodeEnum.NODATA);
    }

    @Transactional
    @ApiOperation("添加账号数据")
    @Override
    public Result add(User user) {
        Integer i = userMapper.selectCount(user.getNickname());
        if (i==0){
            Integer o = userMapper.add(user);
            if (o==0){
                return Result.build(null,ResultCodeEnum.UNKNOW_ERROR);
            }
            return Result.ok(null);
        }
        return Result.build(null,ResultCodeEnum.USERNAME_USED);
    }

    @Transactional
    @ApiOperation("更新账号数据")
    @Override
    public Result update(User user) {
        Integer i = userMapper.update(user);
        if (i==0){
            return Result.build(null,ResultCodeEnum.UNKNOW_ERROR);
        }
        return Result.ok(null);
    }

    @Transactional
    @ApiOperation("根据id删除账号数据")
    @Override
    public Result deleteById(Integer id) {
        Integer i = userMapper.deleteById(id);
        if (i==0){
            return Result.build(null,ResultCodeEnum.UNKNOW_ERROR);
        }
        return Result.ok(null);
    }
}
