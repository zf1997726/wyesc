package com.wyesc.pojo;

import java.util.List;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 品牌表
 */
@Data
public class Pp {
	 private Integer ppid; //品牌id
	 private String ppm; //品牌名
	 private String ppszm; //品牌首字母
	 private Integer gb; //国别
	 private Integer pppx; //品牌排序
	 private List<Cx> list;

}
