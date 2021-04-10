package com.cloudoffice.server.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

// User Login Pojo
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "AdminLogin",description = "")
public class AdminLoginParam {
    @ApiModelProperty(value="username",required = true)
    private String username;
    @ApiModelProperty(value="password",required = true)
    private String password;

}
