package com.example.UnitsConverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UnitsConverter.model.ConverterModel;
import com.example.UnitsConverter.service.ConverterService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/convert")
public class ConvertingController {
    @Autowired
    private ConverterService cs;
      
    @PostMapping("/length")
    public double convertLength(@RequestBody ConverterModel cm) {
    	return cs.convertLength(cm.getValue(), cm.getFrom(), cm.getTo());
    }
    @PostMapping("/weight")
    public double convertWeight(@RequestBody ConverterModel cm) {
    	return cs.convertWight(cm.getValue(),cm.getFrom(), cm.getTo());
    }
    @PostMapping("/volume")
    public double convertVolume(@RequestBody ConverterModel cm) {
    	return cs.convertVolume(cm.getValue(), cm.getFrom(), cm.getTo());
    }
}
