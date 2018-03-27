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

public class join {
	/*
	 * 注册界面检查
	 */
	public static void main(String[] args){
		
		//如果火狐浏览器没有默认安装在C盘，需要制定其路径
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
		
		driver.manage().window().maximize();
		
		By locator1 = By.xpath("html/body/section[1]/div[3]/h2");  
        Decide.isElementExsit(driver,locator1);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入首页成功"+Datatime.getCurrentTime()+".png");
        
		WebElement join=driver.findElement(By.xpath(".//*[@id='top']/nav/div/div/a[1]"));
		join.click();
		Delay.delay(2);
		By locator2 = By.xpath("html/body/section[1]/div[1]/h2");  
		String txt="注册福利金融账号";
        Decide.textview(driver,locator2,txt);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入注册界面成功"+Datatime.getCurrentTime()+".png");
//        测试输入框为空时提示语
        driver.findElement(By.xpath(".//*[@id='btn_regist']")).click();
        Delay.delay(2);
        By locator3 = By.xpath("html/body/section[1]/div[1]/form/ul/li[3]/span[1]");  
		
        Decide.isElementExsit(driver,locator3);  
        Snapshot.snapshot((TakesScreenshot) driver, "弹出提示语成功"+Datatime.getCurrentTime()+".png");
        System.out.println("注册界面检查完毕");
        driver.quit();
		
	}
}
