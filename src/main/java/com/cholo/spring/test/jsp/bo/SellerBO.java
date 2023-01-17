package com.cholo.spring.test.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cholo.spring.test.jsp.dao.SellerDAO;
import com.cholo.spring.test.jsp.model.Seller;

@Service
public class SellerBO {
	
	@Autowired
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickName
			, double temperature
			, String profileImage) {
	
	return sellerDAO.insertSeller(nickName,temperature,profileImage);
	
	public Seller getLastSeller() {
		return sellerDAO.selectLastSeller();
		
	}
	public Seller getSeller(int id) {
		return sellerDAO.selectLastSeller();
}
	}
}