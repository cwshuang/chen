package com.guanli.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guanli.pojo.Tbaoming;
import com.guanli.pojo.Tgonggao;
import com.guanli.pojo.Tjingdian;
import com.guanli.pojo.Tliuyan;
import com.guanli.pojo.Tuser;
import com.guanli.pojo.Txianlu;
import com.guanli.service.My;


@Controller
public class MyQianTaiController {
	@Autowired
    private My my;

	//旅游景点
	@RequestMapping(value="/jingdianAll.action")
	public String jingdianAll(Model model){
		List<Tjingdian> jingdianList = my.selectJingDian();
		model.addAttribute("jingdianList", jingdianList);
		return "jingdianAll";
	}
	//后台获取景点信息
	@RequestMapping(value="jingdianMana.action")
	public String jingdianMana(Model model){
		List<Tjingdian> jingdianList = my.selectJingDian();
		model.addAttribute("jingdianList", jingdianList);
		  return "forward:/admin/jingdian/jingdianMana.jsp";
	}
	
	
	@RequestMapping(value="/jingdianDetailQian.action")
	public String jingdianAll(Integer id,Model model){
	 Tjingdian jingdian = my.selectJingDianById(id);
		model.addAttribute("jingdian", jingdian);
		return "jingdianDetailQian";
	}
	
	
	//旅游线路
	@RequestMapping(value="/xianluAll.action")
	public String xianluAll(Model model){
		
		List<Txianlu> xianluList = my.selecTxianlu();
		model.addAttribute("xianluList", xianluList);
		return "xianluAll";
	}
	@RequestMapping(value="/xianluDetailQian.action")
	public String xianluAll(Integer id,Model model){
		Txianlu xianlu = my.selectTxianluById(id);
		model.addAttribute("xianlu", xianlu);
		return "xianluDetailQian";
	}
	//注册
	
	@RequestMapping(value="/userReg.action")
	public void userReg(Tuser tuser){
		
		   my.inserTuser(tuser);
	}
	//登录
	@RequestMapping(value="/userLogin.action")
	public String userLogin(String username,String userpw,HttpSession session){
	    Tuser tuser=new Tuser();
	    		tuser.setUsername(username);
	    		tuser.setUserpw(userpw);
		   if (my.selectLogin(tuser)) {
			   session.setAttribute("userType", 1);
			   session.setAttribute("user", username);
			   return "redirect:/common/succ.jsp";
		} 
		return "redirect:/common/fail.jsp";
	}
	//用户退出
	@RequestMapping(value="/userLogout.action")
	public String userLogout(HttpSession session){
		session.invalidate();
		return "redirect:/jingdianAll.action";
	}
	
	//报名
	@RequestMapping(value="/baomingAdd.action")
	public String baomingAdd(Tbaoming tbaoming){
		my.insertTbaoming(tbaoming);
		return "redirect:/common/succ1.jsp";
	}
	//公告
	@RequestMapping(value="/gonggaoAll.action")
	public String gonggaoAll(Model model){
		List<Tgonggao> gonggaoList = my.selectTgonggao();
		model.addAttribute("gonggaoList", gonggaoList);
		return "gonggaoAll";
	}
	
	@RequestMapping(value="/gonggaoDetailQian.action")
	public String gonggaoList(Integer id,Model model){
		Tgonggao gonggao1 = my.selectTgonggaoById(id);
		model.addAttribute("gonggao1", gonggao1);
		return "gonggaoDetailQian";
	}
	//留言
	@RequestMapping(value="/liuyanAll.action")
	public String liuyanAll(Model model){
		List<Tliuyan> liuyanList = my.selectTliuyan();
		model.addAttribute("liuyanList", liuyanList);
		return "liuyanAll";
	}
	
	@RequestMapping(value="/liuyanDetail.action")
	public String liuyanDetai(Integer id,Model model){
		Tliuyan liuyan = my.selectTliuyanById(id);
		model.addAttribute("liuyan",liuyan);
		return "liuyanDetail";
	}
	@RequestMapping(value="/liuyanAdd.action")
	public String liuyanAdd(String neirong,HttpSession session){
		Tliuyan liuyan=new Tliuyan();
		liuyan.setNeirong(neirong);
		liuyan.setLiuyanshi(new Date());

		liuyan.setUserid(my.selectid((String) session.getAttribute("user")));
        my.insertTliuyan(liuyan);
		return "liuyanAdd";
	}
	
	//个人中心
	@RequestMapping(value="/userEdit.action")
	public String userEdit(HttpSession session,Model model){
		Tuser user1 = my.selecTuser((String) session.getAttribute("user"));
		model.addAttribute("user1",user1);
		return "forward:/auser/userinfo/userinfo.jsp";
	}
	//保存信息
	@RequestMapping(value="/userSave.action")
	public String userSave(Tuser user1,HttpSession session){
         my.updateTuser(user1);
         session.invalidate();
		return "forward:/auser/userinfo/succ.jsp";
	}
	
	
	//报名信息
	@RequestMapping(value="/baomingMine.action")
	public String baomingMine(HttpSession session,Model model){
	List<Tbaoming> baomingList = my.selectTbaoming(my.selecTuser((String) session.getAttribute("user")).getUsertel());
		model.addAttribute("baomingList",baomingList);
		return "forward:/auser/baoming/baomingMine.jsp";
	}
	//取消报名
	@RequestMapping(value="/baomingDel.action")
	public String baomingDel(Integer id){
          my.deleteTbaoming(id);
		return "forward:/auser/baoming/baomingMine.jsp";
	}
	
	
	
}
