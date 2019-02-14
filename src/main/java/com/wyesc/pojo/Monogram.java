package com.wyesc.pojo;

import java.util.List;

import lombok.Data;
/**
 *  存放首字母品牌
 * @author 张帆
 *
 */
@Data
public class Monogram {

  //存放首字母
  private String ppszm;
  //存放品牌名
  private List<Pp> list;
}
