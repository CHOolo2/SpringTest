package com.cholo.spring.test.jstl.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cholo.spring.test.jstl.model.Weather;

@Repository
public class WeatherDAO {

	public List<Weather> selectWheather(
			@Param("weather") String weather
			, @Param("temperatures") double temperatures
			, @Param("precipitation") double precipitation
			, @Param("microDust") String microDust
			, @Param("windSpeed") double windSpeed);
	
	}	