package com.schoolManagement.pack.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Model.Test;
import com.schoolManagement.pack.Services.TestDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TestController {
	
	@Autowired
	TestDao dao;
	
	@RequestMapping("/TestOperations")
	public ModelAndView TestOperations(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("TestOperations");
		return mv;
	}
	
	@RequestMapping("/testRegitration")
	public ModelAndView testRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("testRegitration");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getInfoTest")
	public ModelAndView getInfoTest(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if (dao.getAll() != null) {
				List<Test> list = dao.getAll();
			    mv.setViewName("getInfoTest");
			    mv.addObject("list", list);
			}else
				mv.setViewName("somethingWrongEnter");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getOneTest")
	public ModelAndView getOneTest (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("testID"))) != null) {
				Test test = dao.get(Integer.parseInt(req.getParameter("testID")));
				mv.setViewName("showTest");
				mv.addObject("test", test);
			}else
				mv.setViewName("somethingWrongEnter");
			
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateTest")
	public ModelAndView updateTest (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("testID"))) != null) {
				Test test = dao.get(Integer.parseInt(req.getParameter("testID")));
				mv.setViewName("showTest");
				mv.addObject("test", test);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteTest")
	public ModelAndView deleteTest (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if (dao.get(Integer.parseInt(req.getParameter("testID"))) != null) {
				Test test = dao.get(Integer.parseInt(req.getParameter("testID")));
				mv.setViewName("showTest");
				mv.addObject("test", test);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/newTest")
	public ModelAndView newTest(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Test test = new Test();
			SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
			Date date = s.parse(req.getParameter("date"));
		    test.setDate(date);
		    test.setSubject(req.getParameter("subject"));
			dao.insert(test);
			mv.setViewName("showTest");
			mv.addObject("test", test);	
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		
		
		return mv;
	}
	
	@RequestMapping("/updateTestForm")
	public ModelAndView updateTestForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("updateTestForm");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteTestForm")
	public ModelAndView deleteTestForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.get(Integer.parseInt(req.getParameter("testId"))) != null) {
				dao.delete(Integer.parseInt(req.getParameter("testId")));
				mv.setViewName("adminPage");
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
		
	}
	
	@RequestMapping("/updateTestFinal")
	public ModelAndView updateTestFinal(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			
			if (dao.get(Integer.parseInt(req.getParameter("testId")))!= null) {
				Test test =dao.get(Integer.parseInt(req.getParameter("testId")));
				SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
				Date date = s.parse(req.getParameter("date"));
			    test.setDate(date);
			    test.setSubject(req.getParameter("subject"));
				dao.insert(test);
				mv.setViewName("showTest");
				mv.addObject("test", test);	
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;

		
	}
	

}
