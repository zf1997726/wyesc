package com.wyesc.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wyesc.dao.ACarHomePageMapper;
import com.wyesc.pojo.Clxq;
import com.wyesc.pojo.Cx;
import com.wyesc.pojo.Pp;
import com.wyesc.pojo.Xx;
import com.wyesc.pojo.Xxzxb;
import com.wyesc.pojo.Monogram;
import com.wyesc.pojo.MoreOptions;
import com.wyesc.service.ACarHomePageService;
@Service
@Transactional
public class ACarHomePageServiceImpl  implements ACarHomePageService{
	
	@Autowired
	private  ACarHomePageMapper ahpMapper;	
	
	//初始化我要买车主页全部
	@Override
	public Page<Clxq> aCarHomePage(Map<String, Object> map) {
	 int yeshu=Integer.parseInt(map.get("yeshu").toString());
	 Page<Clxq> page=PageHelper.startPage(yeshu, 2, true, true, false);
	 ahpMapper.aCarHomePage(map);
	  return page;
	}
	//初始化品牌
	@Override
	public List<Pp> selectBrand() {
		
		return ahpMapper.selectBrand();
	}
	//初始化首字母A-G
	@Override
	public List<Monogram> selectAG() {
		// TODO Auto-generated method stub
		return ahpMapper.selectAG();
	}
	//初始化首字母 H-O
	@Override
	public List<Monogram> selectHO() {
		// TODO Auto-generated method stub
		return ahpMapper.selectHO();
	}
	//初始化首字母 Q-Z
	@Override
	public List<Monogram> selectQZ() {
		// TODO Auto-generated method stub
		return ahpMapper.selectQZ();
	}
	//初始化据首字母查询对应的品牌
	@Override
	public List<Pp> selectPpmByPpszm(String ppszm) {
		
		return ahpMapper.selectPpmByPpszm(ppszm);
	}
	//初始化展示车系
	@Override
	public List<Cx> selectPpidByCarSeries(Map<String, Object> map) {
		/*System.out.println("map.................:"+map);*/
		return ahpMapper.selectPpidByCarSeries(map);
	}
	//初始化更多主选项
	@Override
	public List<MoreOptions> selectOptions() {
		// TODO Auto-generated method stub
		return ahpMapper.selectOptions();
	}
	//初始化根据主选项的id查询所对应的子选项
	@Override
	public List<Xxzxb> selectXxidByXxzxm(Integer xxid) {
		// TODO Auto-generated method stub
		return ahpMapper.selectXxidByXxzxm(xxid);
	}
	//初始化更多点击全部出现的主选项
	@Override
	public List<MoreOptions> selectAllOptions() {
		// TODO Auto-generated method stub
		return ahpMapper.selectAllOptions();
	}
	//初始化价格
	@Override
	public List<Xxzxb> selectByXxzxm() {
		// TODO Auto-generated method stub
		return ahpMapper.selectByXxzxm();
	}
	//根据xxzxb表的xxzxid，去点击xxzxb表的选项，展示信息
	@Override
	public Xxzxb selectByxxid(Integer xxzxid) {
		
		return ahpMapper.selectByxxid(xxzxid);
	}
	@Override
	public List<Xxzxb> selectbyNYS(String xxzxm) {
		
		return ahpMapper.selectbyNYS(xxzxm);
	}
	
		
}
