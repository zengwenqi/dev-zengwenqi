package com.ruoyi.pojo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Schema(title = "作品数据列表")
@Data
public class WorksList {

    @Schema(title = "作品id")
    private String worksId;

    @Schema(title = "学校名")
    private String school;

    @Schema(title = "组名")
    private String group;

    @Schema(title = "作品名")
    private String worksName;

    @Schema(title = "参赛姓名")
    private String nickname;

    @Schema(title = "联系方式")
    private String phone;

    @Schema(title = "实时平均分")
    private String scole;

    @Schema(title = "提交时间")
    private Date worksDate;
}
