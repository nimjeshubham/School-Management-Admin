package com.schoolManagement.pack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.School;
import com.schoolManagement.pack.Repositories.SchoolRepo;
import com.schoolManagement.pack.Services.SchoolDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class SchoolController {
	
	@Autowired
	SchoolDao dao;
	
	@RequestMapping("/schoolRegitration")
	public ModelAndView schoolRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("schoolRegitration");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getInfoSchool")
	public ModelAndView getInfoSchool(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.getAll() != null) {
				List<School> list = dao.getAll();
				mv.setViewName("getInfoSchool");
				mv.addObject("list", list);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getOneSchool")
	public ModelAndView getOneSchool(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if (dao.get(Integer.parseInt(req.getParameter("schoolID"))) != null) {
				School school = dao.get(Integer.parseInt(req.getParameter("schoolID")));
				mv.setViewName("showSchool");
				mv.addObject("school", school);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateSchool")
	public ModelAndView updateSchool(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("schoolID"))) != null) {
				School school = dao.get(Integer.parseInt(req.getParameter("schoolID")));
				mv.setViewName("showSchool");
				mv.addObject("school", school);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteSchool")
	public ModelAndView deleteSchool(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("schoolID"))) != null) {
				School school = dao.get(Integer.parseInt(req.getParameter("schoolID")));
				mv.setViewName("showSchool");
				mv.addObject("school", school);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/newSchool")
	public ModelAndView newSchool(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			School school = new School();
			school.setName(req.getParameter("schoolName"));
			school.setPrincipal(req.getParameter("principal"));
			school.setAddress(req.getParameter("address"));
			dao.insert(school);
			mv.setViewName("showSchool");
			mv.addObject("school", school);
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateSchoolForm")
	public ModelAndView updateSchoolForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("updateSchoolForm");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteSchoolForm")
	public ModelAndView deleteClassForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if( dao.get(Integer.parseInt(req.getParameter("schoolId")))!= null) {
				dao.deleteById(Integer.parseInt(req.getParameter("schoolID")));
				mv.setViewName("adminPage");
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
		
	}
	
	@RequestMapping("/updateSchoolFinal")
	public ModelAndView updateSchoolFinal(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("schoolId"))) != null) {
				School school = dao.get(Integer.parseInt(req.getParameter("schoolId")));
				school.setName(req.getParameter("schoolName"));
				school.setPrincipal(req.getParameter("principal"));
				school.setAddress(req.getParameter("address"));
				dao.update(school);
				mv.setViewName("showSchool");
				mv.addObject("school", school);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
