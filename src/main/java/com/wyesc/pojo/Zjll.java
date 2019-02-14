package com.wyesc.pojo;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 最近浏览表
 */
@Data
public class Zjll {
 private Integer zjllid;//最近浏览id
 private Integer yhid; //引用用户表-用户id
 private String clbh; //引用车辆详情表-车辆编号
}
