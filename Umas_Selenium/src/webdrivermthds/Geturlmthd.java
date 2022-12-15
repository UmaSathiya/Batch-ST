package webdrivermthds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturlmthd {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Url is"+driver.getCurrentUrl());
		
	String expextedUrl="https://www.gmail.com/";
	
	String actualUrl=driver.getCurrentUrl();
	
	if(expextedUrl.equals(actualUrl))
	{
		System.out.println("Url is matching");
	}
	else
	{
		System.out.println("Url is not matching");
	}
	}

}
