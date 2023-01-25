package com.cholo.spring.test.jstl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cholo.spring.test.jstl.bo.WeatherBO;

@Controller
@RequestMapping("/jstl/weather")
public class WeatherHistoryController {
	
	@Autowired
	private WeatherBO weatherBO;
	
	@GetMapping("/list")
	public String weatherList(Model model) {
		
		//WeatherHistory 리스트를 모델에 추가한다
		List<Weather> weatherJistory = weatherBO.getWheather();
		
		model.addAttribute("weather", weather);
		
		return "jstl/Weather/list";
	}
}