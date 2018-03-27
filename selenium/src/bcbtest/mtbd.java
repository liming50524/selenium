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
/*
 * 媒体报道
 */
public class mtbd {
	public static void main(String[] args){
		
		//如果火狐浏览器没有默认安装在C盘，需要制定其路径
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
        //放大
        driver.manage().window().maximize();
        By locator1 = By.xpath("html/body/section[1]/div[3]/h2");  
        Decide.isElementExsit(driver,locator1);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入首页成功"+Datatime.getCurrentTime()+".png");
        Delay.delay(2);
//	    点击关于我们
	    driver.findElement(By.xpath(".//*[@id='nav']/li[5]/a")).click();
	    Delay.delay(2);
	    By locator2 = By.xpath("html/body/section[1]/div[2]/div[1]/h2");  
	    Decide.isElementExsit(driver,locator2);  
	    Snapshot.snapshot((TakesScreenshot) driver, "进入关于我们界面成功"+Datatime.getCurrentTime()+".png");
//	    点击媒体报道
	    driver.findElement(By.xpath(".//*[@id='aboutUs-list']/li[6]/a")).click();
	    Delay.delay(2);
        By locator3 = By.xpath("html/body/section[1]/div[2]/div[2]/h2");  
        Decide.isElementExsit(driver,locator3);  
        
        By locator4 = By.xpath("html/body/section[1]/div[2]/div[2]/ul/li[1]");  
        Decide.isElementExsit(driver,locator4);  
        
        By locator5 = By.xpath("html/body/section[1]/div[2]/div[2]/ul/li[1]/img");  
        Decide.isElementExsit(driver,locator5); 
        Snapshot.snapshot((TakesScreenshot) driver, "打开媒体报道界面成功"+Datatime.getCurrentTime()+".png");
        driver.quit();
	}
}
