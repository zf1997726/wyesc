package com.wyesc.pojo;

import java.sql.Date;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 管理员表
 */
@Data
public class Gly {
  private Integer glyid; //管理员id
  private String  glymz; //管理员名字
  private String  glymm; //管理员密码
  private Date drsj;  //登入时间
}
