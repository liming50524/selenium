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

public class join {
	/*
	 * ע�������
	 */
	public static void main(String[] args){
		
		//�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
		
		driver.manage().window().maximize();
		
		By locator1 = By.xpath("html/body/section[1]/div[3]/h2");  
        Decide.isElementExsit(driver,locator1);  
        Snapshot.snapshot((TakesScreenshot) driver, "������ҳ�ɹ�"+Datatime.getCurrentTime()+".png");
        
		WebElement join=driver.findElement(By.xpath(".//*[@id='top']/nav/div/div/a[1]"));
		join.click();
		Delay.delay(2);
		By locator2 = By.xpath("html/body/section[1]/div[1]/h2");  
		String txt="ע�ḣ�������˺�";
        Decide.textview(driver,locator2,txt);  
        Snapshot.snapshot((TakesScreenshot) driver, "����ע�����ɹ�"+Datatime.getCurrentTime()+".png");
//        ���������Ϊ��ʱ��ʾ��
        driver.findElement(By.xpath(".//*[@id='btn_regist']")).click();
        Delay.delay(2);
        By locator3 = By.xpath("html/body/section[1]/div[1]/form/ul/li[3]/span[1]");  
		
        Decide.isElementExsit(driver,locator3);  
        Snapshot.snapshot((TakesScreenshot) driver, "������ʾ��ɹ�"+Datatime.getCurrentTime()+".png");
        System.out.println("ע����������");
        driver.quit();
		
	}
}
