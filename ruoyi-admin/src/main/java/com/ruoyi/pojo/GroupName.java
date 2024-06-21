package com.ruoyi.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName group_name
 */
@Data
public class GroupName implements Serializable {
    private Integer groupId;

    private String group;

    private static final long serialVersionUID = 1L;
}