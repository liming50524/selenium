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
 * �����������
 * 
 */

public class loanindex {
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
        By locator = By.xpath(".//*[@id='top']/nav/div/a");  
        Decide.isElementExsit(driver,locator); 
        Snapshot.snapshot((TakesScreenshot) driver, "��ҳ��ͼ"+Datatime.getCurrentTime()+".png");
        System.out.println("������ҳ�ɹ�");      
        WebElement login = driver.findElement(By.linkText("�������"));
        login.click();
        Delay.delay(2);
//        �������ڽ�������İ�
        By locator1 = By.xpath("html/body/section[2]/h1");  
        Decide.isElementExsit(driver,locator1); 
        Snapshot.snapshot((TakesScreenshot) driver, "���������ͼ"+Datatime.getCurrentTime()+".png");
        System.out.println("���븣����ƽ���ɹ�");
//        �����Ҫʲô���ϣ���ͼ���ʽ���   ���Ժ���
        driver.findElement(By.xpath("html/body/section[4]/h1")).click();

        Delay.delay(1);
        Snapshot.snapshot((TakesScreenshot) driver, "���ʼ���"+Datatime.getCurrentTime()+".png");
        driver.quit();
        
	}

}
