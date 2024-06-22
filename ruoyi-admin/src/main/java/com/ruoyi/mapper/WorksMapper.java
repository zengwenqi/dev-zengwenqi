package com.ruoyi.mapper;

import com.ruoyi.pojo.Works;
import com.ruoyi.pojo.vo.WorksList;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 曾文琪
* @description 针对表【works(作品)】的数据库操作Mapper
* @createDate 2024-06-21 16:37:26
* @Entity com.ruoyi.pojo.Works
*/
public interface WorksMapper {

    @Schema(title = "查询账户数据带分页带模糊")
    List<WorksList> list(@Param("nickname") String nickname,@Param("worksName") String worksName,@Param("school") String school);

    @Schema(title = "获取指定id的数据")
    WorksList getData(@Param("id") Integer id);

    @Schema(title = "添加作品数据")
    @Insert("insert into works values (default,#{userId},#{worksName},#{phone},null,default,null)")
    Integer add(Works works);
}
