package com.wyesc.pojo;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 订单表
 */
@Data
public class Dd {
  private Integer ddid;//订单id
  private Integer yhid;//引用用户表-用户id
  private String clbh;//车辆编号：(引用车辆详情表-车辆编号)
}
