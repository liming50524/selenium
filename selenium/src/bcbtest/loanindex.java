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
/*
 * 福利借贷界面
 * 
 */

public class loanindex {
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
        By locator = By.xpath(".//*[@id='top']/nav/div/a");  
        Decide.isElementExsit(driver,locator); 
        Snapshot.snapshot((TakesScreenshot) driver, "首页截图"+Datatime.getCurrentTime()+".png");
        System.out.println("进入首页成功");      
        WebElement login = driver.findElement(By.linkText("福利借贷"));
        login.click();
        Delay.delay(2);
//        福利金融借款优势文案
        By locator1 = By.xpath("html/body/section[2]/h1");  
        Decide.isElementExsit(driver,locator1); 
        Snapshot.snapshot((TakesScreenshot) driver, "福利借贷截图"+Datatime.getCurrentTime()+".png");
        System.out.println("进入福利理财界面成功");
//        点击需要什么材料，截图利率界面   可以忽略
        driver.findElement(By.xpath("html/body/section[4]/h1")).click();

        Delay.delay(1);
        Snapshot.snapshot((TakesScreenshot) driver, "利率计算"+Datatime.getCurrentTime()+".png");
        driver.quit();
        
	}

}
