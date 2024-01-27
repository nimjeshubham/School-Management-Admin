package com.schoolManagement.pack.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Subject;
import com.schoolManagement.pack.Model.Teacher;
import com.schoolManagement.pack.Services.SclassDao;
import com.schoolManagement.pack.Services.SubjectDao;
import com.schoolManagement.pack.Services.TeacherDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class SubjectController {
	
	@Autowired
	SubjectDao dao;
	
	@Autowired
	SclassDao sclassDao;
	
	@Autowired
	TeacherDao teacherDao;
	
	
	@RequestMapping("/subjectRegitration")
	public ModelAndView subjectRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("subjectRegitration");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getInfoSubject")
	public ModelAndView getInfoSubject(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			List<Subject> list = dao.getAll();
			mv.setViewName("getInfoSubject");
			mv.addObject("list", list);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateSubject")
	public ModelAndView updateSubject (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Subject subject = dao.get(Integer.parseInt(req.getParameter("subjectID")));
			mv.setViewName("showSubject");
			mv.addObject("subject", subject);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getOneSubject")
	public ModelAndView getOneSubject (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Subject subject = dao.get(Integer.parseInt(req.getParameter("subjectID")));
			mv.setViewName("showSubject");
			mv.addObject("subject", subject);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteSubject")
	public ModelAndView deleteSubject (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Subject subject = dao.get(Integer.parseInt(req.getParameter("subjectID")));
			mv.setViewName("showSubject");
			mv.addObject("subject", subject);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/newSubject")
	public ModelAndView newSubject (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Subject subject = new Subject();
			subject.setName(req.getParameter("name"));
			subject.setSclass(sclassDao.get(Integer.parseInt(req.getParameter("classId"))));
			List<Teacher> list = new ArrayList<>();
			if (teacherDao.get(Integer.parseInt(req.getParameter("Teacher1")))!= null){
				Teacher teacher = teacherDao.get(Integer.parseInt(req.getParameter("Teacher1")));
				list.add(teacher);
			}
			else
				mv.setViewName("setTeacher");
			
			if (teacherDao.get(Integer.parseInt(req.getParameter("Teacher2")))!= null){
				Teacher teacher = teacherDao.get(Integer.parseInt(req.getParameter("Teacher2")));
				list.add(teacher);
			}
			else
				mv.setViewName("setTeacher");
			
			if (teacherDao.get(Integer.parseInt(req.getParameter("Teacher2")))!= null){
				Teacher teacher = teacherDao.get(Integer.parseInt(req.getParameter("Teacher2")));
				list.add(teacher);
			}
			else
				mv.setViewName("setTeacher");
			
			subject.setTeacher(list);
			
			dao.insert(subject);
			
			mv.setViewName("showSubject");
			mv.addObject("subject", subject);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
		
		
	}
	
	@RequestMapping("/updateSubjectForm")
	public ModelAndView updateSubjectForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("updateSubjectForm");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteSubjectForm")
	public ModelAndView deleteSubjectForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			dao.deleteById(Integer.parseInt(req.getParameter("subjectID")));
			mv.setViewName("adminPage");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateSubjectFinal")
	public ModelAndView updateSubjectFinal (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Subject subject = dao.get(Integer.parseInt(req.getParameter("subjectID")));
			subject.setName(req.getParameter("name"));
			subject.setSclass(sclassDao.get(Integer.parseInt(req.getParameter("classId"))));
			List<Teacher> list = new ArrayList<>();
			if (teacherDao.get(Integer.parseInt(req.getParameter("Teacher1")))!= null){
				Teacher teacher = teacherDao.get(Integer.parseInt(req.getParameter("Teacher1")));
				list.add(teacher);
			}
			else
				mv.setViewName("setTeacher");
			
			if (teacherDao.get(Integer.parseInt(req.getParameter("Teacher2")))!= null){
				Teacher teacher = teacherDao.get(Integer.parseInt(req.getParameter("Teacher2")));
				list.add(teacher);
			}
			else
				mv.setViewName("setTeacher");
			
			if (teacherDao.get(Integer.parseInt(req.getParameter("Teacher2")))!= null){
				Teacher teacher = teacherDao.get(Integer.parseInt(req.getParameter("Teacher2")));
				list.add(teacher);
			}
			else
				mv.setViewName("setTeacher");
			
			subject.setTeacher(list);
			
			dao.update(subject);
			
			mv.setViewName("showSubject");
			mv.addObject("subject", subject);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
		
		
	}
	
	
	
}
