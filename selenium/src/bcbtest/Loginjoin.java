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

public class Loginjoin {
/*
 * ��¼������ע�ᣬע�������ת��¼
 * 
 */
	public static void main(String[] args){
		
		//�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
        //�Ŵ�
        driver.manage().window().maximize();
        By locator1 = By.xpath("html/body/section[1]/div[3]/h2");  
        Decide.isElementExsit(driver,locator1);  
        Snapshot.snapshot((TakesScreenshot) driver, "������ҳ�ɹ�"+Datatime.getCurrentTime()+".png");
        WebElement login = driver.findElement(By.linkText("��¼"));
        login.click();
        Delay.delay(2);
        
        By locator = By.id("txt_mobile");  
        Decide.isElementExsit(driver,locator);  
        System.out.println("��ת��¼ҳ�ɹ�");
        Snapshot.snapshot((TakesScreenshot) driver, "�����¼����ɹ�"+Datatime.getCurrentTime()+".png");
//        ��ת��ע�����
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[1]/div/form/div[3]/p[1]/a")).click();
        Delay.delay(2);
		By locator2 = By.xpath("html/body/section[1]/div[1]/h2");  
		String txt="ע�ḣ�������˺�";
        Decide.textview(driver,locator2,txt);  
        Snapshot.snapshot((TakesScreenshot) driver, "����ע�����ɹ�"+Datatime.getCurrentTime()+".png");
//        ��ת�ص�¼����
        driver.findElement(By.xpath("html/body/section[1]/div[1]/p/a")).click();
        Delay.delay(2);
        By locator3 = By.id("txt_mobile");  
        Decide.isElementExsit(driver,locator3);  
        System.out.println("��ת��¼ҳ�ɹ�");
        Snapshot.snapshot((TakesScreenshot) driver, "�����¼����ɹ�"+Datatime.getCurrentTime()+".png");
        
		System.out.println("�����໥��ת�ɹ�");
		driver.quit();
	}
}
