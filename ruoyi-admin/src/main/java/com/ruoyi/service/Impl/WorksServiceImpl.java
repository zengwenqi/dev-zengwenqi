package com.ruoyi.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.mapper.WorksMapper;
import com.ruoyi.pojo.Works;
import com.ruoyi.pojo.vo.UserList;
import com.ruoyi.pojo.vo.WorksList;
import com.ruoyi.pojo.vo.WorksVo;
import com.ruoyi.service.WorksService;
import com.ruoyi.web.controller.tool.Result;
import com.ruoyi.web.controller.tool.ResultCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api("作品业务实现")
@Service
public class WorksServiceImpl implements WorksService {

    @Autowired(required = false)
    private WorksMapper worksMapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @ApiOperation("查询作品数据带分页带模糊")
    @Override
    public Result list(WorksVo worksVo) {
        PageHelper.startPage(worksVo.getPageMa(),worksVo.getPageSize());
        List<WorksList> worksList = worksMapper.list(worksVo.getNickname(),worksVo.getWorksName(),worksVo.getSchool());
        PageInfo<WorksList> worksListPageInfo = new PageInfo<>(worksList);
        if (!(worksListPageInfo.getPages()==0)){
            return Result.ok(worksListPageInfo);
        }
        return Result.build(null, ResultCodeEnum.NODATA);
    }

    @Transactional
    @ApiOperation("查看作品详情")
    @Override
    public Result getData(Integer id) {
        WorksList worksList = worksMapper.getData(id);
        if (worksList.getWorksId()==null){
            return Result.build(null,ResultCodeEnum.UNKNOW_ERROR);
        }
        redisTemplate.opsForValue().increment(worksList.getWorksId(),1);
        Integer o = (Integer) redisTemplate.opsForValue().get(worksList.getWorksId());
        Map data = new HashMap<>();
        data.put("data",worksList);
        data.put("values",o);
        return Result.ok(data);
    }

    @Transactional
    @ApiOperation("添加作品数据")
    @Override
    public Result add(Works works) {
        Integer i = worksMapper.add(works);
        if (i==0){
            return Result.build(null,ResultCodeEnum.UNKNOW_ERROR);
        }
        return Result.ok(null);
    }
}
