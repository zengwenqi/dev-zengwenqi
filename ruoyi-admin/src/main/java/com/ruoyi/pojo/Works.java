package com.ruoyi.pojo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @TableName works
 */
@Data
@Schema(title = "作品对象")
public class Works implements Serializable {
    @Schema(title = "作品id")
    private Integer worksId;

    @Schema(title = "账号id")
    private Integer userId;

    @Schema(title = "作品名")
    private String worksName;

    @Schema(title = "电话")
    private String phone;

    @Schema(title = "分数")
    private String scole;

    @Schema(title = "提交时间")
    private Date worksDate;

    private static final long serialVersionUID = 1L;
}