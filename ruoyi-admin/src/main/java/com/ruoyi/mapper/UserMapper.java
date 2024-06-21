package com.ruoyi.mapper;

import com.ruoyi.pojo.User;
import com.ruoyi.pojo.vo.UserList;
import com.ruoyi.pojo.vo.UserVo;
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

    List<UserList> list(@Param("group") String group, @Param("role") String role, @Param("school") String school);
}
