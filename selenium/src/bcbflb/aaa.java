package bcbflb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aaa {

		/*
		 * 注册界面检查
		 */
		public static void main(String[] args){
			
			//如果火狐浏览器没有默认安装在C盘，需要制定其路径
	        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
	        WebDriver driver = new ChromeDriver();        
	        driver.get("https://www.baidu.com/");
	        
}

}