package com.ruoyi.web.controller.tool;

/**
 * 统一返回结果状态信息类
 *
 */
public enum ResultCodeEnum {

    SUCCESS(200,"成功"),
    USERNAME_ERROR(501,"账号错误"),
    PASSWORD_ERROR(503,"密码错误"),
    NOTLOGIN(504,"登录已过期"),
    USERNAME_USED(505,"账号存在"),
    UNKNOW_ERROR(506,"未知错误"),
    ALREADY_EXIST(507,"已经存在"),
    NODATA(508,"没有数据");

    private Integer code;
    private String message;
    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public Integer getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
