package com.ruoyi.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName user
 */
@Data
public class User implements Serializable {
    private Integer userId;

    private Integer roleId;

    private Integer groupId;

    private String nickname;

    private String username;

    private String password;

    private String school;

    private static final long serialVersionUID = 1L;
}