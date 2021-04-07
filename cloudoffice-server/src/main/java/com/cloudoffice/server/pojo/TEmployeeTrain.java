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
@TableName("t_employee_train")
@ApiModel(value="TEmployeeTrain", description="")
public class TEmployeeTrain implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "eid")
    private Integer eid;

    @ApiModelProperty(value = "trainDate")
    private LocalDate trainDate;

    @ApiModelProperty(value = "trainContent")
    private String trainContent;

    @ApiModelProperty(value = "remark")
    private String remark;


}
