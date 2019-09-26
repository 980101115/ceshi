package org.spring.springboot.domain;

public class Lcomment {
    public Integer f_id;
    public Integer l_followerid;
    public Integer l_followeeid;
    public Integer l_level;
    public Integer l_id;
    public String l_content;
    public String l_data;
    public String l_followername;
    public String l_followeename;

    public String getL_followername() {
        return l_followername;
    }

    public void setL_followername(String l_followername) {
        this.l_followername = l_followername;
    }

    public String getL_followeename() {
        return l_followeename;
    }

    public void setL_followeename(String l_followeename) {
        this.l_followeename = l_followeename;
    }

    public Integer getF_id() {
        return f_id;
    }

    public void setF_id(Integer f_id) {
        this.f_id = f_id;
    }

    public Integer getL_followerid() {
        return l_followerid;
    }

    public void setL_followerid(Integer l_followerid) {
        this.l_followerid = l_followerid;
    }

    public Integer getL_followeeid() {
        return l_followeeid;
    }

    public void setL_followeeid(Integer l_followeeid) {
        this.l_followeeid = l_followeeid;
    }

    public Integer getL_level() {
        return l_level;
    }

    public void setL_level(Integer l_level) {
        this.l_level = l_level;
    }

    public Integer getL_id() {
        return l_id;
    }

    public void setL_id(Integer l_id) {
        this.l_id = l_id;
    }

    public String getL_content() {
        return l_content;
    }

    public void setL_content(String l_content) {
        this.l_content = l_content;
    }

    public String getL_data() {
        return l_data;
    }

    public void setL_data(String l_data) {
        this.l_data = l_data;
    }
}
