package com.wyesc.pojo;
/**
 *  更多选项
 * @author 张帆
 *
 */

import java.util.List;

import lombok.Data;
@Data
public class MoreOptions {
	//存放主选项的id
   private Integer xxid;
   private String xxm;
   //存放子选项
   private List<Xxzxb> xxzxbs;

}
