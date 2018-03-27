package assist;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Decide {

     
	//�ж�Ԫ���Ƿ����
    public static boolean isElementExsit(WebDriver driver, By locator) {  
        boolean flag = false;  
        try {  
            WebElement element=driver.findElement(locator);  
            flag=null!=element;              
        } catch (NoSuchElementException e) {  
            System.out.println("Ԫ��:" + locator.toString()  
                    + " �����ڣ���ʧ��!");  
            Snapshot.snapshot((TakesScreenshot) driver, "fail"+Datatime.getCurrentTime()+".png");
            driver.quit();
        }  
        return flag;  
    }  
//    �ж��ı��Ƿ����
    public static void textview(WebDriver driver, By locate,String test){    

    try{
        WebElement txt=driver.findElement(locate);
        Assert.assertTrue(txt.getText().contains(test));
        Delay.delay(2);
        Snapshot.snapshot((TakesScreenshot) driver, "�ı�����"+Datatime.getCurrentTime()+".png");
        
        }catch(Exception e){
        	System.out.println("�ı�������");
        	Snapshot.snapshot((TakesScreenshot) driver, "�ı�������"+Datatime.getCurrentTime()+".png");
        	driver.quit();       	
        	
        }
   
    }
   

}
