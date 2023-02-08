package com.inetBanking.utilitiy;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		}catch (Exception e) {
			System.out.println("Exception is"+e.getMessage());
			// TODO: handle exception
		}
	}
	public String getChromeDriverPath()
	{
		String path=pro.getProperty("chromeDriver");
		return path;
	}
	public String getUserId()
	{
		String userId=pro.getProperty("userId");
		return userId;
	}
	public String getpassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String getApplicationURl()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getFireFoxBrowserPath()
	{
		String path=pro.getProperty("firefoxpath");
		return path;
	}
	
}
