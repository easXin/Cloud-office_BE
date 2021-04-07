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
@TableName("t_menu")
@ApiModel(value="TMenu", description="")
public class TMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "url")
    private String url;

    @ApiModelProperty(value = "path")
    private String path;

    @ApiModelProperty(value = "component")
    private String component;

    @ApiModelProperty(value = "name")
    private String name;

    @ApiModelProperty(value = "iconCls")
    private String iconCls;

    @ApiModelProperty(value = "keepAlive")
    private Boolean keepAlive;

    @ApiModelProperty(value = "requireAuth")
    private Boolean requireAuth;

    @ApiModelProperty(value = "parentId")
    private Integer parentId;

    @ApiModelProperty(value = "enabled")
    private Boolean enabled;


}
