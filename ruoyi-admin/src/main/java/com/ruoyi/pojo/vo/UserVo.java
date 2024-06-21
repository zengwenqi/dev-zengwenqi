package com.ruoyi.pojo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(title = "接收查询结果和分页数据的对象")
public class UserVo {
    @Schema(title = "角色名")
    private String role;

    @Schema(title = "学校名")
    private String school;

    @Schema(title = "组名")
    private String group;

    @Schema(title = "页容量")
    private Integer pageSize;

    @Schema(title = "页码")
    private Integer pageMa;

}
