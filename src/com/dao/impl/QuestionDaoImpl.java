package com.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.QuestionDao;

@Repository("QuestionDao")
public class QuestionDaoImpl implements QuestionDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public <T> List<T> getData(String hql) {
		return sessionFactory.getCurrentSession().createQuery(hql).list();
	}
}
