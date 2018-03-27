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

public class special {
/*
 * 安全保障
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
        Delay.delay(2);
        driver.findElement(By.xpath(".//*[@id='nav']/li[4]/a")).click();
        Delay.delay(2);
        By locator2 = By.xpath("html/body/section[1]/div/h2");  
        Decide.isElementExsit(driver,locator2);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入安全保障"+Datatime.getCurrentTime()+".png");
//        点击后截图
        Delay.delay(4);
        driver.findElement(By.xpath("html/body/section[2]/div/h2")).click();
        By locator3 = By.xpath("html/body/section[2]/div/h2");  
        Decide.isElementExsit(driver,locator3);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入安全保障"+Datatime.getCurrentTime()+".png");
        Delay.delay(5);
        driver.findElement(By.xpath("html/body/section[3]/h2")).click();
        By locator4 = By.xpath("html/body/section[3]/h2");  
        Decide.isElementExsit(driver,locator4);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入安全保障"+Datatime.getCurrentTime()+".png");
        Delay.delay(5);
        driver.findElement(By.xpath("html/body/section[4]/div/h2")).click();
        By locator5 = By.xpath("html/body/section[4]/div/h2");  
        Decide.isElementExsit(driver,locator5);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入安全保障"+Datatime.getCurrentTime()+".png");
        Delay.delay(5);
        driver.findElement(By.xpath("html/body/section[5]/h2")).click();
        By locator6 = By.xpath("html/body/section[5]/h2");  
        Decide.isElementExsit(driver,locator6);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入安全保障"+Datatime.getCurrentTime()+".png");
        Delay.delay(5);
        driver.findElement(By.xpath("html/body/section[6]/div/h2")).click();
        By locator7 = By.xpath("html/body/section[6]/div/h2");  
        Decide.isElementExsit(driver,locator7);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入安全保障"+Datatime.getCurrentTime()+".png");
        Delay.delay(4);
        driver.findElement(By.xpath("html/body/section[8]/p")).click();
        By locator8 = By.xpath("html/body/section[8]/p");  
        Decide.isElementExsit(driver,locator8);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入安全保障"+Datatime.getCurrentTime()+".png");
        System.out.println("进入安全保障成功，关闭浏览器");
        driver.quit();
	}
}
