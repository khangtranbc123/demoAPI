package com.example.demoapi.model;

public class Request {
    String p_cifinfo;
    String p_unq_id;
    String p_udf5;

    public Request(String p_cifinfo, String p_unq_id, String p_udf5) {
        this.p_cifinfo = p_cifinfo;
        this.p_unq_id = p_unq_id;
        this.p_udf5 = p_udf5;
    }

    public String getP_unq_id() {
        return p_unq_id;
    }

    public void setP_unq_id(String p_unq_id) {
        this.p_unq_id = p_unq_id;
    }

    public String getP_udf5() {
        return p_udf5;
    }

    public void setP_udf5(String p_udf5) {
        this.p_udf5 = p_udf5;
    }

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
