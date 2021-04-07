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
@TableName("t_admin")
@ApiModel(value="TAdmin", description="")
public class TAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "name")
    private String name;

    @ApiModelProperty(value = "phone")
    private String phone;

    @ApiModelProperty(value = "telephone")
    private String telephone;

    @ApiModelProperty(value = "address")
    private String address;

    @ApiModelProperty(value = "enabled")
    private Boolean enabled;

    @ApiModelProperty(value = "username")
    private String username;

    @ApiModelProperty(value = "password")
    private String password;

    @ApiModelProperty(value = "userFace")
    private String userFace;

    @ApiModelProperty(value = "remark")
    private String remark;


}
