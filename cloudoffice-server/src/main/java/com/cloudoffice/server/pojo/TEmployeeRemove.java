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
@TableName("t_employee_remove")
@ApiModel(value="TEmployeeRemove", description="")
public class TEmployeeRemove implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "eid")
    private Integer eid;

    @ApiModelProperty(value = "afterDepId")
    private Integer afterDepId;

    @ApiModelProperty(value = "afterJobId")
    private Integer afterJobId;

    @ApiModelProperty(value = "removeDate")
    private LocalDate removeDate;

    @ApiModelProperty(value = "reason")
    private String reason;

    @ApiModelProperty(value = "remark")
    private String remark;


}
