package bcbflb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import assist.Decide;
import assist.Delay;
import assist.canshu;

public class open_index {  
	/*
	 * 首页登录
	 *java调用
	 *public static void main(String[] args){}
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
//	        注册
	        By locator1 = By.linkText("注册");  
	        Decide.isElementExsit(driver,locator1);  
//	        福利保图片
	        By locator6 = By.xpath(".//*[@id='top']/nav/div/div/a");  
	        Decide.isElementExsit(driver,locator6);  
//	        banner页
	        By locator2 = By.xpath("html/body/div[1]");  
	        Decide.isElementExsit(driver,locator2);  
//	        企业图片
	        By locator3 = By.xpath("html/body/section[1]/div");  
	        Decide.isElementExsit(driver,locator3);  
//	        企业各阶段面临的不同问题
	        By locator4 = By.xpath("html/body/section[3]/div/ul");  
	        Decide.isElementExsit(driver,locator4); 
//	       我们能提供
	        By locator5 = By.xpath("html/body/section[4]/div/h2");  
	        Decide.isElementExsit(driver,locator5);  
	        
//	        立即咨询按钮	        
	        By locator7 = By.linkText("立即咨询");  
	        Decide.isElementExsit(driver,locator7);  
	        
	        System.out.println("首页打开成功");
       
        
        
//        driver.get_screenshot_as_file(u"D:/save_screenshot/%s.png" % datetime.now().strftime("%Y%m%d.%H%M%S.%f")[:-3]);
        driver.quit();
    }
	
}
