package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.QuestionDao;
import com.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionDao dao;

	@Override
	public <T> List<T> getData(String hql) {
		// TODO Auto-generated method stub
		return dao.getData(hql);
	}

}
