package bcbflb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import assist.Decide;
import assist.Delay;
import assist.canshu;

public class open_index {  
	/*
	 * ��ҳ��¼
	 *java����
	 *public static void main(String[] args){}
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
//	        ע��
	        By locator1 = By.linkText("ע��");  
	        Decide.isElementExsit(driver,locator1);  
//	        ������ͼƬ
	        By locator6 = By.xpath(".//*[@id='top']/nav/div/div/a");  
	        Decide.isElementExsit(driver,locator6);  
//	        bannerҳ
	        By locator2 = By.xpath("html/body/div[1]");  
	        Decide.isElementExsit(driver,locator2);  
//	        ��ҵͼƬ
	        By locator3 = By.xpath("html/body/section[1]/div");  
	        Decide.isElementExsit(driver,locator3);  
//	        ��ҵ���׶����ٵĲ�ͬ����
	        By locator4 = By.xpath("html/body/section[3]/div/ul");  
	        Decide.isElementExsit(driver,locator4); 
//	       �������ṩ
	        By locator5 = By.xpath("html/body/section[4]/div/h2");  
	        Decide.isElementExsit(driver,locator5);  
	        
//	        ������ѯ��ť	        
	        By locator7 = By.linkText("������ѯ");  
	        Decide.isElementExsit(driver,locator7);  
	        
	        System.out.println("��ҳ�򿪳ɹ�");
       
        
        
//        driver.get_screenshot_as_file(u"D:/save_screenshot/%s.png" % datetime.now().strftime("%Y%m%d.%H%M%S.%f")[:-3]);
        driver.quit();
    }
	
}
