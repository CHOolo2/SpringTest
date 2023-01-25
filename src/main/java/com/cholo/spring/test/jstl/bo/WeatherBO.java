package com.cholo.spring.test.jstl.bo;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cholo.spring.test.jstl.dao.WeatherDAO;

@Service
public class WeatherBO {
	
	@Autowired
	private WeatherDAO weatherDAO;

	//WeatherHistory 의 모든 데이터 조회
	public List <Weather> getWheather() {
		return weatherDAO.selectWheather();
	
	}
}