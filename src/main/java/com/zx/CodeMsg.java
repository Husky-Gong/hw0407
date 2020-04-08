package com.zx;

public enum CodeMsg {

    SUCCESS(200,"success"),
    ERROR(500,"Wrong Info"),
    ;


    Integer CODE;
    String MSG;

    CodeMsg(Integer code,String msg){
        this.CODE = code;
        this.MSG = msg;
    }
}
