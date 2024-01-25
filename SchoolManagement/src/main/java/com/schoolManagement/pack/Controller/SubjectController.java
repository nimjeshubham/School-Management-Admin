package com.schoolManagement.pack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Model.Subject;
import com.schoolManagement.pack.Services.SclassDao;
import com.schoolManagement.pack.Services.SubjectDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class SubjectController {
	
	@Autowired
	SubjectDao dao;
	
	@RequestMapping("/subjectRegitration")
	public ModelAndView subjectRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("subjectRegitration");
		return mv;
	}
	
	@RequestMapping("/getInfoSubject")
	public ModelAndView getInfoSubject(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		List<Subject> list = dao.getAll();
		mv.setViewName("getInfoSubject");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/updateSubject")
	public ModelAndView updateSubject (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Subject subject = dao.get(Integer.parseInt(req.getParameter("subjectID")));
		mv.setViewName("showSubject");
		mv.addObject("subject", subject);
		return mv;
	}
	
	@RequestMapping("/getOneSubject")
	public ModelAndView getOneSubject (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Subject subject = dao.get(Integer.parseInt(req.getParameter("subjectID")));
		mv.setViewName("showSubject");
		mv.addObject("subject", subject);
		return mv;
	}
	
	@RequestMapping("/deleteSubject")
	public ModelAndView deleteSubject (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Subject subject = dao.get(Integer.parseInt(req.getParameter("subjectID")));
		mv.setViewName("showSubject");
		mv.addObject("subject", subject);
		return mv;
	}
}
