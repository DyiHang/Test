package cn.com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.com.vo.Dept;

public class HelloWorldController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//request.getParamenter();获取前台表单页面中单个数据
		//request.getParamenterValues();获取前台表单多个值
		String flag = request.getParameter("flag");
		String vn ="";
		if ("admin".equals(flag)) {
			vn="admin/showDept";
			
		} else {
			vn="WEB-INF/showDept";
			
		}
		System.out.println("handleRequest方法调用");
		List<Dept> depts = new ArrayList<Dept>();
		depts.add(new Dept(101,"aaa","A"));
		depts.add(new Dept(102,"bbb","B"));
		depts.add(new Dept(103,"ccc","C"));
		depts.add(new Dept(104,"ddd","D"));
		depts.add(new Dept(105,"eeee","E"));
		ModelAndView mv = new ModelAndView(vn);
		//depts添加到request对象中
		mv.addObject("depts",depts);
		
		return mv;
	}

}
