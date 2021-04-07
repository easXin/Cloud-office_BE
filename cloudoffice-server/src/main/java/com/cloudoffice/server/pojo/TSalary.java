package com.cloudoffice.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_salary")
@ApiModel(value="TSalary", description="")
public class TSalary implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "basicSalary")
    private Integer basicSalary;

    @ApiModelProperty(value = "bonus")
    private Integer bonus;

    @ApiModelProperty(value = "lunchSalary")
    private Integer lunchSalary;

    @ApiModelProperty(value = "trafficSalary")
    private Integer trafficSalary;

    @ApiModelProperty(value = "allSalary")
    private Integer allSalary;

    @ApiModelProperty(value = "养老金基数")
    private Integer pensionBase;

    @ApiModelProperty(value = "养老金比率")
    private Float pensionPer;

    @ApiModelProperty(value = "启用时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "医疗基数")
    private Integer medicalBase;

    @ApiModelProperty(value = "医疗保险比率")
    private Float medicalPer;

    @ApiModelProperty(value = "公积金基数")
    private Integer accumulationFundBase;

    @ApiModelProperty(value = "公积金比率")
    private Float accumulationFundPer;

    @ApiModelProperty(value = "名称")
    private String name;


}
