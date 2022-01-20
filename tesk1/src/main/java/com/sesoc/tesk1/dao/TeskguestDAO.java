package com.sesoc.tesk1.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sesoc.tesk1.vo.Person;

@Repository
public class TeskguestDAO {
	
	@Autowired
	SqlSession sqlSession;

	public int insert(Person person) {
		TeskguestMapper mapper = sqlSession.getMapper(TeskguestMapper.class);
		int result  = mapper.insert(person);
		return result;
	}
	
	
}
