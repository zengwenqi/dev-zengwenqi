package com.ruoyi.mapper;

import com.ruoyi.pojo.Works;

/**
* @author 曾文琪
* @description 针对表【works(作品)】的数据库操作Mapper
* @createDate 2024-06-21 16:37:26
* @Entity com.ruoyi.pojo.Works
*/
public interface WorksMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);

}
