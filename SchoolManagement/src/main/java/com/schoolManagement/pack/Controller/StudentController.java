package com.schoolManagement.pack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Model.Student;
import com.schoolManagement.pack.Services.SclassDao;
import com.schoolManagement.pack.Services.StudentDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class StudentController {
	
	@Autowired
	StudentDao dao;
	
	@RequestMapping("/studentRegitration")
	public ModelAndView studentRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentRegitration");
		return mv;
	}
	
	@RequestMapping("/getInfoStudent")
	public ModelAndView getInfoStudent(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		List<Student> list = dao.getAll();
		mv.setViewName("getInfoStudent");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Student student = dao.get(req.getParameter("studentID"));
		mv.setViewName("showStudent");
		mv.addObject("student", student);
		return mv;
	}
	
	@RequestMapping("/deleteStudent")
	public ModelAndView deleteStudent(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Student student = dao.get(req.getParameter("studentID"));
		mv.setViewName("showStudent");
		mv.addObject("student", student);
		return mv;
	}
	
	@RequestMapping("/getOneStudent")
	public ModelAndView getOneStudent(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Student student = dao.get(req.getParameter("studentID"));
		mv.setViewName("showStudent");
		mv.addObject("student", student);
		return mv;
	}

}
