package org.spring.springboot.domain;

public class Fcomment {
    private Integer f_id;
    private Integer c_id;
    private Integer u_id;
    private String f_data;
    private String f_content;
    private String u_name;

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public Integer getF_id() {
        return f_id;
    }

    public void setF_id(Integer f_id) {
        this.f_id = f_id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getF_data() {
        return f_data;
    }

    public void setF_data(String f_data) {
        this.f_data = f_data;
    }

    public String getF_content() {
        return f_content;
    }

    public void setF_content(String f_content) {
        this.f_content = f_content;
    }
}
