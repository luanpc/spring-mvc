package com.laptrinhjavaweb.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MessageUtil {
	public Map<String, String> getMessage(String message) {
		Map<String, String> result = new HashMap<>();
		if(message.equals("update_success")) {
			result.put("message", "Update Successfully");
			result.put("alert", "success");
		} else if(message.equals("insert_success")) {
			result.put("message", "Insert successful");
			result.put("alert", "success");
		} else if(message.equals("error_system")) {
			result.put("message", "Error system");
			result.put("alert", "danger");
		}
		return result;
	}
}
