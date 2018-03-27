package bcbflb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import assist.Datatime;
import assist.Decide;
import assist.Delay;
import assist.Snapshot;
import assist.canshu;

public class orderEmployerLiabilityInsurance {  
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
        By locator1 = By.xpath(".//*[@id='top']/nav/div/div/a");  
        Decide.isElementExsit(driver,locator1);  
        Snapshot.snapshot((TakesScreenshot) driver, "进入首页成功"+Datatime.getCurrentTime()+".png");
        WebElement login = driver.findElement(By.linkText("登录"));
        login.click();
        Delay.delay(2);
        
        By locator = By.xpath("html/body/section[1]/div/div/div[2]/ul/li");  
        Decide.isElementExsit(driver,locator);  
        System.out.println("跳转登录页成功");
        Snapshot.snapshot((TakesScreenshot) driver, "进入登录界面成功"+Datatime.getCurrentTime()+".png");
        WebElement user=driver.findElement(By.id("txt_email"));
        Delay.delay(1);
        user.sendKeys(new String[]{"tom.li@100cb.cn"});
        Delay.delay(2);
        WebElement pasword = driver.findElement(By.id("txt_pwd"));
        Delay.delay(1);
        pasword.sendKeys(new String[]{"1qaz2wsx"});
        Delay.delay(2);
        WebElement btn=driver.findElement(By.id("btn_login"));
        btn.click();          
        Delay.delay(9);
        By locator2 = By.linkText("退出");  
        Decide.isElementExsit(driver,locator2);  
        System.out.println("登录成功");                    
        Snapshot.snapshot((TakesScreenshot) driver,"success"+Datatime.getCurrentTime()+".png");
//      点击产品中心
        WebElement pro=driver.findElement(By.linkText("产品中心"));
        pro.click();  
        Delay.delay(5);
//      点击团体险中的保险
        WebElement pr1=driver.findElement(By.xpath("html/body/section[1]/div/div[1]/div/div[1]/div[1]/a"));
        pr1.click();  
        Delay.delay(5);
//      进入团险个人界面选择 68元套餐
        WebElement pr2=driver.findElement(By.xpath("html/body/section[1]/div/ul[1]/li[1]"));
        pr2.click();    
        Delay.delay(5);
        /*
//      进入团险个人界面选择 188元套餐
        WebElement pr3=driver.findElement(By.xpath("html/body/section[1]/div/ul[1]/li[2]"));
        pr3.click();    
//   	 进入团险个人界面选择 368元套餐
        WebElement pr4=driver.findElement(By.xpath("html/body/section[1]/div/ul[1]/li[3]"));
        pr4.click();    
// 		 进入团险个人界面选择 698元套餐
        WebElement pr5=driver.findElement(By.xpath("html/body/section[1]/div/ul[1]/li[4]"));
        pr5.click();    
        */
//        立即投保
        WebElement btn1=driver.findElement(By.id("btn_goto_package_detail"));
        btn1.click();   
        Delay.delay(5);
//        立即投保
        WebElement btn2=driver.findElement(By.linkText("立即投保"));
        btn2.click();   
        Delay.delay(5);
//        填写资料界面
/*
 * txt1  人数
 * txt2	投保企业全称 
 * txt3 企业机构分布区域 
 * txt4 投保人姓名 
 * txt5 
 * txt6 联系电话 
 * txt7	投保人邮箱 	
 * txt8	投保人职务 
 * txt9	通讯地址 
 * txt10 上传图片
 * txt11 名单
 * 
 */
        WebElement txt1=driver.findElement(By.id("quantity"));
        Delay.delay(2) ;
        txt1.clear();
        
        txt1.sendKeys("42");      
        WebElement txt11=driver.findElement(By.id("InsurePeopleExcel"));
        Delay.delay(2) ;
        txt11.sendKeys("D:/seleniumfujian/被保人员名单模板.xls");
        
        WebElement txt2=driver.findElement(By.id("EnterpriseName"));
        Delay.delay(2) ;
        txt2.sendKeys("test");  
        
        
        WebElement txt3=driver.findElement(By.id("EnterpriseArea"));
        Delay.delay(2) ;
        txt3.sendKeys("广东广州");  
        
        
        WebElement txt4=driver.findElement(By.id("ManageUserName"));
        Delay.delay(2) ;
        txt4.sendKeys("企业名称");  
        
        
        WebElement txt5=driver.findElement(By.id("ManageUserPhone"));
        Delay.delay(1) ;
        txt5.sendKeys("13642525252");  
        
        
        WebElement txt6=driver.findElement(By.id("ManageUserEmail"));
        txt6.sendKeys("tom.li@100cb.cn");  
        
        
        WebElement txt7=driver.findElement(By.id("ManageUserPosition"));
        Delay.delay(1) ;
        txt7.sendKeys("李三");
        
        WebElement txt8=driver.findElement(By.id("EnterpriseAddr"));
        Delay.delay(1) ;
        txt8.sendKeys("通讯地址");        
        
        
        WebElement txt10=driver.findElement(By.id("EnterpriseBL"));
        Delay.delay(1) ;
        txt10.sendKeys("D:/seleniumfujian/example.png");
        
        
        WebElement btn3=driver.findElement(By.linkText("提交资料"));
        btn3.click();   
        
        Delay.delay(15);
        
        By locator6 = By.linkText("立即联系客服");  
        Decide.isElementExsit(driver,locator6); 
        
        
//        driver.get_screenshot_as_file(u"D:/save_screenshot/%s.png" % datetime.now().strftime("%Y%m%d.%H%M%S.%f")[:-3]);
        driver.quit();
    }
//	隐性等待没调用
	private WebDriver driver;
	  private boolean isElementPresent(By by) { 
		    try { 
		      driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); 
		      driver.findElement(by); 
		      return true; 
		    } catch (NoSuchElementException e) { 
		      return false; 
		    } 
		  }
	
}