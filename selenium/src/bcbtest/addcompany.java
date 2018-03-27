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

public class addcompany {
	/*
	 * 加入公司
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
//	        申请公司认证点击
	       driver.findElement(By.xpath("html/body/section[3]/div/a")).click();
	       Delay.delay(2);
	        
	        By locator = By.id("txt_mobile");  
	        Decide.isElementExsit(driver,locator);  
	        System.out.println("跳转登录页成功");
	        
	        WebElement user=driver.findElement(By.id("txt_mobile"));
	        Delay.delay(1);
	        user.sendKeys(new String[]{"15811853740"});
	        Delay.delay(2);
	        WebElement pasword = driver.findElement(By.id("txt_pwd"));
	        Delay.delay(1);
	        pasword.sendKeys(new String[]{"12345678"});
	        Delay.delay(2);
	        WebElement btn=driver.findElement(By.id("btn_login"));
	        btn.click();          
	        Delay.delay(5);
//	        判定认证材料是否存在
	        By locator3 = By.xpath(".//*[@id='applyConfirm']");  
	        Decide.isElementExsit(driver,locator3);  
	        System.out.println("登录成功且进入加入公司界面");                    
	        Snapshot.snapshot((TakesScreenshot) driver,"success"+Datatime.getCurrentTime()+".png");
//	       	三个输入框
	       driver.findElement(By.xpath(".//*[@id='joinCompanyForm']/div[1]/input[1]")).sendKeys(new String[]{"自动加入公司测试"});
	       Delay.delay(1);
	       driver.findElement(By.xpath(".//*[@id='joinCompanyForm']/div[1]/input[2]")).sendKeys(new String[]{"自动加入公司测试"});
	       Delay.delay(1);
	       driver.findElement(By.xpath(".//*[@id='joinCompanyForm']/div[1]/input[3]")).sendKeys(new String[]{"自动加入公司测试"});
	       Delay.delay(1);
//	       上传附件
	       WebElement adFileUpload=driver.findElement(By.xpath(".//*[@id='joinCompanyForm']/div[2]/a[1]/input"));
	       String filePath="E:/Seleniumphoto/time.png";
	       adFileUpload.sendKeys(new String[]{filePath});
//	       提交申请	       
	       driver.findElement(By.xpath(".//*[@id='applyConfirm']")).click();
	       Delay.delay(1);
/*	       try{
	       By locator4=By.xpath(".//*[@id='joinCompanyForm']/p");
	       Decide.isElementExsit(driver,locator3);  
	       Snapshot.snapshot((TakesScreenshot) driver,"重复申请"+time+".png");
	       driver.quit();
	       }catch(Exception e){
//	    	   暂无该界面，后期修改函数
	    	   By locator4=By.xpath(".//*[@id='joinCompanyForm']/p");
		       Decide.isElementExsit(driver,locator3);  
		       Snapshot.snapshot((TakesScreenshot) driver,"重复申请"+time+".png");
		       driver.quit();
	       }
	       */
	       By locator4=By.xpath(".//*[@id='joinCompanyForm']/p");
	       Decide.isElementExsit(driver,locator4);  
	       Snapshot.snapshot((TakesScreenshot) driver,"重复申请"+Datatime.getCurrentTime()+".png");
	       driver.quit();
	        
}

}