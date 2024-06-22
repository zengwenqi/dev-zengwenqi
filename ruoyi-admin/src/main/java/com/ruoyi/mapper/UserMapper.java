package com.ruoyi.mapper;

import com.ruoyi.pojo.User;
import com.ruoyi.pojo.vo.UserList;
import com.ruoyi.pojo.vo.UserVo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
* @author 曾文琪
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2024-06-21 16:37:26
* @Entity com.ruoyi.pojo.User
*/
public interface UserMapper {

    @Schema(title = "查询账户数据带分页带模糊")
    List<UserList> list(@Param("group") String group, @Param("role") String role, @Param("school") String school);

    @Schema(title = "查询是否存在")
    Integer selectCount(@Param("nickname") String nickname);

    @Schema(title = "添加账号数据")
    Integer add(User user);

    @Schema(title = "更新账号数据")
    Integer update(User user);

    @Schema(title = "根据id删除账号数据")
    Integer deleteById(@Param("id") Integer id);
}
