package com.wyesc.pojo;

import java.sql.Date;

import lombok.Data;

@Data
public class Clxq {
   private String clbh; //车辆编号
   private String clm;//车辆名
   private double cljg; //车辆价格
   private double scj; //市场价
   private Date sjsj; //上架时间
   private double pls; //排量数
   private Integer bsx;//变数箱
   private Integer cxx; //车型
   private Integer cx;//车系
   private Integer wbys; //外部颜色
   private Integer nbys; //内部颜色
   private double xslc; //行驶里程
   private Date spsj; //上牌时间
   private Date clnjsj;//车辆年检时间
   private Date syxdq;//商业险到期
   private Date qzxdq; //强制险到期
   private Integer gcfp;//购车发票
   private Integer gzs;//购置税
   private Integer cltj;//车辆推荐
   private Integer djl;//点击量
   private Integer scl;//收藏量
   private Integer sf; //首付
   private Integer fqs;//分期数
   private Integer gb;//国别
   private Integer qdfs;//驱动方式
   private Integer rylx;//燃油类型
   private Integer zws;//座位数
   private Integer pp;//品牌
   private Integer cl;//车龄
}
