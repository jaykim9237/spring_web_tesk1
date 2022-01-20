package com.sesoc.task1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.tesk1.HomeController;
import com.sesoc.tesk1.dao.TeskguestDAO;
import com.sesoc.tesk1.vo.Person;

@Controller
public class TeskguestController {

	private static final Logger logger = LoggerFactory.getLogger(TeskguestController.class);
	
	@Autowired
	TeskguestDAO dao;
	/**
	 * 글쓰기 폼으로 이동하는 메서드
	 * @return
	 */
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write() {
		//쓰기 폼으로 이동
		
		return "write";
	}
	
	/**
	 * 내용을 작성하는 메서드
	 * @param person
	 * @return
	 */
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write2(Person person) {
		//글쓰기 폼 
		logger.debug("전달 된 param : {}", person);
		dao.insert(person);
		
		return "redirect:/home";
	}
	
}
