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
 * 进入标详情在进行登录买标流程，主要检测用户登录和买标是否正常
 * 图片保存路径在E:\\Seleniumphoto
 */
public class test {
	
	/*java调用
	 public static void main(String[] args){}
	 */
	//testng使用
	public static void main(String[] args){
		
		//如果火狐浏览器没有默认安装在C盘，需要制定其路径
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
		driver.manage().window().maximize();		
		Delay.delay(1);
		//点击理财
		WebElement test9=driver.findElement(By.xpath(".//*[@id='nav']/li[2]/a"));
		test9.click();
		Delay.delay(3);
		//判定项目状态在不在
		By locator = By.xpath("html/body/section[2]/div/div[1]/div");  
        Decide.isElementExsit(driver,locator); 
        Snapshot.snapshot((TakesScreenshot) driver, "list"+Datatime.getCurrentTime()+".png");
        System.out.println("进入福利理财界面成功");
//       点击第二栏的标
        WebElement test2=driver.findElement(By.xpath(".//*[@id='projectlist']/li[1]/a"));
        test2.click();
        Delay.delay(2);
        //点击登录后够买
        driver.findElement(By.xpath("html/body/section[1]/div[3]/p[3]/a")).click();
        Delay.delay(2);
        //判断登录福利金融文案是否存在
        By locator2 = By.xpath("html/body/section[1]/div/form/h2");  
        Decide.isElementExsit(driver,locator2); 
        Snapshot.snapshot((TakesScreenshot) driver, "loginpage"+Datatime.getCurrentTime()+".png");
        System.out.println("进入福利理财登录界面成功");
//        账号和密码输入框 
        driver.findElement(By.xpath(".//*[@id='txt_mobile']")).sendKeys(new String[]{"13642527971"});
        Delay.delay(2);
        driver.findElement(By.xpath(".//*[@id='txt_pwd']")).sendKeys(new String[]{"12345678"});
        Delay.delay(2);
        driver.findElement(By.xpath(".//*[@id='btn_login']")).click();
        Delay.delay(2);
        //判定是否登录成功   是否存在我的账户和立即购买字段
        By locator3 = By.xpath(".//*[@id='top']/nav/div/div/a");  
        Decide.isElementExsit(driver,locator3); 
        Delay.delay(2);
        By locator4 = By.xpath(".//*[@id='btn_preInvest']");  
        Decide.isElementExsit(driver,locator4); 
        Snapshot.snapshot((TakesScreenshot) driver, "loginsucces"+Datatime.getCurrentTime()+".png");
        System.out.println("登录成功且进入到了理财投资界面");
//        输入金额100，点击购买
        driver.findElement(By.xpath(".//*[@id='txt_invest_money']")).sendKeys(new String[]{"100"});
        Delay.delay(1);
        Snapshot.snapshot((TakesScreenshot) driver, "确定输入金额"+Datatime.getCurrentTime()+".png");
        driver.findElement(By.xpath(".//*[@id='btn_preInvest']")).click();
        Delay.delay(3);
//        判定是否弹出交易密码窗口
        By locator5 = By.xpath(".//*[@id='activeBidConfirmForm']/div/div[2]/dl/dd[2]/div/label[1]");  
        Decide.isElementExsit(driver,locator5); 
        Snapshot.snapshot((TakesScreenshot) driver, "弹出交易密码"+Datatime.getCurrentTime()+".png");
        System.out.println("弹出密码输入框成功"); 
//        输入密码
        driver.findElement(By.xpath(".//*[@id='activeBidConfirmForm']/div/div[2]/dl/dd[2]/div/input")).sendKeys(new String[]{"123456"});
        Delay.delay(1);
        driver.findElement(By.xpath(".//*[@id='reg-submit-btn']/span")).click();
        Delay.delay(1);
//        判定是否弹出支付成功字样
        By locator6=By.xpath("html/body/section[1]/div/a");
        Decide.isElementExsit(driver, locator6);
        Snapshot.snapshot((TakesScreenshot) driver, "Buysucces"+Datatime.getCurrentTime()+".png");
        Delay.delay(5);
        System.out.println("投资成功，准备关闭浏览器"); 
        driver.quit();

	}
	
}

//if(2<1){
//	System.out.println("进入详情页成功，但用户未登录");     
//}else {
//	System.out.println("进入详情页成功，但用户已登录");
//}