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
 * ����������ڽ��е�¼������̣���Ҫ����û���¼������Ƿ�����
 * ͼƬ����·����E:\\Seleniumphoto
 */
public class test {
	
	/*java����
	 public static void main(String[] args){}
	 */
	//testngʹ��
	public static void main(String[] args){
		
		//�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();        
        driver.get(canshu.bcbUrl());
		driver.manage().window().maximize();		
		Delay.delay(1);
		//������
		WebElement test9=driver.findElement(By.xpath(".//*[@id='nav']/li[2]/a"));
		test9.click();
		Delay.delay(3);
		//�ж���Ŀ״̬�ڲ���
		By locator = By.xpath("html/body/section[2]/div/div[1]/div");  
        Decide.isElementExsit(driver,locator); 
        Snapshot.snapshot((TakesScreenshot) driver, "list"+Datatime.getCurrentTime()+".png");
        System.out.println("���븣����ƽ���ɹ�");
//       ����ڶ����ı�
        WebElement test2=driver.findElement(By.xpath(".//*[@id='projectlist']/li[1]/a"));
        test2.click();
        Delay.delay(2);
        //�����¼����
        driver.findElement(By.xpath("html/body/section[1]/div[3]/p[3]/a")).click();
        Delay.delay(2);
        //�жϵ�¼���������İ��Ƿ����
        By locator2 = By.xpath("html/body/section[1]/div/form/h2");  
        Decide.isElementExsit(driver,locator2); 
        Snapshot.snapshot((TakesScreenshot) driver, "loginpage"+Datatime.getCurrentTime()+".png");
        System.out.println("���븣����Ƶ�¼����ɹ�");
//        �˺ź���������� 
        driver.findElement(By.xpath(".//*[@id='txt_mobile']")).sendKeys(new String[]{"13642527971"});
        Delay.delay(2);
        driver.findElement(By.xpath(".//*[@id='txt_pwd']")).sendKeys(new String[]{"12345678"});
        Delay.delay(2);
        driver.findElement(By.xpath(".//*[@id='btn_login']")).click();
        Delay.delay(2);
        //�ж��Ƿ��¼�ɹ�   �Ƿ�����ҵ��˻������������ֶ�
        By locator3 = By.xpath(".//*[@id='top']/nav/div/div/a");  
        Decide.isElementExsit(driver,locator3); 
        Delay.delay(2);
        By locator4 = By.xpath(".//*[@id='btn_preInvest']");  
        Decide.isElementExsit(driver,locator4); 
        Snapshot.snapshot((TakesScreenshot) driver, "loginsucces"+Datatime.getCurrentTime()+".png");
        System.out.println("��¼�ɹ��ҽ��뵽�����Ͷ�ʽ���");
//        ������100���������
        driver.findElement(By.xpath(".//*[@id='txt_invest_money']")).sendKeys(new String[]{"100"});
        Delay.delay(1);
        Snapshot.snapshot((TakesScreenshot) driver, "ȷ��������"+Datatime.getCurrentTime()+".png");
        driver.findElement(By.xpath(".//*[@id='btn_preInvest']")).click();
        Delay.delay(3);
//        �ж��Ƿ񵯳��������봰��
        By locator5 = By.xpath(".//*[@id='activeBidConfirmForm']/div/div[2]/dl/dd[2]/div/label[1]");  
        Decide.isElementExsit(driver,locator5); 
        Snapshot.snapshot((TakesScreenshot) driver, "������������"+Datatime.getCurrentTime()+".png");
        System.out.println("�������������ɹ�"); 
//        ��������
        driver.findElement(By.xpath(".//*[@id='activeBidConfirmForm']/div/div[2]/dl/dd[2]/div/input")).sendKeys(new String[]{"123456"});
        Delay.delay(1);
        driver.findElement(By.xpath(".//*[@id='reg-submit-btn']/span")).click();
        Delay.delay(1);
//        �ж��Ƿ񵯳�֧���ɹ�����
        By locator6=By.xpath("html/body/section[1]/div/a");
        Decide.isElementExsit(driver, locator6);
        Snapshot.snapshot((TakesScreenshot) driver, "Buysucces"+Datatime.getCurrentTime()+".png");
        Delay.delay(5);
        System.out.println("Ͷ�ʳɹ���׼���ر������"); 
        driver.quit();

	}
	
}

//if(2<1){
//	System.out.println("��������ҳ�ɹ������û�δ��¼");     
//}else {
//	System.out.println("��������ҳ�ɹ������û��ѵ�¼");
//}