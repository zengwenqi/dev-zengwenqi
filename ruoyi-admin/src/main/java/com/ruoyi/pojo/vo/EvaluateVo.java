package com.ruoyi.pojo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(title = "评价接收配置")
@Data
public class EvaluateVo {

    @Schema(title = "评委名")
    private String vipNickname;

    @Schema(title = "作品名")
    private String worksName;

    @Schema(title = "学校名")
    private String school;

    @Schema(title = "参赛人")
    private String nickname;

    @Schema(title = "报名组别")
    private String group;

    @Schema(title = "页码")
    private Integer pageMa;

    @Schema(title = "页容量")
    private Integer pageSize;
}
