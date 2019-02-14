package com.wyesc.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.expression.Arrays;

import com.wyesc.pojo.Pp;
import com.wyesc.pojo.Xx;
import com.wyesc.pojo.Xxzxb;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;
import com.github.pagehelper.PageInfo;
import com.wyesc.pojo.Clxq;
import com.wyesc.pojo.Cx;
import com.wyesc.pojo.Monogram;
import com.wyesc.pojo.MoreOptions;
import com.wyesc.service.ACarHomePageService;

@Controller
public class ACarHomePageController {
	
	@Autowired
	private ACarHomePageService service;
	
	private Map<String,Object> param=new HashMap<>();
	//初始化车系的map
    private Map<String, Object> Paramppid=new HashMap<>();
	
	@RequestMapping(value="maiche_list")
	public String homepage(Model model,@RequestParam Map<String,Object> map) {
		//初始化分页
		param.put("yeshu", 1);
		System.out.println("map.get(ppid)....:"+map.get("ppid"));
		System.out.println("map.get(cxid)....:"+map.get("cxid"));
		param.put("ppid", map.get("ppid"));
		Paramppid.put("ppid", map.get("ppid"));
		param.put("cxid", map.get("cxid"));
		return "redirect:/duplicateBlock";
	}
	//价格
	@RequestMapping(value="/price")
	public String price(@RequestParam Map<String, Object> map,HttpSession session ,Model model) {
		System.out.println("map.get(p1)....:"+map.get("p1"));
		String[] price=	String.valueOf(map.get("p1")).split("-");
		Integer  cljgfront=Integer.valueOf(price[0]);
		Integer cljgback=Integer.valueOf(price[1]);
		System.out.println("cljgfront.........:"+cljgfront);
		System.out.println("cljgback.........:"+cljgback);
		param.put("cljgfront", cljgfront);
		param.put("cljgback", cljgback);
		model.addAttribute("cljgfront", cljgfront);
		model.addAttribute("cljgback", cljgback);
		/*session.setAttribute("cljgfront", cljgfront);
		session.setAttribute("cljgback", cljgback);*/
		return "redirect:/duplicateBlock";
	}
	//点击 车龄
	@RequestMapping(value = "/vehicleage")
	public String vehicleAge(@RequestParam Map<String, Object> map) {
		Integer cl=0;
		/*System.out.println("map.get(xxzxid)....:"+map.get("xxzxid"));
		System.out.println("map.get(xxzxm)....:"+map.get("xxzxm"));*/
       List<Xxzxb> xxzxm=service.selectbyNYS((String)map.get("xxzxm"));
		System.out.println("xxzxm....:"+xxzxm);
		if(xxzxm.isEmpty()) {
			Xxzxb xxzxbcl=service.selectByxxid(Integer.parseInt(map.get("xxzxid").toString()));
		    System.out.println("xxzxbcl:"+xxzxbcl);
		    if(xxzxbcl.getXxzxm().equals(map.get("xxzxm"))) {
		    	 Integer xxzxbzxm=Integer.parseInt(xxzxbcl.getXxzxm().substring(0, 1).toString());
		    	 System.out.println("xxzxbzxm....:"+xxzxbzxm);
		    	 cl=xxzxbzxm*365;
		    }
		}else {
			cl=99999;
		}
		param.put("yeshu", 1);
	    param.put("xxzxbzxm", cl);
		return "redirect:/duplicateBlock";
	}
	//点击分页
	@RequestMapping(value = "/doPage")
    public String doPage(String pageIndex){
         /*System.out.println("pageIndex............："+pageIndex);*/
         param.put("yeshu",pageIndex);
         return  "redirect:/duplicateBlock";
    }
	
	//重复代码块
    @RequestMapping(value="/duplicateBlock")
    public String duplicateBlock(Model model,@RequestParam Map<String,Object> map) {
    Double  cljgback=(Double)model.asMap().get("cljgback");
    System.out.println("cljgfront----------------------"+cljgback);
     //品牌
   	 List<Pp> listpp=service.selectBrand();
   	 //初始化车系
   	 List<Cx> listcx= service.selectPpidByCarSeries(Paramppid);
   	 /*System.out.println("listcx:........:"+listcx);*/
   	 List<Monogram> listAG = service.selectAG();
   	 List<Monogram> listHO = service.selectHO();
   	 List<Monogram> listQZ = service.selectQZ();	
   	 for (Monogram ag : listAG) {
   		 List<Pp> ppmList = service.selectPpmByPpszm(ag.getPpszm());
   		 ag.setList(ppmList);
   	 }
   	 for (Monogram ho : listHO) {
   		 List<Pp> ppmList = service.selectPpmByPpszm(ho.getPpszm());
   		 ho.setList(ppmList);
   	 }
   	 for (Monogram qz : listQZ) {
   		 List<Pp> ppmList = service.selectPpmByPpszm(qz.getPpszm());
   		 qz.setList(ppmList);
   	 }
    //初始化价格
 	List<Xxzxb> listXxzxm=service.selectByXxzxm();
 	/*System.out.println("listXxzxm..........:"+listXxzxm);*/
   	//初始化更多主选项
   	List<MoreOptions> listmo=service.selectOptions();
   	//初始化更多点击全部出现的主选项
    List<MoreOptions> listmoAll=service.selectAllOptions();
   	for (MoreOptions mo : listmo) {
   		List<Xxzxb> xxzxbList=service.selectXxidByXxzxm(mo.getXxid());
   		mo.setXxzxbs(xxzxbList);
   	}
   	for (MoreOptions mo : listmoAll) {
   		List<Xxzxb> xxzxbList=service.selectXxidByXxzxm(mo.getXxid());
   		mo.setXxzxbs(xxzxbList);
   	}
   	List<Clxq> listClxq=service.aCarHomePage(param);
	//PageInfo对结果进行包装
	PageInfo<Clxq>  page=new PageInfo<>(listClxq);
	System.out.println("page......:"+page);
	//品牌
	model.addAttribute("listpp", listpp);
	//全部品牌A-G H-O Q-Z
	model.addAttribute("listAG", listAG);
	model.addAttribute("listHO", listHO);
	model.addAttribute("listQZ", listQZ);
	//车系
	model.addAttribute("listcx", listcx);
	//价格
	model.addAttribute("listXxzxm", listXxzxm);
	//更多 listmo：九选项   listmoAll：全部选项
	model.addAttribute("listmo", listmo);
	model.addAttribute("listmoAll", listmoAll);
	//车辆详情
	model.addAttribute("listClxq", listClxq);
	//分页
	model.addAttribute("page", page);
    return "maiche_list";
    }
}
