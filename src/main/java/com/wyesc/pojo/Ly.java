package com.wyesc.pojo;

import java.sql.Date;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 留言表
 */
@Data
public class Ly {
  private Integer lyid; //留言id
  private Integer yhid; //用户id
  private String lynr; //留言内容
  private Date lysj; //留言时间
  private Integer lyzt; //留言状态
}
