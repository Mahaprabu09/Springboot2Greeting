package com.group.Greeting.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("Group")
public class GreetingController {
    @GetMapping("/getGroup")
	public ResponseEntity<String>getStudentName(){
		return ResponseEntity.ok().body("Welcome you to the group meet");
	}

}
