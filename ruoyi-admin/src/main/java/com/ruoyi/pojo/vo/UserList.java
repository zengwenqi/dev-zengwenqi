package com.ruoyi.pojo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(title = "账号数据集合")
@Data
public class UserList {

    @Schema(title = "角色名")
    private String role;

    @Schema(title = "学校名")
    private String school;

    @Schema(title = "昵称")
    private String nickname;

    @Schema(title = "组名")
    private String group;

    @Schema(title = "账号")
    private String username;
}
