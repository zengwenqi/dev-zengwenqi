package com.ruoyi.mapper;

import com.ruoyi.pojo.GroupName;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 曾文琪
* @description 针对表【group_name(小组名)】的数据库操作Mapper
* @createDate 2024-06-21 16:37:27
* @Entity com.ruoyi.pojo.GroupName
*/
public interface GroupNameMapper {

    @Schema(title = "查找所有小组数据")
    @Select("select * from group_name")
    List<GroupName> groupData();


}
