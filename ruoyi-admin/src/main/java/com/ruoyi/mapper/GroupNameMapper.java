package com.ruoyi.mapper;

import com.ruoyi.pojo.GroupName;

/**
* @author 曾文琪
* @description 针对表【group_name(小组名)】的数据库操作Mapper
* @createDate 2024-06-21 16:37:27
* @Entity com.ruoyi.pojo.GroupName
*/
public interface GroupNameMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GroupName record);

    int insertSelective(GroupName record);

    GroupName selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GroupName record);

    int updateByPrimaryKey(GroupName record);

}
