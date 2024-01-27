package com.schoolManagement.pack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Model.Student;
import com.schoolManagement.pack.Services.SchoolDao;
import com.schoolManagement.pack.Services.SclassDao;
import com.schoolManagement.pack.Services.StudentDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class StudentController {
	
	@Autowired
	StudentDao dao;
	
	@Autowired
	SchoolDao schoolDao;
	
	@Autowired
	SclassDao classDao;
	
	@RequestMapping("/studentRegitration")
	public ModelAndView studentRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("studentRegitration");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getInfoStudent")
	public ModelAndView getInfoStudent(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();

		try {
			List<Student> list = dao.getAll();
			mv.setViewName("getInfoStudent");
			mv.addObject("list", list);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();

		try {
			Student student = dao.get(req.getParameter("studentID"));
			mv.setViewName("showStudent");
			mv.addObject("student", student);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteStudent")
	public ModelAndView deleteStudent(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Student student = dao.get(req.getParameter("studentID"));
			mv.setViewName("showStudent");
			mv.addObject("student", student);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getOneStudent")
	public ModelAndView getOneStudent(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Student student = dao.get(req.getParameter("studentID"));
			mv.setViewName("showStudent");
			mv.addObject("student", student);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/newStudent")
	public ModelAndView newStudent (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Student student = new Student();
			if (schoolDao.get(Integer.parseInt(req.getParameter("schoolId")))!=null ) {
				if (classDao.get(Integer.parseInt(req.getParameter("classId")))!=null) {
					student.setEnrollmentNo(req.getParameter("enrollment"));
					student.setSchool(schoolDao.get(Integer.parseInt(req.getParameter("schoolId"))));
					student.setSclass(classDao.get(Integer.parseInt(req.getParameter("classId"))));
					student.setName(req.getParameter("name"));
					student.setFName(req.getParameter("fname"));
					student.setMName(req.getParameter("mname"));
					student.setAddress(req.getParameter("address"));
					student.setPassword(req.getParameter("password"));
					dao.insert(student);
					mv.setViewName("showStudent");
					mv.addObject("student", student);
					return mv;
					
				}
				else 
					mv.setViewName("setClass");
				
				return mv;
			
			}
			else 
				mv.setViewName("setSchool");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		
		return mv;
	
		
	}
	
	@RequestMapping("/updateStudentForm")
	public ModelAndView updateStudentForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("updateStudentForm");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteStudentForm")
	public ModelAndView deleteStudentForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			dao.deleteById(req.getParameter("studentID"));
			mv.setViewName("adminPage");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
		
	}
	
	@RequestMapping("/updateStudentFinal")
	public ModelAndView updateStudentFinal(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Student student = dao.get(req.getParameter("enrollment"));
			student.setSchool(schoolDao.get(Integer.parseInt(req.getParameter("schoolId"))));
			student.setSclass(classDao.get(Integer.parseInt(req.getParameter("classId"))));
			student.setName(req.getParameter("name"));
			student.setFName(req.getParameter("fname"));
			student.setMName(req.getParameter("mname"));
			student.setAddress(req.getParameter("address"));
			student.setPassword(req.getParameter("password"));
			dao.update(student);
			mv.setViewName("showStudent");
			mv.addObject("student", student);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
				
			
		}
	
	
	
	
	
	
	

}
