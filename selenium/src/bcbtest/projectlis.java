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

public class projectlis {
	/*
	 * 福利理财界面
	java调用
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
        Snapshot.snapshot((TakesScreenshot) driver, "首页打开成功"+Datatime.getCurrentTime()+".png");
        System.out.println("进入首页成功");      
        WebElement login = driver.findElement(By.linkText("福利理财"));
        login.click();
        Delay.delay(2);
//        判定界面是否存在项目状体文案
        By locator1 = By.xpath("html/body/section[2]/div/div[1]/div");  
        Decide.isElementExsit(driver,locator1); 
        Snapshot.snapshot((TakesScreenshot) driver, "福利理财列表打开成功"+Datatime.getCurrentTime()+".png");
        System.out.println("进入福利理财界面成功");
//        driver.get_screenshot_as_file("D:/save_screenshot/%s.png" % datetime.now().strftime("%Y%m%d.%H%M%S.%f"));
        driver.quit();
        
	}

}
