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
 * ƽ̨����
 */
public class ptgg {
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
        Delay.delay(2);
//	    �����������
	    driver.findElement(By.xpath(".//*[@id='nav']/li[5]/a")).click();
	    Delay.delay(2);
	    By locator2 = By.xpath("html/body/section[1]/div[2]/div[1]/h2");  
	    Decide.isElementExsit(driver,locator2);  
	    Snapshot.snapshot((TakesScreenshot) driver, "����������ǽ���ɹ�"+Datatime.getCurrentTime()+".png");
//	    ���ƽ̨����
	    driver.findElement(By.xpath(".//*[@id='aboutUs-list']/li[7]/a")).click();
	    Delay.delay(2);
        By locator3 = By.xpath("html/body/section[1]/div[2]/div[2]/h2");  
        Decide.isElementExsit(driver,locator3);  
        
        By locator4 = By.xpath("html/body/section[1]/div[2]/div[2]/ul/li[1]");  
        Decide.isElementExsit(driver,locator4);  
        
        Snapshot.snapshot((TakesScreenshot) driver, "��ƽ̨�������ɹ�"+Datatime.getCurrentTime()+".png");
        driver.quit();
	}
}
