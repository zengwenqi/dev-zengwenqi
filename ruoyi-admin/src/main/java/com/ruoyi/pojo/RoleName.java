package com.ruoyi.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName role_name
 */
@Data
public class RoleName implements Serializable {
    private Integer roleId;

    private String role;

    private static final long serialVersionUID = 1L;
}