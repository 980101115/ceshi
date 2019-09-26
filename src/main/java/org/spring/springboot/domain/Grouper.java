package org.spring.springboot.domain;

public class Grouper {
    private Integer g_id;
    private String g_name;
    private String g_sign;

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getG_sign() {
        return g_sign;
    }

    public void setG_sign(String g_sign) {
        this.g_sign = g_sign;
    }

    public String getG_address() {
        return g_address;
    }

    public void setG_address(String g_address) {
        this.g_address = g_address;
    }

    private String g_address;

}
