package com.example.UnitsConverter.service;

import org.springframework.stereotype.Service;

import com.example.UnitsConverter.exception.InvalidException;

@Service
public class DataConvertingService {
    
	public double mbToGb(double mb) {
		if(mb<=0) {
			throw new InvalidException("enter the mb more 1 mb");
		}
		return mb/1000;
	}
	public double gbToTb(double gb) {
		if(gb<=0) {
			throw new InvalidException("enter the mb more 1 gb");
		}
		return gb/1000;
	}
	public double mbToTb(double mb) {
		if(mb<=0) {
			throw new InvalidException("enter the mb more 1 mb");
		}
		return mb/1_000_000;
	}
}
