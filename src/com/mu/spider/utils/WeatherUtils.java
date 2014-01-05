package com.mu.spider.utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.mu.spider.core.bean.PM2d5Bean;
import com.mu.spider.core.bean.WeatherBean;

public class WeatherUtils {
	
	/**url对应天气网的气象网页，例如北京：http://beijing.tianqi.com*/
	public static WeatherBean getWeather(String url){ 
		WeatherBean weather = new WeatherBean();
		try {
			URL BJ_PM_URL = new URL(url);
			Document doc = Jsoup.parse(BJ_PM_URL, 5000);
			Element tWeather = doc.getElementById("today");
			Elements todayData = tWeather.getAllElements();

			weather.setCity(todayData.get(1).text());
			weather.setTempHighest(todayData.get(8).text());
			weather.setTempLowest(todayData.get(9).text());
			weather.setTime(todayData.get(3).text());
			weather.setWeatherDiscription(todayData.get(11).text());
//			weather.setWeatherIcon(todayData.get(5).text());
//			weather.setWeatherTips(todayData.get(5).text());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return weather;
	}
	
	public static void main(String[] args) {
		WeatherUtils.getWeather("http://beijing.tianqi.com");
	}
}
