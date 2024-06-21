package com.ruoyi.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName evaluate
 */
@Data
public class Evaluate implements Serializable {
    private Integer evalId;

    private Integer worksId;

    private Integer userId;

    private String eval1;

    private String eval2;

    private String eval3;

    private String eval4;

    private String eval5;

    private String eval6;

    private Date evalTime;

    private static final long serialVersionUID = 1L;
}