package assist;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) {
 String a="tj_login";
		// creachwindows
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();  
		driver.get("http://www.baidu.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*(new WebDriverWait(driver, 30)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });
        */
		//
		String sreach_handle = driver.getWindowHandle();
		Delay.delay(2);
		System.out.println(sreach_handle);
//		driver.findElement(By.linkText("��¼")).click();
//		driver.findElement(By.tagName(a))
//		.click();
//		driver.findElement(By.id("u1")).click();
//		Delay.delay(2);
		WebElement test=driver.findElement(By.name("tj_briicon"));
		System.out.println("stet");
		test.click();
				
		//���̳�ʱ3��
		(new WebDriverWait(driver, 3)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });
		driver.findElement(By.linkText("����ע��")).click();
		Set<String> handles = driver.getWindowHandles();
		//�ж��Ƿ�Ϊע�ᴰ��
		for(String handle : handles){
			if(handle.equals(sreach_handle)==false){
				driver.switchTo().window(handle);
				System.out.println("now register window!");
				(new WebDriverWait(driver, 2)).until(new ExpectedCondition<Boolean>() {
		            public Boolean apply(WebDriver d) {
		                return d.getTitle().toLowerCase().startsWith("cheese!");
		            }
		        });
				driver.findElement(By.name("account")).clear();
				driver.findElement(By.name("account")).sendKeys("username1");
				driver.findElement(By.name("password")).sendKeys("passwd123");
				(new WebDriverWait(driver, 3)).until(new ExpectedCondition<Boolean>() {
		            public Boolean apply(WebDriver d) {
		                return d.getTitle().toLowerCase().startsWith("cheese!");
		            }
		        });
				//�رմ���
				//driver.quit();
				driver.close();
				
			}
		}
		//�ж��Ƿ�Ϊ��ҳ
		for(String handle : handles){
			if(handle.equals(sreach_handle)){
				//
				driver.switchTo().window(handle);
				(new WebDriverWait(driver, 2)).until(new ExpectedCondition<Boolean>() {
		            public Boolean apply(WebDriver d) {
		                return d.getTitle().toLowerCase().startsWith("cheese!");
		            }
		        });
				driver.findElement(By.className("close-btn")).click();
				driver.findElement(By.id("kw")).sendKeys("webdriver");
				driver.findElement(By.id("su")).click();
				(new WebDriverWait(driver, 2)).until(new ExpectedCondition<Boolean>() {
		            public Boolean apply(WebDriver d) {
		                return d.getTitle().toLowerCase().startsWith("cheese!");
		            }
		        });
				
			}
		}
		driver.quit();
	}

}