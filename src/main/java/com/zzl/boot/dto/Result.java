package com.zzl.boot.dto;

/**
 * Description:
 * Date: 2018/11/14
 *
 * @author: Eylaine
 */
public class Result<T> {

    private String code;
    private String msg;
    private T data;

    public Result() {

    }

    /**
     * 返回成功时的构造器
     * @param code 返回码
     * @param data 返回结构体
     */
    public Result(String code, T data) {
        this.code = code;
        this.data = data;
    }

    /**
     * 返回错误时的构造器
     * @param code 错误码
     * @param msg 错误信息
     */
    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
