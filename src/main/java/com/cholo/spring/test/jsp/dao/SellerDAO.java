package com.cholo.spring.test.jsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cholo.spring.test.jsp.model.Seller;

@Repository
public interface SellerDAO {
	
	public int insertSeller(
			@Param("nickName")String nickName
			, @Param("temperature")double temperature
			, @Param("profileImage")String profileImage); 
	
	public Seller selectLastSeller();
	public Seller selecSeller(@Param("id")int id);
}
