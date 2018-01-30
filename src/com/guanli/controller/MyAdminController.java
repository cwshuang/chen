package com.guanli.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guanli.pojo.QAdmin;
import com.guanli.pojo.Tadmin;
import com.guanli.pojo.Tuser;
import com.guanli.service.MyAdmin;

@Controller
public class MyAdminController {
	@Autowired
	private MyAdmin myadmin;
	@RequestMapping(value="/adminLogin.action")
	public String adminLogin(String username,String userpw,HttpSession session){
	    Tadmin tadmin=new Tadmin();
	    tadmin.setUsername(username);
	    tadmin.setUserpw(userpw);
		   if (myadmin.selectAdminLogin(tadmin)) {
			   session.setAttribute("userType", 0);
			   session.setAttribute("admin", username);
			   session.setAttribute("userpw", userpw);
			   return "redirect:/admin/index.jsp";
		} 
		return "redirect:/common/fail.jsp";
	}
	//退出
	@RequestMapping(value="/adminLogout.action")
	public String userLogout(HttpSession session){
		session.invalidate();
		return "redirect:/login.jsp";
	}
	//修改密码
	@RequestMapping(value="/userPwEdit.action")
	public String userPwEdit(Tadmin tadmin,HttpSession session){
		  tadmin.setUsername((String)session.getAttribute("admin"));
	      myadmin.updatePw(tadmin);
	      session.invalidate();
		return "redirect:/admin/right.jsp";
	  // return "redirect:/login.jsp";
	}
	//会员信息
	@RequestMapping(value="/userMana.action")
	public String userMana(Model model){
		  List<Tuser> userList = myadmin.selectTusers();
		  model.addAttribute("userList",userList);
	  //return "redirect:/admin/user/userMana.jsp";//直接跳转
       return "forward:/admin/user/userMana.jsp";//服务器内部跳转,可以传数据
	}
	//删除会员信息
	@RequestMapping(value="/userDel.action")
	public String userDel(Integer userId){
	   myadmin.deleteUser(userId);
	   return "redirect:/admin/right.jsp";
	}

	//景点信息管理   在MyQianTaiController里面
	
	//景点删除
	@RequestMapping(value="/jingdianDel.action")
	public String jingdianDel(Integer id){
	   myadmin.deleteJingdian(id);
	   return "redirect:/admin/right.jsp";
	}
	//添加景点
	
	
	
	
}
