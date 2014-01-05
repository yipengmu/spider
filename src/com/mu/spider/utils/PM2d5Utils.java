package com.mu.spider.utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.mu.spider.core.bean.CityBean;
import com.mu.spider.core.bean.PM2d5Bean;


public class PM2d5Utils {
	private static PM2d5Utils instance = null;
	
	public static PM2d5Utils getInstance(){ 
		return instance;
	}
	
	/**url对应墨迹天气的PM网页，例如北京：http://pm25.moji001.com/index-33.html*/
	public static PM2d5Bean getPM2d5(String url){ 
		PM2d5Bean pm2d5 = null;
		try {
			URL BJ_PM_URL = new URL(url);
			Document doc = Jsoup.parse(BJ_PM_URL, 5000);
			Element pm2d5Body = doc.getElementById("pm2d5body");
			Elements titleDiv = pm2d5Body.getElementsByClass("pmleftAQItitle");
			Element cityInfo = titleDiv.get(0).getAllElements().get(1);

			Elements valueDiv = pm2d5Body.getElementsByClass("pmleftAQIValue");
			Element pm2d5Info = valueDiv.get(0).getAllElements().get(1);
			
			pm2d5.setCityName(cityInfo.text());
			pm2d5.setPm2d5(pm2d5Info.text());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pm2d5;
	}
}
