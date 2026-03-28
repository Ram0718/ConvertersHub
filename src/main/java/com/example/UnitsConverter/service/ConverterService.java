package com.example.UnitsConverter.service;

import org.springframework.stereotype.Service;

import com.example.UnitsConverter.exception.InvalidException;

@Service
public class ConverterService {
 
	public double convertLength(double value,String from ,String to) {
		// km conversions
		if(from.equals("km")&& to.equals("m")) {
			return value*1000;
		}
		if(from.equals("km")&& to.equals("cm")) {
			return value*100000;
		}
		if(from.equals("km")&& to.equals("mm")) {
			return value*1000000;
		}
		if(from.equals("km")&& to.equals("ft")) {
			return value*3280.84;
		}
		if(from.equals("km")&& to.equals("in")) {
			return value*39370.1;
		}
		if(from.equals("km")&& to.equals("mi")) {
			return value*0.621371;
		}
		// m conversions
		if(from.equals("m")&& to.equals("km")) {
			return value/1000;
		}
		if(from.equals("m")&& to.equals("cm")) {
			return value*100;
		}
		if(from.equals("m")&& to.equals("mm")) {
			return value*1000;
		}
		if(from.equals("m")&& to.equals("ft")) {
			return value*3.28084;
		}
		if(from.equals("m")&& to.equals("in")) {
			return value*39.3701;
		}
		if(from.equals("m")&& to.equals("mi")) {
			return value*0.000621371;
		}
		// cm conversions
		if(from.equals("cm")&& to.equals("m")) {
			return value/100;
		}
		if(from.equals("cm")&& to.equals("km")) {
			return value/100000;
		}
		if(from.equals("cm")&& to.equals("mm")) {
			return value*10;
		}
		if(from.equals("cm")&& to.equals("ft")) {
			return value*0.0328084;
		}
		if(from.equals("cm")&& to.equals("in")) {
			return value*0.393701;
		}
		if(from.equals("cm")&& to.equals("mi")) {
			return value*6.21371e-6;
		}
		// mm conversions
		if(from.equals("mm")&& to.equals("m")) {
			return value/1000;
		}
		if(from.equals("mm")&& to.equals("km")) {
			return value/1000000;
		}
		if(from.equals("mm")&& to.equals("cm")) {
			return value/10;
		}
		if(from.equals("mm")&& to.equals("ft")) {
			return value*0.00328084;
		}
		if(from.equals("mm")&& to.equals("in")) {
			return value*0.0393701;
		}
		if(from.equals("mm")&& to.equals("mi")) {
			return value*6.21371e-7;
		}
		// ft conversions
		if(from.equals("ft")&& to.equals("m")) {
			return value*0.3048;
		}
		if(from.equals("ft")&& to.equals("km")) {
			return value*0.0003048;
		}
		if(from.equals("ft")&& to.equals("cm")) {
			return value*30.48;
		}
		if(from.equals("ft")&& to.equals("mm")) {
			return value*304.8;
		}
		if(from.equals("ft")&& to.equals("in")) {
			return value*12;
		}
		if(from.equals("ft")&& to.equals("mi")) {
			return value*0.000189394;
		}
		// in conversions
		if(from.equals("in")&& to.equals("m")) {
			return value*0.0254;
		}
		if(from.equals("in")&& to.equals("km")) {
			return value*0.0000254;
		}
		if(from.equals("in")&& to.equals("cm")) {
			return value*2.54;
		}
		if(from.equals("in")&& to.equals("mm")) {
			return value*25.4;
		}
		if(from.equals("in")&& to.equals("ft")) {
			return value/12;
		}
		if(from.equals("in")&& to.equals("mi")) {
			return value*1.57828e-5;
		}
		// mi conversions
		if(from.equals("mi")&& to.equals("m")) {
			return value*1609.34;
		}
		if(from.equals("mi")&& to.equals("km")) {
			return value*1.60934;
		}
		if(from.equals("mi")&& to.equals("cm")) {
			return value*160934;
		}
		if(from.equals("mi")&& to.equals("mm")) {
			return value*1609340;
		}
		if(from.equals("mi")&& to.equals("ft")) {
			return value*5280;
		}
		if(from.equals("mi")&& to.equals("in")) {
			return value*63360;
		}
		throw new InvalidException("Invalid length units: " + from + " to " + to);
	}
	
	public double convertWight(double value,String from,String to) {
		// kg conversions
		if(from.equals("kg") && to.equals("g")) {
			return value*1000;
		}
		if(from.equals("kg") && to.equals("mg")) {
			return value*1000000;
		}
		if(from.equals("kg") && to.equals("lb")) {
			return value*2.20462;
		}
		if(from.equals("kg") && to.equals("oz")) {
			return value*35.274;
		}
		if(from.equals("kg") && to.equals("t")) {
			return value*0.001;
		}
		// g conversions
		if(from.equals("g") && to.equals("kg")){
			return value/1000;
		}
		if(from.equals("g") && to.equals("mg")) {
			return value*1000;
		}
		if(from.equals("g") && to.equals("lb")) {
			return value*0.00220462;
		}
		if(from.equals("g") && to.equals("oz")) {
			return value*0.035274;
		}
		if(from.equals("g") && to.equals("t")) {
			return value*0.000001;
		}
		// mg conversions
		if(from.equals("mg") && to.equals("kg")) {
			return value/1000000;
		}
		if(from.equals("mg") && to.equals("g")) {
			return value/1000;
		}
		if(from.equals("mg") && to.equals("lb")) {
			return value*2.20462e-6;
		}
		if(from.equals("mg") && to.equals("oz")) {
			return value*3.5274e-5;
		}
		if(from.equals("mg") && to.equals("t")) {
			return value*1e-9;
		}
		// lb conversions
		if(from.equals("lb") && to.equals("kg")) {
			return value*0.453592;
		}
		if(from.equals("lb") && to.equals("g")) {
			return value*453.592;
		}
		if(from.equals("lb") && to.equals("mg")) {
			return value*453592;
		}
		if(from.equals("lb") && to.equals("oz")) {
			return value*16;
		}
		if(from.equals("lb") && to.equals("t")) {
			return value*0.000453592;
		}
		// oz conversions
		if(from.equals("oz") && to.equals("kg")) {
			return value*0.0283495;
		}
		if(from.equals("oz") && to.equals("g")) {
			return value*28.3495;
		}
		if(from.equals("oz") && to.equals("mg")) {
			return value*28349.5;
		}
		if(from.equals("oz") && to.equals("lb")) {
			return value/16;
		}
		if(from.equals("oz") && to.equals("t")) {
			return value*2.83495e-5;
		}
		// t conversions
		if(from.equals("t") && to.equals("kg")) {
			return value*1000;
		}
		if(from.equals("t") && to.equals("g")) {
			return value*1000000;
		}
		if(from.equals("t") && to.equals("mg")) {
			return value*1e9;
		}
		if(from.equals("t") && to.equals("lb")) {
			return value*2204.62;
		}
		if(from.equals("t") && to.equals("oz")) {
			return value*35274;
		}
		throw new InvalidException("Invalid weight units: " + from + " to " + to);
	}
    public double convertVolume(double value, String from, String to) {
		// l conversions
		if (from.equals("l") && to.equals("ml")) {
			return value * 1000;
		}
		if (from.equals("l") && to.equals("m3")) {
			return value * 0.001;
		}
		if (from.equals("l") && to.equals("gal")) {
			return value * 0.264172;
		}
		if (from.equals("l") && to.equals("pt")) {
			return value * 2.11338;
		}
		if (from.equals("l") && to.equals("fl oz")) {
			return value * 33.814;
		}
		// ml conversions
		if (from.equals("ml") && to.equals("l")) {
			return value / 1000;
		}
		if (from.equals("ml") && to.equals("m3")) {
			return value * 0.000001;
		}
		if (from.equals("ml") && to.equals("gal")) {
			return value * 0.000264172;
		}
		if (from.equals("ml") && to.equals("pt")) {
			return value * 0.00211338;
		}
		if (from.equals("ml") && to.equals("fl oz")) {
			return value * 0.033814;
		}
		// m3 conversions
		if (from.equals("m3") && to.equals("l")) {
			return value * 1000;
		}
		if (from.equals("m3") && to.equals("ml")) {
			return value * 1000000;
		}
		if (from.equals("m3") && to.equals("gal")) {
			return value * 264.172;
		}
		if (from.equals("m3") && to.equals("pt")) {
			return value * 2113.38;
		}
		if (from.equals("m3") && to.equals("fl oz")) {
			return value * 33814;
		}
		// gal conversions
		if (from.equals("gal") && to.equals("l")) {
			return value * 3.78541;
		}
		if (from.equals("gal") && to.equals("ml")) {
			return value * 3785.41;
		}
		if (from.equals("gal") && to.equals("m3")) {
			return value * 0.00378541;
		}
		if (from.equals("gal") && to.equals("pt")) {
			return value * 8;
		}
		if (from.equals("gal") && to.equals("fl oz")) {
			return value * 128;
		}
		// pt conversions
		if (from.equals("pt") && to.equals("l")) {
			return value * 0.473176;
		}
		if (from.equals("pt") && to.equals("ml")) {
			return value * 473.176;
		}
		if (from.equals("pt") && to.equals("m3")) {
			return value * 0.000473176;
		}
		if (from.equals("pt") && to.equals("gal")) {
			return value * 0.125;
		}
		if (from.equals("pt") && to.equals("fl oz")) {
			return value * 16;
		}
		// fl oz conversions
		if (from.equals("fl oz") && to.equals("l")) {
			return value * 0.0295735;
		}
		if (from.equals("fl oz") && to.equals("ml")) {
			return value * 29.5735;
		}
		if (from.equals("fl oz") && to.equals("m3")) {
			return value * 0.0000295735;
		}
		if (from.equals("fl oz") && to.equals("gal")) {
			return value * 0.0078125;
		}
		if (from.equals("fl oz") && to.equals("pt")) {
			return value * 0.0625;
		}
		throw new InvalidException("Invalid volume units: " + from + " to " + to);
	}
}
