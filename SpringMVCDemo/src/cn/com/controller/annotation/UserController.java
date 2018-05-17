package cn.com.controller.annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.com.vo.User;

/*
 * 推荐使用@Controller注解声明Controller组件，这样可以使得Controller
 * 定义更加灵活，可以不用实现Controller接口请求处理的方法也可以灵活定义
 * 为了使@Controller注解生效，需要在spring的XML配置文件中开启组件扫描定义
 * 并指定Controller所在的包
 * 
 * */
@Controller
@Scope("prototype")
/*
 * @RequestMapping可以用在类定义和方法定义上
 * @RequestMapping标明这个类或方法与那个一个客户请求对应
 * */
@RequestMapping(value="/user")//名称空间  标明这个类或方法与那一个客户请求对应
public class UserController {
	//返回视图和模型的方法
	@RequestMapping("/queryUser")
	public ModelAndView queryUser(HttpServletRequest request,HttpServletResponse response){
		System.out.println("调用queryUser方法.....");
		ModelAndView modelAndView = new ModelAndView("WEB-INF/user/queryUser");
		return modelAndView;
		
	}
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(User user,HttpServletRequest request,HttpServletResponse response){
		System.out.println("调用addUser方法");
		System.out.println(user.getUsername()+"  "+user.getPassword());
		System.out.println("-----------------");
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		return "user/showUser";
		
	}
	@RequestMapping(value="/loginUser",method=RequestMethod.POST)
	public String LoginUser(User user ,HttpServletRequest request,HttpServletResponse response){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+"        "+password);
		return "user/logindemo";
		
		
	}

}
