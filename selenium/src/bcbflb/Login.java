package bcbflb;

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

public class Login {  
	/*
	 * ��ҳ��¼
	 *java����
	 *public static void main(String[] args){}
	 */
	//testngʹ��
	public static void main(String[] args){
		
		//�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
        //�Ŵ�
        driver.manage().window().maximize();
        By locator1 = By.xpath(".//*[@id='top']/nav/div/div/a");  
        Decide.isElementExsit(driver,locator1);  
        Snapshot.snapshot((TakesScreenshot) driver, "������ҳ�ɹ�"+Datatime.getCurrentTime()+".png");
        WebElement login = driver.findElement(By.linkText("��¼"));
        login.click();
        Delay.delay(2);
        
        By locator = By.xpath("html/body/section[1]/div/div/div[2]/ul/li");  
        Decide.isElementExsit(driver,locator);  
        System.out.println("��ת��¼ҳ�ɹ�");
        Snapshot.snapshot((TakesScreenshot) driver, "�����¼����ɹ�"+Datatime.getCurrentTime()+".png");
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
        Delay.delay(5);
        By locator2 = By.linkText("�˳�");  
        Decide.isElementExsit(driver,locator2);  
        System.out.println("��¼�ɹ�");                    
        Snapshot.snapshot((TakesScreenshot) driver,"success"+Datatime.getCurrentTime()+".png");
       
        
        
//        driver.get_screenshot_as_file(u"D:/save_screenshot/%s.png" % datetime.now().strftime("%Y%m%d.%H%M%S.%f")[:-3]);
        driver.quit();
    }
	
}