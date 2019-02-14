package com.wyesc.pojo;

import lombok.Data;

/**
 * 
 * @author 张帆
 *  图片表
 */
@Data
public class Tp {
 private Integer tpid; //图片id
 private String tplj; //图片路劲
 private String clbh; //车辆编号:(引用车辆详情表-车辆编号)
 private Integer tpwz; //图片位置

}
