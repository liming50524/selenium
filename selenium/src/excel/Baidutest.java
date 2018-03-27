package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Baidutest {
    @Test(dataProvider = "GetDataFromXml", dataProviderClass = ExcelDataProvider.class)
    public void test1(String URL, String context) {
        //String expected = "";

        //�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
        //System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe"); 
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);
        
        driver.manage().window().maximize();
        
        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys(context);
        
        WebElement btn = driver.findElement(By.id("su"));
        btn.click();
        
        driver.close();
       
}
  
    }