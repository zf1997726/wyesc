package com.wyesc.pojo;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 用户表
 */
@Data
public class Yh {
  private Integer yhid; //用户id
  private String yhm; //用户名
  private String sjhm; //手机号码
  private Integer xb; //性别
  private String mm;  //密码
}
