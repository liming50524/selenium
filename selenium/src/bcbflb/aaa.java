package bcbflb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aaa {

		/*
		 * ע�������
		 */
		public static void main(String[] args){
			
			//�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
	        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
	        WebDriver driver = new ChromeDriver();        
	        driver.get("https://www.baidu.com/");
	        
}

}