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
@TableName("t_appraise")
@ApiModel(value="TAppraise", description="")
public class TAppraise implements Serializable {
    // check
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "eid")
    private Integer eid;

    @ApiModelProperty(value = "appDate")
    private LocalDate appDate;

    @ApiModelProperty(value = "appResult")
    private String appResult;

    @ApiModelProperty(value = "appContent")
    private String appContent;

    @ApiModelProperty(value = "remark")
    private String remark;


}
