package com.schoolManagement.pack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.schoolManagement.pack.Model.Question;
import com.schoolManagement.pack.Model.Sclass;

import com.schoolManagement.pack.Services.QuestionDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class QuestionController {
	
	@Autowired
	QuestionDao dao;
	
	@RequestMapping("/questionOperations")
	public ModelAndView questionOperations(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("questionOperations");
		return mv;
	}
	
	@RequestMapping("/questionRegitration")
	public ModelAndView questionRegitration(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("questionRegitration");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getInfoQuestion")
	public ModelAndView getInfoQuestion(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if (dao.getAll() != null) {
				List<Question> list = dao.getAll();
			    mv.setViewName("getInfoQuestion");
			    mv.addObject("list", list);
			}else
				mv.setViewName("somethingWrongEnter");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/getOneQuestion")
	public ModelAndView getOneQuestion(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.getById(Integer.parseInt(req.getParameter("questionID"))) != null) {
				Question question = dao.getById(Integer.parseInt(req.getParameter("questionID")));
				mv.setViewName("showQuestion");
				mv.addObject("question", question);
			}else
				mv.setViewName("somethingWrongEnter");
			
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/updateQuestion")
	public ModelAndView updateQuestion (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.getById(Integer.parseInt(req.getParameter("questionID"))) != null) {
				Question question = dao.getById(Integer.parseInt(req.getParameter("questionID")));
				mv.setViewName("showQuestion");
				mv.addObject("question", question);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteQuestion")
	public ModelAndView deleteQuestion (HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if (dao.getById(Integer.parseInt(req.getParameter("questionID"))) != null) {
				Question question = dao.getById(Integer.parseInt(req.getParameter("questionID")));
				mv.setViewName("showQuestion");
				mv.addObject("question", question);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/newQuestion")
	public ModelAndView newQuestion(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			Question question =new Question();
			question.setQuestion(req.getParameter("question"));
			question.setOptionA(req.getParameter("optionA"));
			question.setOptionB(req.getParameter("optionB"));
			question.setOptionC(req.getParameter("optionC"));
			question.setOptionD(req.getParameter("optionD"));
			question.setAnswer(req.getParameter("answer"));
			question.setTestId(Integer.parseInt(req.getParameter("testId")));
			dao.insert(question);
			mv.setViewName("showQuestion");
			mv.addObject("question", question);
			
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		
		
		return mv;
	}
	
	@RequestMapping("/updateQuestionForm")
	public ModelAndView updateQuestionForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName("updateQuestionForm");
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteQuestionForm")
	public ModelAndView deleteQuestionForm(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			if(dao.getById(Integer.parseInt(req.getParameter("questionID"))) != null) {
				dao.delete(Integer.parseInt(req.getParameter("questionID")));
				mv.setViewName("adminPage");
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;
		
	}
	
	@RequestMapping("/updateQuestionFinal")
	public ModelAndView updateQuestionFinal(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			
			if (dao.getById(Integer.parseInt(req.getParameter("questionID")))!= null) {
				Question question =dao.getById(Integer.parseInt(req.getParameter("questionID")));
				question.setQuestion(req.getParameter("question"));
				question.setOptionA(req.getParameter("optionA"));
				question.setOptionB(req.getParameter("optionB"));
				question.setOptionC(req.getParameter("optionC"));
				question.setOptionD(req.getParameter("optionD"));
				question.setAnswer(req.getParameter("answer"));
				question.setTestId(Integer.parseInt(req.getParameter("testId")));
				dao.update(question);
				mv.setViewName("showQuestion");
				mv.addObject("question", question);
			}else
				mv.setViewName("somethingWrongEnter");
			
		}catch (Exception e) {
			mv.setViewName("somethingWrongEnter");
		}
		
		return mv;

		
	}
	

}
