package com.wyesc.pojo;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 车系表
 */
@Data
public class Cx {
  private Integer cxid; //车系id
  private String cxm;  //车系名
  private Integer ppid;//品牌id(品牌表品牌id外建引用)
  private Integer rmtj;//热门推荐
  
}
