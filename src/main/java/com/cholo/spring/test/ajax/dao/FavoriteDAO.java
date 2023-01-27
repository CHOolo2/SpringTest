package com.cholo.spring.test.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cholo.spring.test.ajax.model.Favorite;

@Repository
public interface FavoriteDAO {
	
	public List<Favorite> selectFavorite();
	
	public int insertFavorite(
		@Param("title") String title
		, @Param("address") String address);
}
