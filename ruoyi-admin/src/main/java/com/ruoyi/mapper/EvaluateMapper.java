package com.ruoyi.mapper;

import com.ruoyi.pojo.Evaluate;

/**
* @author 曾文琪
* @description 针对表【evaluate(评价信息)】的数据库操作Mapper
* @createDate 2024-06-21 16:37:26
* @Entity com.ruoyi.pojo.Evaluate
*/
public interface EvaluateMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    Evaluate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);

}
