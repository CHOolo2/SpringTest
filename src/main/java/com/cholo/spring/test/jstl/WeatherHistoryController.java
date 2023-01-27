/*package com.cholo.spring.test.jstl;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cholo.spring.test.jstl.bo.WeatherBO;
import com.cholo.spring.test.jstl.model.Weather;

@Controller
@RequestMapping("/jstl/weather")
public class WeatherHistoryController {
	
	@GetMapping("/list")
	public String weatherList(Model model) {
		
		// weatherHistory 리스트를 모델에 추가한다. 
		List<Weather> weatherHistory = weatherBO.getWeather();
		
		model.addAttribute("weatherHistory", weatherHistory);
		
		
		return "jstl/weather/list";
		
	}
	
	@GetMapping("/add")
	public String addWeather(
			@DateTimeFormat(pattern="yyyy년 M월 d일")
			@RequestParam("date") Date date
			, @RequestParam("weather") String weather
			, @RequestParam("temperatures") double temperatures
			, @RequestParam("precipitation") double precipitation
			, @RequestParam("microDust") String microDust
			, @RequestParam("windSpeed") double windSpeed) {
		
		int count = WeatherBO.addWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
		return "redirect:/jstl/weather/list";
		
	}
	
	
	@GetMapping("/input")
	public String weatherInput() {
		
		return "jstl/Weather/list";
	}
}*/