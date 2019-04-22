package com.cnc.blog.pojo;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author xiangt
 */
public class UserInfo {
    private Integer id;
    private String name;
    private String password;
    private String sex;
    private Date birthday;
    private Timestamp creatTime;
    private Timestamp updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UserInfo{" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + ", sex='" + sex + '\'' + ", birthday=" + birthday + ", creatTime=" + creatTime + ", ipdateTime="
                + updateTime + '}';
    }
}
