package com.example.UnitsConverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.UnitsConverter.service.TimeService;

@CrossOrigin(origins =("*"))
@RestController
@RequestMapping("/time")
public class TimeController {
  @Autowired
  private TimeService ts ;
  @PostMapping("/timezone")
  public String convert(@RequestParam String from,@RequestParam String to) {
	  return ts.convert(from, to);
  }
}
