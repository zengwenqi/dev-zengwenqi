package com.ruoyi.pojo;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @TableName role_name
 */
@Data
@Schema(title = "角色对象")
public class RoleName implements Serializable {
    @Schema(title = "角色id")
    private Integer roleId;

    @Schema(title = "角色")
    private String role;

    private static final long serialVersionUID = 1L;
}