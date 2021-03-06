package com.entity;

import lombok.Data;

import javax.persistence.Transient;
import java.util.Date;

@Data
public class CoffeeFeedBack {

    private int feedbackId;
    private int userId;
    private String feedbackText;
    private  String contactInformation;
    private Date createdTime;
    private Date updateTime;
    private int deletedFlag;

    @Transient
    private Integer pageNum;
    @Transient
    private Integer pageSize;
}
