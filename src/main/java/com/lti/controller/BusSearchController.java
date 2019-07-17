package com.lti.controller;

import java.sql.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusSearchController {

	@RequestMapping(path="/BusSearch", method = RequestMethod.POST)
	public void search(@RequestParam String source,@RequestParam String destination, @RequestParam String date) {
		
		
	}
}
