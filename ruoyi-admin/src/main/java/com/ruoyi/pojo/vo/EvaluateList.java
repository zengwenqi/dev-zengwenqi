package com.ruoyi.pojo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(title = "评价响应配置")
@Data
public class EvaluateList {

    @Schema(title = "评价id")
    private Integer evalId;

    @Schema(title = "学校名")
    private String school;

    @Schema(title = "作品名")
    private String worksName;

    @Schema(title = "参赛人")
    private String nickname;

    @Schema(title = "评委名")
    private String vipNickname;

    @Schema(title = "教学实践")
    private String eval1;

    @Schema(title = "教案")
    private String eval2;

    @Schema(title = "视频资料")
    private String eval3;

    @Schema(title = "专业人才培养方案")
    private String eval4;

    @Schema(title = "课程标准")
    private String eval5;

    @Schema(title = "教材选用")
    private String eval6;

    @Schema(title = "评分时间")
    private String evalTime;
}
