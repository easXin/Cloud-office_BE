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
@TableName("t_employee")
@ApiModel(value="TEmployee", description="")
public class TEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "eid")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "name")
    private String name;

    @ApiModelProperty(value = "gender")
    private String gender;

    @ApiModelProperty(value = "birthday")
    private LocalDate birthday;

    @ApiModelProperty(value = "idCard")
    private String idCard;

    @ApiModelProperty(value = "marriageStatus")
    private String marriageStatus;

    @ApiModelProperty(value = "nationId")
    private Integer nationId;

    @ApiModelProperty(value = "nativePlace")
    private String nativePlace;

    @ApiModelProperty(value = "politicId")
    private Integer politicId;

    @ApiModelProperty(value = "email")
    private String email;

    @ApiModelProperty(value = "phone")
    private String phone;

    @ApiModelProperty(value = "address")
    private String address;

    @ApiModelProperty(value = "departmentId")
    private Integer departmentId;

    @ApiModelProperty(value = "jobLevelId")
    private Integer jobLevelId;

    @ApiModelProperty(value = "posId")
    private Integer posId;

    @ApiModelProperty(value = "engageForm")
    private String engageForm;

    @ApiModelProperty(value = "topDegree")
    private String topDegree;

    @ApiModelProperty(value = "specialty")
    private String specialty;

    @ApiModelProperty(value = "school")
    private String school;

    @ApiModelProperty(value = "beginDate")
    private LocalDate beginDate;

    @ApiModelProperty(value = "workState")
    private String workState;

    @ApiModelProperty(value = "workID")
    private String workID;

    @ApiModelProperty(value = "contractTerm")
    private Double contractTerm;

    @ApiModelProperty(value = "conversionTime")
    private LocalDate conversionTime;

    @ApiModelProperty(value = "notWorkDate")
    private LocalDate notWorkDate;

    @ApiModelProperty(value = "beginContract")
    private LocalDate beginContract;

    @ApiModelProperty(value = "endContract")
    private LocalDate endContract;

    @ApiModelProperty(value = "workAge")
    private Integer workAge;

    @ApiModelProperty(value = "salaryId")
    private Integer salaryId;


}
