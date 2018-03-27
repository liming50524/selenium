package assist;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Decide {

     
	//判定元素是否存在
    public static boolean isElementExsit(WebDriver driver, By locator) {  
        boolean flag = false;  
        try {  
            WebElement element=driver.findElement(locator);  
            flag=null!=element;              
        } catch (NoSuchElementException e) {  
            System.out.println("元素:" + locator.toString()  
                    + " 不存在，打开失败!");  
            Snapshot.snapshot((TakesScreenshot) driver, "fail"+Datatime.getCurrentTime()+".png");
            driver.quit();
        }  
        return flag;  
    }  
//    判断文本是否存在
    public static void textview(WebDriver driver, By locate,String test){    

    try{
        WebElement txt=driver.findElement(locate);
        Assert.assertTrue(txt.getText().contains(test));
        Delay.delay(2);
        Snapshot.snapshot((TakesScreenshot) driver, "文本存在"+Datatime.getCurrentTime()+".png");
        
        }catch(Exception e){
        	System.out.println("文本不存在");
        	Snapshot.snapshot((TakesScreenshot) driver, "文本不存在"+Datatime.getCurrentTime()+".png");
        	driver.quit();       	
        	
        }
   
    }
   

}
