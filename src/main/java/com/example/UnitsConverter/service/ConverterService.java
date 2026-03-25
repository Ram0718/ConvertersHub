package com.example.UnitsConverter.service;

import org.springframework.stereotype.Service;

import com.example.UnitsConverter.exception.InvalidException;

@Service
public class ConverterService {
 
	public double convertLength(double value,String from ,String to) {
		 if(from.equals("km")&& to.equals("m")) {
			 return value*1000;
		 }
		 if(from.equals("m")&& to.equals("km")) {
			 return value/1000;
		 }
		 if(from.equals("m")&& to.equals("cm")) {
			 return value*100;
		 }
		 if(from.equals("cm")&& to.equals("m")) {
			 return value/100;
		 }
		 throw new InvalidException("Invalid length units: " + from + " to " + to);
	}
	
	public double convertWight(double value,String from,String to) {
		if(from.equals("kg") && to.equals("g")) {
			return value*1000;
		}
	if(	from.equals("g") && to.equals("kg")){
			return value/1000;
		}
	 throw new InvalidException("Invalid weight units: " + from + " to " + to);
	}
    public double convertVolume(double value, String from, String to) {
        if (from.equals("l") && to.equals("ml")) {
        	return value * 1000;
        }
        if (from.equals("ml") && to.equals("l")) {
        	return value / 1000;
        }
     throw new InvalidException("Invalid volume units: " + from + " to " + to);
        
    }

}
