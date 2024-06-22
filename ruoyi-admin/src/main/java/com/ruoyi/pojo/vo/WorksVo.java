package com.ruoyi.pojo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(title = "作品接收参数")
public class WorksVo {

    @Schema(title = "作品名")
    private String worksName;

    @Schema(title = "学校名")
    private String school;

    @Schema(title = "参赛人")
    private String nickname;

    @Schema(title = "页码")
    private Integer pageMa;

    @Schema(title = "页容量")
    private Integer pageSize;
}
