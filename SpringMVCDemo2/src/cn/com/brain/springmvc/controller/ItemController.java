package cn.com.brain.springmvc.controller;
             
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.brain.mybatis.pojo.Items;

@Controller
public class ItemController {

	//入门程序 第一 包类 + 类包+ 方法名
	@RequestMapping(value="/item/itemlist.action")
	public ModelAndView itemList(){
	
		//创建页面需要显示的商品数据
		List<Items> list=new ArrayList<Items>();
		list.add(new Items(1,"1华为"," 荣耀8",2399f,new Date(),"质量好1"));
		list.add(new Items(2,"1华为"," 荣耀8",2399f,new Date(),"质量好2"));
		list.add(new Items(3,"1华为"," 荣耀8",2399f,new Date(),"质量好3"));
		list.add(new Items(4,"1华为"," 荣耀8",2399f,new Date(),"质量好4"));
		list.add(new Items(5,"1华为","荣耀8",2399f,new Date(),"质量好5"));
		list.add(new Items(6,"1华为"," 荣耀8",2399f,new Date(),"质量好6"));
		
		
		for (Items items : list) {
			System.out.println(items);
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemList",list);
		
		modelAndView.setViewName("itemList");
		return modelAndView;
	}
}
