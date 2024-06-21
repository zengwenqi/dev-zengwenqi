package com.ruoyi.mapper;

import com.ruoyi.pojo.RoleName;

/**
* @author 曾文琪
* @description 针对表【role_name(职位名)】的数据库操作Mapper
* @createDate 2024-06-21 16:37:26
* @Entity com.ruoyi.pojo.RoleName
*/
public interface RoleNameMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RoleName record);

    int insertSelective(RoleName record);

    RoleName selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleName record);

    int updateByPrimaryKey(RoleName record);

}
