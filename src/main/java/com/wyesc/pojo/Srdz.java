package com.wyesc.pojo;

import java.sql.Date;

import lombok.Data;

/**
 * 
 * @author 张帆
 * 私人定制表
 */
@Data
public class Srdz {
 private Integer srdzid; //私人定制id
 private Integer yhid; //用户id(引用用户表-用户id)
 private Integer ppid;//品牌id(品牌表品牌id外建引用)
 private Integer cxid;//车系id(车系表外建引用-车系id)
 private Integer cl;//车龄
 private Date    gmsj;//购买时间
 private Integer jg;//价格
 private String  qtxq;//其他需求
}
