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

public class addcompany {
	/*
	 * ���빫˾
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
//	        ���빫˾��֤���
	       driver.findElement(By.xpath("html/body/section[3]/div/a")).click();
	       Delay.delay(2);
	        
	        By locator = By.id("txt_mobile");  
	        Decide.isElementExsit(driver,locator);  
	        System.out.println("��ת��¼ҳ�ɹ�");
	        
	        WebElement user=driver.findElement(By.id("txt_mobile"));
	        Delay.delay(1);
	        user.sendKeys(new String[]{"15811853740"});
	        Delay.delay(2);
	        WebElement pasword = driver.findElement(By.id("txt_pwd"));
	        Delay.delay(1);
	        pasword.sendKeys(new String[]{"12345678"});
	        Delay.delay(2);
	        WebElement btn=driver.findElement(By.id("btn_login"));
	        btn.click();          
	        Delay.delay(5);
//	        �ж���֤�����Ƿ����
	        By locator3 = By.xpath(".//*[@id='applyConfirm']");  
	        Decide.isElementExsit(driver,locator3);  
	        System.out.println("��¼�ɹ��ҽ�����빫˾����");                    
	        Snapshot.snapshot((TakesScreenshot) driver,"success"+Datatime.getCurrentTime()+".png");
//	       	���������
	       driver.findElement(By.xpath(".//*[@id='joinCompanyForm']/div[1]/input[1]")).sendKeys(new String[]{"�Զ����빫˾����"});
	       Delay.delay(1);
	       driver.findElement(By.xpath(".//*[@id='joinCompanyForm']/div[1]/input[2]")).sendKeys(new String[]{"�Զ����빫˾����"});
	       Delay.delay(1);
	       driver.findElement(By.xpath(".//*[@id='joinCompanyForm']/div[1]/input[3]")).sendKeys(new String[]{"�Զ����빫˾����"});
	       Delay.delay(1);
//	       �ϴ�����
	       WebElement adFileUpload=driver.findElement(By.xpath(".//*[@id='joinCompanyForm']/div[2]/a[1]/input"));
	       String filePath="E:/Seleniumphoto/time.png";
	       adFileUpload.sendKeys(new String[]{filePath});
//	       �ύ����	       
	       driver.findElement(By.xpath(".//*[@id='applyConfirm']")).click();
	       Delay.delay(1);
/*	       try{
	       By locator4=By.xpath(".//*[@id='joinCompanyForm']/p");
	       Decide.isElementExsit(driver,locator3);  
	       Snapshot.snapshot((TakesScreenshot) driver,"�ظ�����"+time+".png");
	       driver.quit();
	       }catch(Exception e){
//	    	   ���޸ý��棬�����޸ĺ���
	    	   By locator4=By.xpath(".//*[@id='joinCompanyForm']/p");
		       Decide.isElementExsit(driver,locator3);  
		       Snapshot.snapshot((TakesScreenshot) driver,"�ظ�����"+time+".png");
		       driver.quit();
	       }
	       */
	       By locator4=By.xpath(".//*[@id='joinCompanyForm']/p");
	       Decide.isElementExsit(driver,locator4);  
	       Snapshot.snapshot((TakesScreenshot) driver,"�ظ�����"+Datatime.getCurrentTime()+".png");
	       driver.quit();
	        
}

}