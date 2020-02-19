package jp.co.sample.emp_management.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrator")
public class AdministratorcheckController {
	
	@RequestMapping("/password_check")
	public Map<String, String> checkPassword(String password,String conPassword) {
		Map<String, String> map = new HashMap<>();
		String conPasswordText = null;
		if(password.equals(conPassword)) {
			conPasswordText = "パスワードが一致しています！";
		} else {
			conPasswordText = "パスワードが違います！";
		}
		
		map.put("conPasswordText", conPasswordText);
		return map;
	}
}
