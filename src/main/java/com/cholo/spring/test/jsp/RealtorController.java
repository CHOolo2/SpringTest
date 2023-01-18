package com.cholo.spring.test.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cholo.spring.test.jsp.model.Realtor;

	@Controller
	@RequestMapping("/jsp/realtor")
	public class RealtorController {

	@GetMapping("/input")
	public String realtorInput() {
		return "jsp/realtorInput";
	}
	
	@GetMapping("/add")
	public String addRealtor(
			 @RequestParam("office")String office
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("address") String address
			, @RequestParam("grade") String grade
			, Model model) {
		
		
//		Realtor realtor = new Realtor();
//		realtor.setOffice(office);
//		realtor.setPhoneNumber(phoneNumber);
//		realtor.setAddress(address);
//		realtor.setGrade(grade);
		
		realtorBO.addRealtor(realtor);
		
		model.addAttribute("realtor", realtor);
		
		return "jsp/realtorInfo";
	}
}
