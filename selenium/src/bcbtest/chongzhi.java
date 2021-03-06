package bcbtest;

import java.util.List;

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
import excel.*;
public class chongzhi {  
	/*
	 * 首页登录
	 *java调用
	 *public static void main(String[] args){}
	 */
	//testng使用
static	String sourceFile="你文件的路径和文件名称";
	public static void main(String[] args){
		//初始化ExcelWorkBook Class
		try{
		ExcelWorkBook excelbook=new ExcelWorkBook();
		//把取出的username放在userlist集合里面
		List<String> userList=excelbook.readUsername(sourceFile);
		//把取出的password放在passlist集合里面
			List<String> passList=excelbook.readPassword(sourceFile);
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
        int usersize=userList.size();
        for(int i=0;i<usersize ;i++){
        WebElement user=driver.findElement(By.id("txt_mobile"));
        Delay.delay(1);
        user.sendKeys(new String[]{"book"});
        Delay.delay(2);
        
        
        WebElement pasword = driver.findElement(By.id("txt_pwd"));
        Delay.delay(1);
        pasword.sendKeys(new String[]{"12345678"});
        Delay.delay(2);
        WebElement btn=driver.findElement(By.id("btn_login"));
        btn.click();          
        Delay.delay(5);
        By locator2 = By.linkText("我的账户");  
        Decide.isElementExsit(driver,locator2);  
        System.out.println("登录成功");                    
        Snapshot.snapshot((TakesScreenshot) driver,"success"+Datatime.getCurrentTime()+".png");
        }
//        退出登录状态
        
        
        
//        driver.get_screenshot_as_file(u"D:/save_screenshot/%s.png" % datetime.now().strftime("%Y%m%d.%H%M%S.%f")[:-3]);
        driver.quit();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
	
}