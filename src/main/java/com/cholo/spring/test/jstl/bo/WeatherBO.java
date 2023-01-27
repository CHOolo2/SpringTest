/*package com.cholo.spring.test.jstl.bo;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cholo.spring.test.jstl.dao.WeatherDAO;

@Service
public class WeatherBO {
	
	@Autowired
	private WeatherDAO weatherDAO;
	
	public List<Weather> getWeatherHistory() {
		return weatherDAO.selectWeather();
	}
	
	public int addWeather(
			Date date
			, String weather
			, double temperatures
			, double precipitation
			, String microDust
			, double windSpeed) {
		
		return weatherDAO.insertWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
	}

}*/