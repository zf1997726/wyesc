package com.wyesc.pojo;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 收藏表
 */
@Data
public class Sc {
 private Integer scid;//收藏id
 private Integer yhid; //用户id：yhid（引用用户表-用户id）
 private  String clbh;	//clbh:（引用车辆详情表-车辆编号）

}
