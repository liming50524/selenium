package bcbflb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import assist.Datatime;
import assist.Decide;
import assist.Delay;
import assist.Snapshot;
import assist.canshu;

public class orderEmployerLiabilityInsurance {  
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
        By locator1 = By.xpath(".//*[@id='top']/nav/div/div/a");  
        Decide.isElementExsit(driver,locator1);  
        Snapshot.snapshot((TakesScreenshot) driver, "������ҳ�ɹ�"+Datatime.getCurrentTime()+".png");
        WebElement login = driver.findElement(By.linkText("��¼"));
        login.click();
        Delay.delay(2);
        
        By locator = By.xpath("html/body/section[1]/div/div/div[2]/ul/li");  
        Decide.isElementExsit(driver,locator);  
        System.out.println("��ת��¼ҳ�ɹ�");
        Snapshot.snapshot((TakesScreenshot) driver, "�����¼����ɹ�"+Datatime.getCurrentTime()+".png");
        WebElement user=driver.findElement(By.id("txt_email"));
        Delay.delay(1);
        user.sendKeys(new String[]{"tom.li@100cb.cn"});
        Delay.delay(2);
        WebElement pasword = driver.findElement(By.id("txt_pwd"));
        Delay.delay(1);
        pasword.sendKeys(new String[]{"1qaz2wsx"});
        Delay.delay(2);
        WebElement btn=driver.findElement(By.id("btn_login"));
        btn.click();          
        Delay.delay(9);
        By locator2 = By.linkText("�˳�");  
        Decide.isElementExsit(driver,locator2);  
        System.out.println("��¼�ɹ�");                    
        Snapshot.snapshot((TakesScreenshot) driver,"success"+Datatime.getCurrentTime()+".png");
//      �����Ʒ����
        WebElement pro=driver.findElement(By.linkText("��Ʒ����"));
        pro.click();  
        Delay.delay(5);
//      ����������еı���
        WebElement pr1=driver.findElement(By.xpath("html/body/section[1]/div/div[1]/div/div[1]/div[1]/a"));
        pr1.click();  
        Delay.delay(5);
//      �������ո��˽���ѡ�� 68Ԫ�ײ�
        WebElement pr2=driver.findElement(By.xpath("html/body/section[1]/div/ul[1]/li[1]"));
        pr2.click();    
        Delay.delay(5);
        /*
//      �������ո��˽���ѡ�� 188Ԫ�ײ�
        WebElement pr3=driver.findElement(By.xpath("html/body/section[1]/div/ul[1]/li[2]"));
        pr3.click();    
//   	 �������ո��˽���ѡ�� 368Ԫ�ײ�
        WebElement pr4=driver.findElement(By.xpath("html/body/section[1]/div/ul[1]/li[3]"));
        pr4.click();    
// 		 �������ո��˽���ѡ�� 698Ԫ�ײ�
        WebElement pr5=driver.findElement(By.xpath("html/body/section[1]/div/ul[1]/li[4]"));
        pr5.click();    
        */
//        ����Ͷ��
        WebElement btn1=driver.findElement(By.id("btn_goto_package_detail"));
        btn1.click();   
        Delay.delay(5);
//        ����Ͷ��
        WebElement btn2=driver.findElement(By.linkText("����Ͷ��"));
        btn2.click();   
        Delay.delay(5);
//        ��д���Ͻ���
/*
 * txt1  ����
 * txt2	Ͷ����ҵȫ�� 
 * txt3 ��ҵ�����ֲ����� 
 * txt4 Ͷ�������� 
 * txt5 
 * txt6 ��ϵ�绰 
 * txt7	Ͷ�������� 	
 * txt8	Ͷ����ְ�� 
 * txt9	ͨѶ��ַ 
 * txt10 �ϴ�ͼƬ
 * txt11 ����
 * 
 */
        WebElement txt1=driver.findElement(By.id("quantity"));
        Delay.delay(2) ;
        txt1.clear();
        
        txt1.sendKeys("42");      
        WebElement txt11=driver.findElement(By.id("InsurePeopleExcel"));
        Delay.delay(2) ;
        txt11.sendKeys("D:/seleniumfujian/������Ա����ģ��.xls");
        
        WebElement txt2=driver.findElement(By.id("EnterpriseName"));
        Delay.delay(2) ;
        txt2.sendKeys("test");  
        
        
        WebElement txt3=driver.findElement(By.id("EnterpriseArea"));
        Delay.delay(2) ;
        txt3.sendKeys("�㶫����");  
        
        
        WebElement txt4=driver.findElement(By.id("ManageUserName"));
        Delay.delay(2) ;
        txt4.sendKeys("��ҵ����");  
        
        
        WebElement txt5=driver.findElement(By.id("ManageUserPhone"));
        Delay.delay(1) ;
        txt5.sendKeys("13642525252");  
        
        
        WebElement txt6=driver.findElement(By.id("ManageUserEmail"));
        txt6.sendKeys("tom.li@100cb.cn");  
        
        
        WebElement txt7=driver.findElement(By.id("ManageUserPosition"));
        Delay.delay(1) ;
        txt7.sendKeys("����");
        
        WebElement txt8=driver.findElement(By.id("EnterpriseAddr"));
        Delay.delay(1) ;
        txt8.sendKeys("ͨѶ��ַ");        
        
        
        WebElement txt10=driver.findElement(By.id("EnterpriseBL"));
        Delay.delay(1) ;
        txt10.sendKeys("D:/seleniumfujian/example.png");
        
        
        WebElement btn3=driver.findElement(By.linkText("�ύ����"));
        btn3.click();   
        
        Delay.delay(15);
        
        By locator6 = By.linkText("������ϵ�ͷ�");  
        Decide.isElementExsit(driver,locator6); 
        
        
//        driver.get_screenshot_as_file(u"D:/save_screenshot/%s.png" % datetime.now().strftime("%Y%m%d.%H%M%S.%f")[:-3]);
        driver.quit();
    }
//	���Եȴ�û����
	private WebDriver driver;
	  private boolean isElementPresent(By by) { 
		    try { 
		      driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); 
		      driver.findElement(by); 
		      return true; 
		    } catch (NoSuchElementException e) { 
		      return false; 
		    } 
		  }
	
}