package com.ruoyi.mapper;

import com.ruoyi.pojo.RoleName;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 曾文琪
* @description 针对表【role_name(职位名)】的数据库操作Mapper
* @createDate 2024-06-21 16:37:26
* @Entity com.ruoyi.pojo.RoleName
*/
public interface RoleNameMapper {

    @Schema(title = "查找所有角色数据")
    @Select("select * from role_name")
    List<RoleName> roleData();
}
