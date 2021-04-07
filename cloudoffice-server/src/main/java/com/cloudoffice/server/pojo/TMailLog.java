package com.cloudoffice.server.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_mail_log")
@ApiModel(value="TMailLog", description="")
public class TMailLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "msgId")
    private String msgId;

    @ApiModelProperty(value = "eid")
    private Integer eid;

    @ApiModelProperty(value = "status")
    private Integer status;

    @ApiModelProperty(value = "routeKey")
    private String routeKey;

    @ApiModelProperty(value = "exchange")
    private String exchange;

    @ApiModelProperty(value = "count")
    private Integer count;

    @ApiModelProperty(value = "tryTime")
    private LocalDateTime tryTime;

    @ApiModelProperty(value = "createTime")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "updateTime")
    private LocalDateTime updateTime;


}
