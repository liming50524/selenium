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
 * �����Ŀ������
 * �����ý������������ͽ���
 */
public class detail {
	public static void main(String[] args){
		
		//�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
		driver.manage().window().maximize();
		By locator1 = By.xpath("html/body/section[1]/div[3]/h2");  
        Decide.isElementExsit(driver,locator1);  
        Snapshot.snapshot((TakesScreenshot) driver, "������ҳ�ɹ�"+Datatime.getCurrentTime()+".png");
//        ����������
        driver.findElement(By.xpath(".//*[@id='nav']/li[2]/a")).click();
        Delay.delay(2);
//        �ж�����ʽ�Ƿ����
        By locator2 = By.xpath("html/body/section[2]/div/div[1]/div");  
        Decide.isElementExsit(driver,locator2);  
//        �Ƿ������Ŀ�б�ѡ���һ��
        By locator3 = By.xpath(".//*[@id='projectlist']/li[1]/a");  
        Decide.isElementExsit(driver,locator3); 
        Snapshot.snapshot((TakesScreenshot) driver, "���븣����ƽ���ɹ�"+Datatime.getCurrentTime()+".png");
        
        driver.findElement(By.xpath(".//*[@id='projectlist']/li[1]/a")).click();
        Delay.delay(5);
//        �����Ŀ��������
        By locator5 = By.xpath("html/body/section[1]/div[2]/ul[2]/li[1]");  
        String txt2="��ֹʱ��";
        Decide.textview(driver,locator5,txt2);
        
        By locator4 = By.xpath("html/body/div[1]/div/ul/li[1]");  
        String txt="��Ŀ����";
        Decide.textview(driver,locator4,txt);     
                
        By locator6 = By.xpath("html/body/div[1]/div/div/div[1]/section[2]/h3");  
        String txt3="�������";
        Decide.textview(driver,locator6,txt3);
        Snapshot.snapshot((TakesScreenshot) driver, "������Ŀ�������ɹ�"+Datatime.getCurrentTime()+".png");
//        ��鰲ȫ����
        driver.findElement(By.xpath("html/body/div[1]/div/ul/li[2]")).click();
        Delay.delay(2);
        By locator7 = By.xpath("html/body/div[1]/div/div/div[2]/ul/li[1]/h3");  
        
        Decide.isElementExsit(driver,locator7);
        By locator8 = By.xpath("html/body/div[1]/div/div/div[2]/ul/li[2]/h3");  
        Decide.isElementExsit(driver,locator8);
        By locator9 = By.xpath("html/body/div[1]/div/div/div[2]/ul/li[3]/h3");  
        Decide.isElementExsit(driver,locator9);
        Snapshot.snapshot((TakesScreenshot) driver, "���밲ȫ���Ͻ���ɹ�"+Datatime.getCurrentTime()+".png");
//        ���Ͷ���б�
        driver.findElement(By.xpath("html/body/div[1]/div/ul/li[3]")).click();
        Delay.delay(2);
        By locator10 = By.xpath(".//*[@id='pinfo-list']/table/thead/tr/th[4]");  
        Decide.isElementExsit(driver,locator10);
        Snapshot.snapshot((TakesScreenshot) driver, "����Ͷ���б����ɹ�"+Datatime.getCurrentTime()+".png");
        System.out.println("��Ŀ��������ϣ��ر������");
        driver.quit();
		
		
	}
}
