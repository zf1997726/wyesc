package com.wyesc.pojo;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 车辆对比表
 */
@Data
public class Cldb {
	private Integer dbid; //对比id
	private Integer yhid;  //引用用户表-用户id
	private String clbh; //引用车辆详情表-车辆编号
}
