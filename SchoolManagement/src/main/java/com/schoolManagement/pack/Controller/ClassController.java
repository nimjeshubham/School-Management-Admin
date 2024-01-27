package com.schoolManagement.pack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.AsyncHandlerMethodReturnValueHandler;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Services.SchoolDao;
import com.schoolManagement.pack.Services.SclassDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ClassController {
	
	@Autowired
	SclassDao dao;
	
	@Autowired
	SchoolDao schoolDao;
	
	@RequestMapping("/classRegitration")
	public ModelAndView classRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("classRegitration");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getInfoclass")
	public ModelAndView getInfoclass(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			List<Sclass> list = dao.getAll();
			mv.setViewName("getInfoclass");
			mv.addObject("list", list);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getOneclass")
	public ModelAndView getOneclass (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Sclass sclass = dao.get(Integer.parseInt(req.getParameter("classID")));
			mv.setViewName("showClass");
			mv.addObject("sclass", sclass);
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateclass")
	public ModelAndView updateclass (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Sclass sclass = dao.get(Integer.parseInt(req.getParameter("classID")));
			mv.setViewName("showClass");
			mv.addObject("sclass", sclass);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteclass")
	public ModelAndView deleteclass (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Sclass sclass = dao.get(Integer.parseInt(req.getParameter("classID")));
			mv.setViewName("showClass");
			mv.addObject("sclass", sclass);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/newClass")
	public ModelAndView newClass(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Sclass sclass = new Sclass();
			if (schoolDao.get(Integer.parseInt(req.getParameter("schoolId")))!=null) {
			    sclass.setName( Integer.parseInt( req.getParameter("classId")));
			    sclass.setSection(req.getParameter("section"));
			    sclass.setClassTeacher(req.getParameter("classTeacher"));
			    sclass.setSchool(schoolDao.get(Integer.parseInt(req.getParameter("schoolId"))));
				dao.insert(sclass);
				mv.setViewName("showClass");
				mv.addObject("sclass", sclass);
				return mv;
			}
			else 
				mv.setViewName("setSchool");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		
		
		return mv;
	}
	
	@RequestMapping("/updateClassForm")
	public ModelAndView updateClassForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("updateClassForm");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteClassForm")
	public ModelAndView deleteClassForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			dao.deleteById(Integer.parseInt(req.getParameter("classId")));
			mv.setViewName("adminPage");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
		
	}
	
	@RequestMapping("/updateClassFinal")
	public ModelAndView updateClassFinal(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Sclass sclass = dao.get(Integer.parseInt(req.getParameter("classId")));
			sclass.setName( Integer.parseInt( req.getParameter("name")));
		    sclass.setSection(req.getParameter("section"));
		    sclass.setClassTeacher(req.getParameter("classTeacher"));
		    sclass.setSchool(schoolDao.get(Integer.parseInt(req.getParameter("schoolId"))));
			dao.update(sclass);
			mv.setViewName("showClass");
			mv.addObject("sclass", sclass);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;

		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
