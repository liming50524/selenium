package bcbtest;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import assist.Datatime;
import assist.Decide;
import assist.Delay;
import assist.Snapshot;
import assist.canshu;

public class Loginjoin {
/*
 * 登录界面跳注册，注册界面跳转登录
 * 
 */
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
        WebElement login = driver.findElement(By.linkText("登录"));
        login.click();
        Delay.delay(2);
        
        By locator = By.id("txt_mobile");  
        Decide.isElementExsit(driver,locator);  
        System.out.println("跳转登录页成功");
        Snapshot.snapshot((TakesScreenshot) driver, "进入登录界面成功"+Datatime.getCurrentTime()+".png");
//        跳转到注册界面
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[1]/div/form/div[3]/p[1]/a")).click();
        Delay.delay(2);
		By locator2 = By.xpath("html/body/section[1]/div[1]/h2");  
		String txt="注册福利金融账号";
        Decide.textview(driver,locator2,txt);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入注册界面成功"+Datatime.getCurrentTime()+".png");
//        跳转回登录界面
        driver.findElement(By.xpath("html/body/section[1]/div[1]/p/a")).click();
        Delay.delay(2);
        By locator3 = By.id("txt_mobile");  
        Decide.isElementExsit(driver,locator3);  
        System.out.println("跳转登录页成功");
        Snapshot.snapshot((TakesScreenshot) driver, "进入登录界面成功"+Datatime.getCurrentTime()+".png");
        
		System.out.println("界面相互跳转成功");
		driver.quit();
	}
}
