package com.service;

import java.util.List;

public interface QuestionService {

	public <T> List<T> getData(String hql);
}
