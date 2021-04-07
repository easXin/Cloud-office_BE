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
@TableName("t_sys_msg")
@ApiModel(value="TSysMsg", description="")
public class TSysMsg implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "message_id")
    private Integer mid;

    @ApiModelProperty(value = "message_type")
    private Integer type;

    @ApiModelProperty(value = "toWho")
    private Integer adminid;

    @ApiModelProperty(value = "state")
    private Integer state;


}
