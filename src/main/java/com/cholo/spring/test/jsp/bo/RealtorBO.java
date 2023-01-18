package com.cholo.spring.test.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cholo.spring.test.jsp.dao.RealtorDAO;
import com.cholo.spring.test.jsp.model.Realtor;

@Service
public class RealtorBO {
	
	@Autowired
	private RealtorDAO realtroDAO;

	public int addRealtor(Realtor realtor) {
	
		return RealtorDAO.realtor("id");
	}
}
