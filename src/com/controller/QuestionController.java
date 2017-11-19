package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Question;
import com.service.QuestionService;

import net.sf.json.JSONArray;

@Controller
public class QuestionController {

	@Autowired
	private QuestionService service;

	@RequestMapping("/getData.do")
	@ResponseBody
	public String getData() {
		String hql = "from Question";
		List<Question> list = service.getData(hql);
		String result = null;
		System.out.println(result = JSONArray.fromObject(list).toString());
		return result;
	}

}
