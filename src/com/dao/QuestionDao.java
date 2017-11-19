package com.dao;

import java.util.List;

public interface QuestionDao {

	public <T> List<T> getData(String hql);
}
