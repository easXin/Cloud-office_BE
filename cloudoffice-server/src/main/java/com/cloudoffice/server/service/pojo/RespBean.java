package com.cloudoffice.server.service.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private long code;
    private String message;
    private Object obj;

    public static RespBean success(String msg){
        return new RespBean(200, msg, null);
    }
    public static RespBean success(String msg, Object obj){
        return new RespBean(200, msg, obj);
    }
    public static RespBean error(String msg){
        return new RespBean(404, msg, null);
    }
    public static RespBean error(String msg, Object obj){
        return new RespBean(404, msg, obj);
    }
}
