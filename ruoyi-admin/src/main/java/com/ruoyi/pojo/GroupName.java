package com.ruoyi.pojo;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @TableName group_name
 */
@Data
@Schema(title = "组名对象")
public class GroupName implements Serializable {
    @Schema(title = "组id")
    private Integer groupId;

    @Schema(title = "组名")
    private String group;

    private static final long serialVersionUID = 1L;
}