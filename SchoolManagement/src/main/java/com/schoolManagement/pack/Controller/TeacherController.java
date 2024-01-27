package com.schoolManagement.pack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Model.Teacher;
import com.schoolManagement.pack.Services.SchoolDao;
import com.schoolManagement.pack.Services.SclassDao;
import com.schoolManagement.pack.Services.TeacherDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TeacherController {
	
	@Autowired
	TeacherDao dao;
	
	@Autowired
	SchoolDao schoolDao;
	
	@RequestMapping("/teacherRegitration")
	public ModelAndView teacherRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("teacherRegitration");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getInfoTeacher")
	public ModelAndView getInfoTeacher(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if( dao.getAll() != null) {
				List<Teacher> list = dao.getAll();
				mv.setViewName("getInfoTeacher");
				mv.addObject("list", list);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateTeacher")
	public ModelAndView updateTeacher(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("teacherID"))) != null) {
				Teacher teacher = dao.get(Integer.parseInt(req.getParameter("teacherID")));
				mv.setViewName("showTeacher");
				mv.addObject("teacher", teacher);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteTeacher")
	public ModelAndView deleteTeacher(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("teacherID"))) != null) {
				Teacher teacher = dao.get(Integer.parseInt(req.getParameter("teacherID")));
				mv.setViewName("showTeacher");
				mv.addObject("teacher", teacher);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getOneTeacher")
	public ModelAndView getOneTeacher(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("teacherID"))) != null) {
				Teacher teacher = dao.get(Integer.parseInt(req.getParameter("teacherID")));
				mv.setViewName("showTeacher");
				mv.addObject("teacher", teacher);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/newTeacher")
	public ModelAndView newTeacher(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Teacher teacher = new Teacher();
			if(schoolDao.get(Integer.parseInt(req.getParameter("schoolId")))!=null) {
			teacher.setName(req.getParameter("name"));
			teacher.setSchool(schoolDao.get(Integer.parseInt(req.getParameter("schoolId"))));
			teacher.setAddress(req.getParameter("address"));
			teacher.setPassword(req.getParameter("password"));
			dao.insert(teacher);
			}
			else 
				mv.setViewName("setSchool");
			mv.setViewName("showTeacher");
			mv.addObject("teacher", teacher);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateTeacherForm")
	public ModelAndView updateTeacherForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("updateTeacherForm");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteTeacherForm")
	public ModelAndView deleteTeacherForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("teacherID"))) != null) {
				dao.deleteById(Integer.parseInt(req.getParameter("teacherID")));
				mv.setViewName("adminPage");
			}else
				mv.setViewName("somethingWrongEnter");
				
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
		
	}
	
	@RequestMapping("/updateTeacherFinal")
	public ModelAndView updateTeacherFinal(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("tID"))) != null) {
				Teacher teacher = dao.get(Integer.parseInt(req.getParameter("tID")));
				if(schoolDao.get(Integer.parseInt(req.getParameter("schoolId")))!=null) {
				teacher.setName(req.getParameter("name"));
				teacher.setSchool(schoolDao.get(Integer.parseInt(req.getParameter("schoolId"))));
				teacher.setAddress(req.getParameter("address"));
				teacher.setPassword(req.getParameter("password"));
				dao.update(teacher);
				}
				else 
					mv.setViewName("setSchool");
				mv.setViewName("showTeacher");
				mv.addObject("teacher", teacher);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	

}
