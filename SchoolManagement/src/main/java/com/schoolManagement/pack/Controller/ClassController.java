package com.schoolManagement.pack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Services.SclassDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ClassController {
	
	@Autowired
	SclassDao dao;
	
	@RequestMapping("/classRegitration")
	public ModelAndView classRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("classRegitration");
		return mv;
	}
	
	@RequestMapping("/getInfoclass")
	public ModelAndView getInfoclass(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		List<Sclass> list = dao.getAll();
		mv.setViewName("getInfoclass");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/getOneclass")
	public ModelAndView getOneclass (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Sclass sclass = dao.get(Integer.parseInt(req.getParameter("classID")));
		mv.setViewName("showClass");
		mv.addObject("sclass", sclass);
		return mv;
	}
	
	@RequestMapping("/updateclass")
	public ModelAndView updateclass (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Sclass sclass = dao.get(Integer.parseInt(req.getParameter("classID")));
		mv.setViewName("showClass");
		mv.addObject("sclass", sclass);
		return mv;
	}
	
	@RequestMapping("/deleteclass")
	public ModelAndView deleteclass (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Sclass sclass = dao.get(Integer.parseInt(req.getParameter("classID")));
		mv.setViewName("showClass");
		mv.addObject("sclass", sclass);
		return mv;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
