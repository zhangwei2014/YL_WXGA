package com.company.example.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "base_user")
@GenericGenerator(name = "BASE_USER_GEN", strategy = "enhanced-table",
        parameters = {
                @org.hibernate.annotations.Parameter(name = "table_name", value = "table_generator"),
                @org.hibernate.annotations.Parameter(name = "segment_column_name", value = "segment_name"),
                @org.hibernate.annotations.Parameter(name = "segment_value", value = "user_id"),
                @org.hibernate.annotations.Parameter(name = "value_column_name", value = "next"),
                @org.hibernate.annotations.Parameter(name = "initial_value", value = "1000"),
                @org.hibernate.annotations.Parameter(name = "increment_size", value = "10"),
                @org.hibernate.annotations.Parameter(name = "optimizer", value = "pooled-lo")
        }
)
public class User {

    /**
     * 主键
     */
    private Long userId;

    /**
     * 微信号
     */
    private String weixinNumber;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    @Id
    @GeneratedValue(generator = "BASE_USER_GEN")
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "weixin_number")
    public String getWeixinNumber() {
        return weixinNumber;
    }

    public void setWeixinNumber(String weixinNumber) {
        this.weixinNumber = weixinNumber;
    }


    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "update_date")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
