package com.wyesc.pojo;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 看车地点表
 */
@Data
public class Kcdd {
 private Integer  ddid; //地点id
 private Integer dqid; //地区id
 private double x;	 //x
 private double y; //y
 private String kcddm; //看车地点名
}
