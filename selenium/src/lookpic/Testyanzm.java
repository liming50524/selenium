package lookpic;
 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
/**
 * @author QiaoJiaofei
 * @version ����ʱ�䣺2015��7��1�� ����5:00:31
 * ��˵��
 */
public class Testyanzm {
    WebDriver dr = null;
     
    @Test
    public void testf() throws AWTException, InterruptedException {
        System.setProperty("webdriver.chromedriver.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("http://192.168.20.11/common/registerrandcode?width=82&height=42");
        Actions action = new Actions(dr);
        action.contextClick();// ����Ҽ��ڵ�ǰͣ����λ������������
        action.contextClick(dr.findElement(By.id("codeimg"))).build().perform();
         
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
         
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);     
        Thread.sleep(5000);
         
        Runtime rn = Runtime.getRuntime();
        Process p = null;
        try {          
            p = rn.exec("\"D:/autoitexe/rightsave.exe\"");
        } catch (Exception e) {
            System.out.println("Error exec!");
        }
         
         
     
    }
}