package com.cloudoffice.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;


@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_salary_adjust")
@ApiModel(value="TSalaryAdjust", description="")
public class TSalaryAdjust implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "e_id")
    private Integer eid;

    @ApiModelProperty(value = "risingDate")
    private LocalDate risingDate;

    @ApiModelProperty(value = "beforeSalary")
    private Integer beforeSalary;

    @ApiModelProperty(value = "afterSalary")
    private Integer afterSalary;

    @ApiModelProperty(value = "reason")
    private String reason;

    @ApiModelProperty(value = "remark")
    private String remark;


}
