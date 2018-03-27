package bcbtest;


import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import assist.Datatime;
import assist.Decide;
import assist.Delay;
import assist.Snapshot;
import assist.canshu;

public class open_index {
	/*
	 * 首页检测
	 */

/*java调用
 public static void main(String[] args){}
 */
//testng使用
	public static void main(String[] args){
		
		//如果火狐浏览器没有默认安装在C盘，需要制定其路径
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
	        //放大
	        driver.manage().window().maximize();
	        Delay.delay(3);
	        By locator1 = By.linkText("注册");  
	        Decide.isElementExsit(driver,locator1);  
//	        精心设计的理财产品
	        By locator2 = By.xpath("html/body/section[1]/div[3]/h2");  
	        Decide.isElementExsit(driver,locator2);  
//	        福利金融·互联网名企员工福利平台 
	        By locator3 = By.xpath("html/body/section[2]/div/h2");  
	        Decide.isElementExsit(driver,locator3);  
//	        申请公司认证
	        By locator4 = By.xpath("html/body/section[3]/div/a");  
	        Decide.isElementExsit(driver,locator4); 
//	        - 他们这样评价福利金融 -
	        By locator5 = By.xpath("html/body/section[4]/div/h2");  
	        Decide.isElementExsit(driver,locator5);  
	        By locator6 = By.linkText("福利理财");  
	        Decide.isElementExsit(driver,locator6);  
	        System.out.println("首页打开成功");
	        Snapshot.snapshot((TakesScreenshot) driver,"open_succes"+Datatime.getCurrentTime()+".png");
	        driver.quit();
	        
	 }
}
