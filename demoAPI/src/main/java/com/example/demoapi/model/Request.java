package com.example.demoapi.model;

public class Request {
    String p_cifinfo;

    public Request(String p_cifinfo) {
        this.p_cifinfo = p_cifinfo;
    }

    public Request() {
    }

    public String getP_cifinfo() {
        return p_cifinfo;
    }

    public void setP_cifinfo(String p_cifinfo) {
        this.p_cifinfo = p_cifinfo;
    }
}
