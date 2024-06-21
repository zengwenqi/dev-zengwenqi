package com.ruoyi.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName works
 */
@Data
public class Works implements Serializable {
    private Integer worksId;

    private Integer userId;

    private String worksName;

    private String phone;

    private String scole;

    private Date worksDate;

    private static final long serialVersionUID = 1L;
}