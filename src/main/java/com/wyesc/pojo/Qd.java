package com.wyesc.pojo;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 抢订表
 */
@Data
public class Qd {
 private  Integer qdid; //对比id
 private Integer yhid; //用户id（引用用户表-用户id）
 private String clbh; //clbh（引用车辆详情表-车辆编号）

}
