package com.ruoyi.mapper;

import com.ruoyi.pojo.Evaluate;
import com.ruoyi.pojo.vo.EvaluateList;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 曾文琪
* @description 针对表【evaluate(评价信息)】的数据库操作Mapper
* @createDate 2024-06-21 16:37:26
* @Entity com.ruoyi.pojo.Evaluate
*/
public interface EvaluateMapper {

    @Schema(title = "评价列表带分页带模糊")
    List<EvaluateList> list(@Param("vipNickname") String vipNickname,@Param("worksName") String worksName,
                            @Param("school") String school,@Param("nickname") String nickname,@Param("group") String group);

    @Schema(title = "添加评价")
    @Insert("insert into evaluate values (default,#{worksId},#{userId},#{vipNickname},#{eval1},#{eval2},#{eval3},#{eval4},#{eval5},#{eval6},default)")
    Integer add(Evaluate evaluate);

    @Schema(title = "根据id查询数据")
    EvaluateList search(@Param("id") Integer id);
}
