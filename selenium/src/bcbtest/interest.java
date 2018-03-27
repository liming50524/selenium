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

public class interest {
	/*
	 * 福利借贷利息计算
	 */
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
        Delay.delay(2);
//        输入金额开始计算利息
        driver.findElement(By.xpath(".//*[@id='load-amount']")).clear();
        Delay.delay(2);
        driver.findElement(By.xpath(".//*[@id='load-amount']")).sendKeys(new String[]{"500000"});
        Delay.delay(2);
//      点击一个月
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[1]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      判定计算是否正确
        By locate6=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test6="505000.00";
        Decide.textview(driver,locate6, test6);
        
//      点击3个月
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[2]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      判定计算是否正确       
        By locate1=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test5="515000.00";
        Decide.textview(driver,locate1, test5);

//      点击6个月
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[3]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      判定计算是否正确
        By locate2=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test2="530000.00";
        Decide.textview(driver,locate2, test2);
        
//      点击12个月
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[4]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      判定计算是否正确
        By locate3=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test3="534980.00";
        Decide.textview(driver,locate3, test3);
//      点击24个月
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[5]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      判定计算是否正确
        By locate4=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test4="569960.00";
        Decide.textview(driver,locate4, test4);

//      点击36个月
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[6]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      判定计算是否正确
        By locate5=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test8="612500";
        Decide.textview(driver,locate5, test8);

//        Assert.assertTrue(alert.getText().contains("alert"));
        
        
        Snapshot.snapshot((TakesScreenshot) driver, "利率计算"+Datatime.getCurrentTime()+".png");
        driver.quit();
        
	}

}