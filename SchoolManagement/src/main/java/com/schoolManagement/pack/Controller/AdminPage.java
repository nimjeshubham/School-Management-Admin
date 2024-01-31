package com.schoolManagement.pack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestClient.Builder;
import org.springframework.web.client.RestClient.RequestBodyUriSpec;
import org.springframework.web.client.RestClient.RequestHeadersUriSpec;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.schoolManagement.pack.Model.Admin;
import com.schoolManagement.pack.Model.Contact;
import com.schoolManagement.pack.Services.AdminDao;
import com.schoolManagement.pack.Services.ContactDao;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AdminPage {
	
	@Autowired
	AdminDao ad;
	
	@Autowired
	ContactDao cDao;
	
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(HttpServletRequest req, HttpServletResponse res) {
    ModelAndView mv = new ModelAndView();
    String admin= req.getParameter("adminID");
    String password= req.getParameter("pass");
	try {
		if(admin.contentEquals("admin") && password.contentEquals("123456")) {
			mv.setViewName("adminPage");
		}
		else {
			Admin adminObj = ad.get(Integer.parseInt(req.getParameter("adminID")));
			if(password.contentEquals(adminObj.getPassword())) {
				mv.setViewName("adminPage");
			}
			else {
				mv.setViewName("somethingWrongEnter1");
			}
		}
		
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter1");
		}
		return mv;
	}
	
   
	@RequestMapping("/userLogin")
	public RedirectView userLogin(HttpServletRequest req , HttpServletResponse res ) {
		RedirectView rv= new RedirectView();
		try {
		
		String url = "http://localhost:8081/SchoolManagement-1/";
		rv.setUrl(url);
		}catch (Exception e) {
			
		}
		
		
		return rv;
	
		
	}
	
	@RequestMapping("/schoolOperations")
	public ModelAndView schoolOperations(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("schoolOperations");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/classOperations")
	public ModelAndView classOperations(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("classOperations");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/teacherOperations")
	public ModelAndView teacherOperations(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("teacherOperations");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/studentOperations")
	public ModelAndView studentOperations(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("studentOperations");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/subjectOperations")
	public ModelAndView subjectOperations(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("subjectOperations");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/marksheetOperations")
	public ModelAndView marksheetOperations(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("marksheetOperations");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Contact contact = new Contact();
		contact.setName(req.getParameter("name"));
		contact.setEmail(req.getParameter("email"));
		contact.setMassage(req.getParameter("massage"));
		cDao.insert(contact);
		mv.setViewName("index");
		return mv;
		
	}


}
