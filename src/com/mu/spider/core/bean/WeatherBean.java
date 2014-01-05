package com.mu.spider.core.bean;

public class WeatherBean {

	private String city;
	
	private String time;
	private String tempHighest;
	private String tempLowest;
	private String weatherDiscription;
	private String weatherTips;
	private int weatherIcon;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTempHighest() {
		return tempHighest;
	}
	public void setTempHighest(String tempHighest) {
		this.tempHighest = tempHighest;
	}
	public String getTempLowest() {
		return tempLowest;
	}
	public void setTempLowest(String tempLowest) {
		this.tempLowest = tempLowest;
	}
	public String getWeatherDiscription() {
		return weatherDiscription;
	}
	public void setWeatherDiscription(String weatherDiscription) {
		this.weatherDiscription = weatherDiscription;
	}
	public String getWeatherTips() {
		return weatherTips;
	}
	public void setWeatherTips(String weatherTips) {
		this.weatherTips = weatherTips;
	}
	public int getWeatherIcon() {
		return weatherIcon;
	}
	public void setWeatherIcon(int weatherIcon) {
		this.weatherIcon = weatherIcon;
	}
	
}
