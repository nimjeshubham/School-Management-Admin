package com.schoolManagement.pack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Admin;
import com.schoolManagement.pack.Services.AdminDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AdminPage {
	
	@Autowired
	AdminDao ad;
	
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(HttpServletRequest req, HttpServletResponse res) {
    ModelAndView mv = new ModelAndView();
    String admin= req.getParameter("adminID");
    String password= req.getParameter("pass");
	try {
		if(admin.contentEquals("admin") && password.contentEquals("password")) {
			mv.setViewName("AdminPage");
		}
		else {
			Admin adminObj = ad.get(Integer.parseInt(req.getParameter("adminID")));
			if(password.contentEquals(adminObj.getPassword())) {
				mv.setViewName("AdminPage");
			}
			else {
				mv.setViewName("somethingWrongEnter");
			}
		}
		
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		return mv;
	}
	
	RestTemplate rest=new RestTemplate();
	@ResponseBody
	@RequestMapping("/userLogin")
	public String userLogin(HttpServletRequest req , HttpServletResponse res ) {
		
		String userID = req.getParameter("userID");
		String password = req.getParameter("pass");  
		String selector = req.getParameter("selector");
		
		String url = "http://localhost:8082/register-user/"+userID+"/"+password+"/"+selector;
		
		rest.getForObject(url, String.class);
		
		return "success";
	
		
	}


}
