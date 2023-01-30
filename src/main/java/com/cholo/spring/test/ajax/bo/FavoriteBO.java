package com.cholo.spring.test.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cholo.spring.test.ajax.dao.FavoriteDAO;
import com.cholo.spring.test.ajax.model.Favorite;

@Service
public class FavoriteBO {
	
	@Autowired
	private FavoriteDAO favoriteDAO;

	public List<Favorite> getFavoriteList(){
		
		return favoriteDAO.selectFavorite();
	}
	
	public int addFavorite(String title, String address) {
		
		return favoriteDAO.insertFavorite(title, address);
	}
	
	public boolean overlapAddress(String address) {
		
		int count = favoriteDAO.selectCountoverlap(address);
		if(count == 0) {
			return false;
		}else {
			return true;
		}
	}
}
