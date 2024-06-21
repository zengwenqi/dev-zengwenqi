package com.ruoyi.pojo;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @TableName user
 */
@Data
@Schema(title = "用户对象")
public class User implements Serializable {
    @Schema(title = "账号id")
    private Integer userId;

    @Schema(title = "角色id")
    private Integer roleId;

    @Schema(title = "组id")
    private Integer groupId;

    @Schema(title = "昵称")
    private String nickname;

    @Schema(title = "账号")
    private String username;

    @Schema(title = "密码")
    private String password;

    @Schema(title = "学校名")
    private String school;

    private static final long serialVersionUID = 1L;
}