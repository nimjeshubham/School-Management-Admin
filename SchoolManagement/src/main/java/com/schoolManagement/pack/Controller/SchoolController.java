package com.schoolManagement.pack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.School;
import com.schoolManagement.pack.Repositories.SchoolRepo;
import com.schoolManagement.pack.Services.SchoolDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class SchoolController {
	
	@Autowired
	SchoolDao dao;
	
	@RequestMapping("/schoolRegitration")
	public ModelAndView schoolRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("schoolRegitration");
		return mv;
	}
	
	@RequestMapping("/getInfoSchool")
	public ModelAndView getInfoSchool(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("getInfoSchoo");
		return mv;
	}
	
	@RequestMapping("/getOneSchool")
	public ModelAndView getOneSchool(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		School school = dao.get(Integer.parseInt(req.getParameter("schoolID")));
		mv.setViewName("showSchool");
		mv.addObject("school", school);
		return mv;
	}
	
	@RequestMapping("/updateSchool")
	public ModelAndView updateSchool(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		School school = dao.get(Integer.parseInt(req.getParameter("schoolID")));
		mv.setViewName("showSchool");
		mv.addObject("school", school);
		return mv;
	}
	
	@RequestMapping("/deleteSchool")
	public ModelAndView deleteSchool(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		School school = dao.get(Integer.parseInt(req.getParameter("schoolID")));
		mv.setViewName("showSchool");
		mv.addObject("school", school);
		return mv;
	}

}
