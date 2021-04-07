package com.cloudoffice.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_department")
@ApiModel(value="TDepartment", description="")
public class TDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "depName")
    private String depName;

    @ApiModelProperty(value = "parentId")
    private Integer parentId;

    @ApiModelProperty(value = "depPath")
    private String depPath;

    @ApiModelProperty(value = "enabled")
    private Boolean enabled;

    @ApiModelProperty(value = "isSupervisor")
    private Boolean isSupervisor;


}
