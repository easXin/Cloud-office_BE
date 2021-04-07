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
@TableName("t_employee_ec")
@ApiModel(value="TEmployeeEc", description="")
public class TEmployeeEc implements Serializable {
    // fine
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "eid")
    private Integer eid;

    @ApiModelProperty(value = "ecDate")
    private LocalDate ecDate;

    @ApiModelProperty(value = "ecReason")
    private String ecReason;

    @ApiModelProperty(value = "ecPoint")
    private Integer ecPoint;

    @ApiModelProperty(value = "ecType")
    private Integer ecType;

    @ApiModelProperty(value = "remark")
    private String remark;


}
