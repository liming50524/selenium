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

public class open_index {
	/*
	 * ��ҳ���
	 */

/*java����
 public static void main(String[] args){}
 */
//testngʹ��
	public static void main(String[] args){
		
		//�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
	        //�Ŵ�
	        driver.manage().window().maximize();
	        Delay.delay(3);
	        By locator1 = By.linkText("ע��");  
	        Decide.isElementExsit(driver,locator1);  
//	        ������Ƶ���Ʋ�Ʒ
	        By locator2 = By.xpath("html/body/section[1]/div[3]/h2");  
	        Decide.isElementExsit(driver,locator2);  
//	        �������ڡ�����������Ա������ƽ̨ 
	        By locator3 = By.xpath("html/body/section[2]/div/h2");  
	        Decide.isElementExsit(driver,locator3);  
//	        ���빫˾��֤
	        By locator4 = By.xpath("html/body/section[3]/div/a");  
	        Decide.isElementExsit(driver,locator4); 
//	        - �����������۸������� -
	        By locator5 = By.xpath("html/body/section[4]/div/h2");  
	        Decide.isElementExsit(driver,locator5);  
	        By locator6 = By.linkText("�������");  
	        Decide.isElementExsit(driver,locator6);  
	        System.out.println("��ҳ�򿪳ɹ�");
	        Snapshot.snapshot((TakesScreenshot) driver,"open_succes"+Datatime.getCurrentTime()+".png");
	        driver.quit();
	        
	 }
}
