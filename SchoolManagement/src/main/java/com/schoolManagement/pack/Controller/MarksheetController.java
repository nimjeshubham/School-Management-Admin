package com.schoolManagement.pack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Marksheet;
import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Services.MarksheetDao;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MarksheetController {

	@Autowired
	MarksheetDao dao;
	
	@RequestMapping("/marksheetRegitration")
	public ModelAndView marksheetRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("marksheetRegitration");
		return mv;
	}
	
	@RequestMapping("/getInfoMarksheet")
	public ModelAndView getInfoMarksheet(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		List<Marksheet> list = dao.getAll();
		mv.setViewName("getInfoMarksheet");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/getOneMarksheet")
	public ModelAndView getOneMarksheet (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Marksheet marksheet = dao.get(Integer.parseInt(req.getParameter("markID")));
		mv.setViewName("showMarksheet");
		mv.addObject("marksheet", marksheet);
		return mv;
	}
	
	@RequestMapping("/updateMarksheet")
	public ModelAndView updateMarksheet (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Marksheet marksheet = dao.get(Integer.parseInt(req.getParameter("markID")));
		mv.setViewName("showMarksheet");
		mv.addObject("marksheet", marksheet);
		return mv;
	}
	
	@RequestMapping("/deleteMarksheet")
	public ModelAndView deleteMarksheet (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Marksheet marksheet = dao.get(Integer.parseInt(req.getParameter("markID")));
		mv.setViewName("showMarksheet");
		mv.addObject("marksheet", marksheet);
		return mv;
	}
}
