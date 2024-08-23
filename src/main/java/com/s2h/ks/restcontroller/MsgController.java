package com.s2h.ks.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RefreshScope
public class MsgController {
	
	@Value("${msg:Config server is not working, plz check..}")
	public String msg;
	
	@GetMapping("/greet")
	public ResponseEntity greetMsg() {
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
