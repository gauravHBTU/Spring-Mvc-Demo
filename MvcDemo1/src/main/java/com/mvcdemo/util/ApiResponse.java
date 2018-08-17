/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvcdemo.util;

import java.io.Serializable;

public class ApiResponse implements Serializable{
    
    protected String msg;
    protected String status;
    protected Object[] data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResponse{" + "msg=" + msg + ", status=" + status + ", data=" + data + '}';
    }
    
    
}
