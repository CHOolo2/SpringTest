package com.cholo.spring.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cholo.spring.test.ajax.bo.FavoriteBO;
import com.cholo.spring.test.ajax.model.Favorite;

@Controller
@RequestMapping("/ajax/favorite")
public class FavoriteController {
	
	@Autowired
	private FavoriteBO favoriteBO;

	@GetMapping("/list")
	public String favoriteList(Model model) {
		
		List<Favorite> favoriteList = favoriteBO.getFavoriteList();
		
		model.addAttribute("favoriteList", favoriteList);
		
		return "ajax/favorite/list";
	}
	// 즐겨찾기 추가 api
	@PostMapping("/add")
	@ResponseBody
	public Map<String, String> addFavorite(
		@RequestParam("title") String title
		, @RequestParam("address") String address) {
		
		int count = favoriteBO.addFavorite(title, address);
		
		// response
		//성공시 : {"result":"success"}
		//실패시 : {"result":"fail"}
		Map<String, String> map = new HashMap<>();
		if(count == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}
		
		return map;
	}
	
	@GetMapping("/input")
	public String favoriteInput() {
		return "ajax/favorite/input";
	}

	@PostMapping("/overlapAddress")
	@ResponseBody
	public Map<String, Boolean> overlapAddress(@RequestParam("address") String addres){
		Map<String, Boolean> result = new HashMap<>();
		
		if(favoriteBO.overlapAddress(addres)) {
			result.put("overlapAddress", true);
		}else {
			result.put("overlapAddress", false);
		}
		//result.put("overlapAddress", favoriteBO.overlapAddress(address));
		return result;
	}
	
	//삭제 API
	//id를 전달받고, 해당 행을 삭제하는 API
	@GetMapping("/delete")
	@ResponseBody
	public Map<String, String> deleteFavorite(@RequestParam("id") int id) {
		
		int count = favoriteBO.deleteFavorite(id);
		Map<String, String> map = new HashMap<>();
		if(count == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");
		}
		return map;
	}
}