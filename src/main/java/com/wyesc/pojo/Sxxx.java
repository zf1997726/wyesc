package com.wyesc.pojo;

import java.sql.Date;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 手续信息表
 */
@Data
public class Sxxx {
 private String clbh; //车辆编号:(引用车辆详情表-车辆编号)
 private Integer xsz; //行驶证
 private Integer zlbz;//质量保证
 private Integer djz;//登记证
 private Integer xcfp;//新车发票
 private Integer yss;//钥匙数
 private Integer ghcs;//过户次数
 private Integer ghp;//过户票
 private Date ccrp;//出厂日期
 private Integer cyzt;//车源状态
 private Integer gb;//国别
}
