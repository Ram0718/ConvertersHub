package com.example.UnitsConverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UnitsConverter.service.DataConvertingService;

@CrossOrigin(origins = ("*"))
@RestController
@RequestMapping("/data")
public class DataConvertController {
    
	@Autowired
	private DataConvertingService ds;
	
	@GetMapping("/mb-to-gb/{mb}")
	public double mbToGb(@PathVariable double mb) {
		return ds.mbToGb(mb);
	}
	@GetMapping("/gb-to-tb/{gb}")
	public double gbToTb(@PathVariable double gb) {
		return ds.gbToTb(gb);
	}
	@GetMapping("/mb-to-tb/{mb}")
	public double mbToTb(@PathVariable double mb) {
		return ds.mbToTb(mb);
	}
}
