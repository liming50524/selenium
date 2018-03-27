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
 * ��˾���¼�
 */
public class datebook {
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
//	    �����������
	    driver.findElement(By.xpath(".//*[@id='nav']/li[5]/a")).click();
	    Delay.delay(2);
	    By locator2 = By.xpath("html/body/section[1]/div[2]/div[1]/h2");  
	    Decide.isElementExsit(driver,locator2);  
	    Snapshot.snapshot((TakesScreenshot) driver, "����������ǽ���ɹ�"+Datatime.getCurrentTime()+".png");
//	    �����˾���¼�
	    driver.findElement(By.xpath(".//*[@id='aboutUs-list']/li[3]/a")).click();
	    Delay.delay(2);
        By locator3 = By.xpath("html/body/section[1]/div[2]/div[2]/h3");  
        Decide.isElementExsit(driver,locator3);  
        
        By locator4 = By.xpath(".//*[@id='years']/li[1]/a");  
        Decide.isElementExsit(driver,locator4);  
        
        By locator5 = By.xpath(".//*[@id='years']/li[2]/a");  
        Decide.isElementExsit(driver,locator5); 
        Snapshot.snapshot((TakesScreenshot) driver, "�򿪹�˾���¼�����ɹ�"+Datatime.getCurrentTime()+".png");
//       ���2015�� �ж���һ�¼�
        driver.findElement(By.xpath(".//*[@id='years']/li[2]/a")).click();
        Delay.delay(2);
        By locator7=By.xpath("html/body/section[1]/div[2]/div[2]/div/ul[2]/li[1]/ul/li[1]/p");
        Decide.isElementExsit(driver,locator7);
        Snapshot.snapshot((TakesScreenshot) driver, "�򿪹�˾2015���¼�����ɹ�"+Datatime.getCurrentTime()+".png");
//        ���2016�� �ж���һ�¼�
        driver.findElement(By.xpath(".//*[@id='years']/li[1]/a")).click();
        Delay.delay(2);
        By locator6=By.xpath("html/body/section[1]/div[2]/div[2]/div/ul[1]/li[1]/ul/li/p");
        Decide.isElementExsit(driver,locator6); 
        Snapshot.snapshot((TakesScreenshot) driver, "�򿪹�˾2016���¼�����ɹ�"+Datatime.getCurrentTime()+".png");
        
        driver.quit();
        
	}
}
