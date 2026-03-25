package com.example.UnitsConverter.model;

public class TimeResponesModel {
	
	private String sourceTime;
	private String targetTime;
	private String from;
	private String to ;
	
	public TimeResponesModel(String sourceTime,String targetTime,String from,String to) {
		this.sourceTime=sourceTime;
		this.targetTime=targetTime;
		this.from=from;
		this.to=to;
	}

	public String getSourceTime() {
		return sourceTime;
	}

	public void setSourceTime(String sourceTime) {
		this.sourceTime = sourceTime;
	}

	public String getTargetTime() {
		return targetTime;
	}

	public void setTargetTime(String targetTime) {
		this.targetTime = targetTime;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
    
}
