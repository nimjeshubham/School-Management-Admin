package com.schoolManagement.pack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Model.Teacher;
import com.schoolManagement.pack.Services.SclassDao;
import com.schoolManagement.pack.Services.TeacherDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TeacherController {
	
	@Autowired
	TeacherDao dao;
	
	@RequestMapping("/teacherRegitration")
	public ModelAndView teacherRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("teacherRegitration");
		return mv;
	}
	
	@RequestMapping("/getInfoTeacher")
	public ModelAndView getInfoTeacher(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		List<Teacher> list = dao.getAll();
		mv.setViewName("getInfoTeacher");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/updateTeacher")
	public ModelAndView updateTeacher(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Teacher teacher = dao.get(Integer.parseInt(req.getParameter("teacherID")));
		mv.setViewName("showTeacher");
		mv.addObject("teacher", teacher);
		return mv;
	}
	
	@RequestMapping("/deleteTeacher")
	public ModelAndView deleteTeacher(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Teacher teacher = dao.get(Integer.parseInt(req.getParameter("teacherID")));
		mv.setViewName("showTeacher");
		mv.addObject("teacher", teacher);
		return mv;
	}
	
	@RequestMapping("/getOneTeacher")
	public ModelAndView getOneTeacher(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Teacher teacher = dao.get(Integer.parseInt(req.getParameter("teacherID")));
		mv.setViewName("showTeacher");
		mv.addObject("teacher", teacher);
		return mv;
	}

}
