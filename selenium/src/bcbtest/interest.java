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

public class interest {
	/*
	 * ���������Ϣ����
	 */
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
        Delay.delay(2);
//        �����ʼ������Ϣ
        driver.findElement(By.xpath(".//*[@id='load-amount']")).clear();
        Delay.delay(2);
        driver.findElement(By.xpath(".//*[@id='load-amount']")).sendKeys(new String[]{"500000"});
        Delay.delay(2);
//      ���һ����
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[1]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      �ж������Ƿ���ȷ
        By locate6=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test6="505000.00";
        Decide.textview(driver,locate6, test6);
        
//      ���3����
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[2]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      �ж������Ƿ���ȷ       
        By locate1=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test5="515000.00";
        Decide.textview(driver,locate1, test5);

//      ���6����
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[3]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      �ж������Ƿ���ȷ
        By locate2=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test2="530000.00";
        Decide.textview(driver,locate2, test2);
        
//      ���12����
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[4]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      �ж������Ƿ���ȷ
        By locate3=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test3="534980.00";
        Decide.textview(driver,locate3, test3);
//      ���24����
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[5]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      �ж������Ƿ���ȷ
        By locate4=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test4="569960.00";
        Decide.textview(driver,locate4, test4);

//      ���36����
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/div/ul/li[6]")).click();
        Delay.delay(2);
        driver.findElement(By.xpath("html/body/section[3]/div/div[1]/p")).click();
        Delay.delay(2);
//      �ж������Ƿ���ȷ
        By locate5=By.xpath("html/body/section[3]/div/div[2]/div[2]");
        String	test8="612500";
        Decide.textview(driver,locate5, test8);

//        Assert.assertTrue(alert.getText().contains("alert"));
        
        
        Snapshot.snapshot((TakesScreenshot) driver, "���ʼ���"+Datatime.getCurrentTime()+".png");
        driver.quit();
        
	}

}