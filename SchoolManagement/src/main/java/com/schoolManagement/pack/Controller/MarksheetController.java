package com.schoolManagement.pack.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Marksheet;
import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Services.MarksheetDao;
import com.schoolManagement.pack.Services.StudentDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MarksheetController {

	@Autowired
	MarksheetDao dao;
	
	@Autowired
	StudentDao studentDao;
	
	@RequestMapping("/marksheetRegitration")
	public ModelAndView marksheetRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("marksheetRegitration");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getInfoMarksheet")
	public ModelAndView getInfoMarksheet(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			List<Marksheet> list = dao.getAll();
			mv.setViewName("getInfoMarksheet");
			mv.addObject("list", list);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getOneMarksheet")
	public ModelAndView getOneMarksheet (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Marksheet marksheet = dao.get(Integer.parseInt(req.getParameter("markID")));
			mv.setViewName("showMarksheet");
			mv.addObject("marksheet", marksheet);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateMarksheet")
	public ModelAndView updateMarksheet (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Marksheet marksheet = dao.get(Integer.parseInt(req.getParameter("markID")));
			mv.setViewName("showMarksheet");
			mv.addObject("marksheet", marksheet);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteMarksheet")
	public ModelAndView deleteMarksheet (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Marksheet marksheet = dao.get(Integer.parseInt(req.getParameter("markID")));
			mv.setViewName("showMarksheet");
			mv.addObject("marksheet", marksheet);
		}
		catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/newMarksheet")
	public ModelAndView newMarksheet(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Marksheet marksheet1 = new Marksheet();
			Marksheet marksheet2 = new Marksheet();
			Marksheet marksheet3 = new Marksheet();
			Marksheet marksheet4 = new Marksheet();
			Marksheet marksheet5 = new Marksheet();
			Marksheet marksheet6 = new Marksheet();
			
			if (studentDao.get(req.getParameter("studentId"))!=null) {
				
				marksheet1.setStudent(studentDao.get(req.getParameter("studentId")));
				marksheet1.setExam(req.getParameter("exam"));
				marksheet1.setSubject(req.getParameter("subject1"));
				marksheet1.setMarks(Integer.parseInt(req.getParameter("marks1")));
				dao.insert(marksheet1);
				
				marksheet2.setStudent(studentDao.get(req.getParameter("studentId")));
				marksheet2.setExam(req.getParameter("exam"));
				marksheet2.setSubject(req.getParameter("subject2"));
				marksheet2.setMarks(Integer.parseInt(req.getParameter("marks2")));
				dao.insert(marksheet2);
				
				marksheet3.setStudent(studentDao.get(req.getParameter("studentId")));
				marksheet3.setExam(req.getParameter("exam"));
				marksheet3.setSubject(req.getParameter("subject3"));
				marksheet3.setMarks(Integer.parseInt(req.getParameter("marks3")));
				dao.insert(marksheet3);
				
				marksheet4.setStudent(studentDao.get(req.getParameter("studentId")));
				marksheet4.setExam(req.getParameter("exam"));
				marksheet4.setSubject(req.getParameter("subject4"));
				marksheet4.setMarks(Integer.parseInt(req.getParameter("marks4")));
				dao.insert(marksheet4);
				
				marksheet5.setStudent(studentDao.get(req.getParameter("studentId")));
				marksheet5.setExam(req.getParameter("exam"));
				marksheet5.setSubject(req.getParameter("subject5"));
				marksheet5.setMarks(Integer.parseInt(req.getParameter("marks5")));
				dao.insert(marksheet5);
				
				marksheet6.setStudent(studentDao.get(req.getParameter("studentId")));
				marksheet6.setExam(req.getParameter("exam"));
				marksheet6.setSubject(req.getParameter("subject6"));
				marksheet6.setMarks(Integer.parseInt(req.getParameter("marks6")));
				dao.insert(marksheet6);
				
				List<Marksheet> list = new ArrayList<>();
				list.add(marksheet1);
				list.add(marksheet2);
				list.add(marksheet3);
				list.add(marksheet4);
				list.add(marksheet5);
				list.add(marksheet6);
				
				mv.setViewName("getInfoMarksheet");
				mv.addObject("list", list);
			}
			else 
				mv.setViewName("setStudent");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateMarksheetForm")
	public ModelAndView updateMarksheetForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("updateMarksheetForm");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteMarksheetForm")
	public ModelAndView deleteMarksheetForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			dao.deleteById(Integer.parseInt(req.getParameter("markID")));
			mv.setViewName("adminPage");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
		
	}
	
	@RequestMapping("/updateMarksheetFinal")
	public ModelAndView updateMarksheetFinal (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Marksheet marksheet = dao.get(Integer.parseInt(req.getParameter("marksheetID")));
			marksheet.setStudent(studentDao.get(req.getParameter("studentId")));
			marksheet.setExam(req.getParameter("exam"));
			marksheet.setSubject(req.getParameter("subject1"));
			marksheet.setMarks(Integer.parseInt(req.getParameter("marks1")));
			dao.update(marksheet);
			
			mv.setViewName("showMarksheet");
			mv.addObject("marksheet", marksheet);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
