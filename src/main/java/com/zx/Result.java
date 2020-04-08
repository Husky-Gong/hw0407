package com.zx;

public class Result {

    private Integer code;

    private String msg;

    private Object data;


    public Result() {
        this.code = CodeMsg.SUCCESS.CODE;
        this.msg=CodeMsg.SUCCESS.MSG;
    }
    public Result(Object data) {
        this.code = CodeMsg.SUCCESS.CODE;
        this.msg=CodeMsg.SUCCESS.MSG;
        this.data=data;
    }
    public Result(CodeMsg codeMsg) {
        this.code = codeMsg.CODE;
        this.msg = codeMsg.MSG;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
