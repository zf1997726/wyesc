package com.wyesc.dao;
/**
 * 
 * @author 张帆
 * 买车主页
 */

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.wyesc.pojo.Clxq;
import com.wyesc.pojo.Cx;
import com.wyesc.pojo.Pp;
import com.wyesc.pojo.Xxzxb;
import com.wyesc.pojo.Monogram;
import com.wyesc.pojo.MoreOptions;

public interface ACarHomePageMapper {
	//初始化我要买车主页全部
	Page<Clxq> aCarHomePage(Map<String, Object> map);
	//初始化品牌
	List<Pp> selectBrand();
	//初始化首字母 A-G
	List<Monogram> selectAG();
	//初始化首字母 H-O
	List<Monogram> selectHO();
	//初始化首字母Q-Z
	List<Monogram> selectQZ();
	//初始化据首字母查询对应的品牌
	List<Pp> selectPpmByPpszm(String ppszm);
	//初始化展示车系
	List<Cx> selectPpidByCarSeries(Map<String, Object> map); 
	//初始化更多主选项
	List<MoreOptions> selectOptions();
	//初始化更多点击全部出现的主选项
	List<MoreOptions> selectAllOptions();
	//初始化根据主选项的id查询所对应的子选项
	List<Xxzxb> selectXxidByXxzxm(Integer xxid);
	//初始化价格
	List<Xxzxb> selectByXxzxm();
	//根据xxzxb表的xxzxid，去点击xxzxb表的选项，展示信息
	Xxzxb selectByxxid(Integer xxzxid);
	//查询关键字：%年以上%
	List<Xxzxb> selectbyNYS(String xxzxm);
}
