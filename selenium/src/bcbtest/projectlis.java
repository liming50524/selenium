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

public class projectlis {
	/*
	 * ������ƽ���
	java����
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
        Snapshot.snapshot((TakesScreenshot) driver, "��ҳ�򿪳ɹ�"+Datatime.getCurrentTime()+".png");
        System.out.println("������ҳ�ɹ�");      
        WebElement login = driver.findElement(By.linkText("�������"));
        login.click();
        Delay.delay(2);
//        �ж������Ƿ������Ŀ״���İ�
        By locator1 = By.xpath("html/body/section[2]/div/div[1]/div");  
        Decide.isElementExsit(driver,locator1); 
        Snapshot.snapshot((TakesScreenshot) driver, "��������б�򿪳ɹ�"+Datatime.getCurrentTime()+".png");
        System.out.println("���븣����ƽ���ɹ�");
//        driver.get_screenshot_as_file("D:/save_screenshot/%s.png" % datetime.now().strftime("%Y%m%d.%H%M%S.%f"));
        driver.quit();
        
	}

}
