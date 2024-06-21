package com.ruoyi.pojo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @TableName evaluate
 */
@Data
@Schema(title = "评价数据对象")
public class Evaluate implements Serializable {

    @Schema(title = "评价id")
    private Integer evalId;

    @Schema(title = "作品id")
    private Integer worksId;

    @Schema(title = "账号id")
    private Integer userId;

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
    private Date evalTime;

    private static final long serialVersionUID = 1L;
}