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
 * 理财项目详情检测
 * 包括该界面下三个类型界面
 */
public class detail {
	public static void main(String[] args){
		
		//如果火狐浏览器没有默认安装在C盘，需要制定其路径
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
		driver.manage().window().maximize();
		By locator1 = By.xpath("html/body/section[1]/div[3]/h2");  
        Decide.isElementExsit(driver,locator1);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入首页成功"+Datatime.getCurrentTime()+".png");
//        点击福利理财
        driver.findElement(By.xpath(".//*[@id='nav']/li[2]/a")).click();
        Delay.delay(2);
//        判定排序方式是否存在
        By locator2 = By.xpath("html/body/section[2]/div/div[1]/div");  
        Decide.isElementExsit(driver,locator2);  
//        是否存在项目列表选择第一列
        By locator3 = By.xpath(".//*[@id='projectlist']/li[1]/a");  
        Decide.isElementExsit(driver,locator3); 
        Snapshot.snapshot((TakesScreenshot) driver, "进入福利理财界面成功"+Datatime.getCurrentTime()+".png");
        
        driver.findElement(By.xpath(".//*[@id='projectlist']/li[1]/a")).click();
        Delay.delay(5);
//        检查项目详情内容
        By locator5 = By.xpath("html/body/section[1]/div[2]/ul[2]/li[1]");  
        String txt2="截止时间";
        Decide.textview(driver,locator5,txt2);
        
        By locator4 = By.xpath("html/body/div[1]/div/ul/li[1]");  
        String txt="项目详情";
        Decide.textview(driver,locator4,txt);     
                
        By locator6 = By.xpath("html/body/div[1]/div/div/div[1]/section[2]/h3");  
        String txt3="审核内容";
        Decide.textview(driver,locator6,txt3);
        Snapshot.snapshot((TakesScreenshot) driver, "进入项目详情界面成功"+Datatime.getCurrentTime()+".png");
//        检查安全保障
        driver.findElement(By.xpath("html/body/div[1]/div/ul/li[2]")).click();
        Delay.delay(2);
        By locator7 = By.xpath("html/body/div[1]/div/div/div[2]/ul/li[1]/h3");  
        
        Decide.isElementExsit(driver,locator7);
        By locator8 = By.xpath("html/body/div[1]/div/div/div[2]/ul/li[2]/h3");  
        Decide.isElementExsit(driver,locator8);
        By locator9 = By.xpath("html/body/div[1]/div/div/div[2]/ul/li[3]/h3");  
        Decide.isElementExsit(driver,locator9);
        Snapshot.snapshot((TakesScreenshot) driver, "进入安全保障界面成功"+Datatime.getCurrentTime()+".png");
//        检查投资列表
        driver.findElement(By.xpath("html/body/div[1]/div/ul/li[3]")).click();
        Delay.delay(2);
        By locator10 = By.xpath(".//*[@id='pinfo-list']/table/thead/tr/th[4]");  
        Decide.isElementExsit(driver,locator10);
        Snapshot.snapshot((TakesScreenshot) driver, "进入投资列表界面成功"+Datatime.getCurrentTime()+".png");
        System.out.println("项目详情检测完毕，关闭浏览器");
        driver.quit();
		
		
	}
}
