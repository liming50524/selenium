package lookpic;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




/** 
 * @author QiaoJiaofei 
 * @version 创建时间：2015年8月27日 上午10:29:57 
 * 类说明 
 */
public class TestYzmByElementPoint {
    WebDriver dr;
    @BeforeTest
    public void before() {
        String key = "webdriver.chrome.driver";
        String value = "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe";
        System.setProperty(key, value);
        dr = new ChromeDriver();
        dr.manage().window().maximize();
    }
    
    @Test
    public void test1() {
        dr.get("http://192.168.20.11/common/registerrandcode?width=82&height=42");
        WebDriverWait wait = new WebDriverWait(dr,10);
        WebElement element = wait.until(new ExpectedCondition<WebElement>() {

            public WebElement apply(WebDriver arg0) {
                // TODO Auto-generated method stub
                return arg0.findElement(By.id("codeimg"));
            }
            
        });
        File scrFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
        //WebElement element = dr.findElement(By.id("codeimg"));

        try {
            Point p = element.getLocation();
            int width = element.getSize().getWidth();
            int higth = element.getSize().getHeight();
            Rectangle rect = new Rectangle(width, higth);
            BufferedImage img = ImageIO.read(scrFile);
            BufferedImage dest = img.getSubimage(p.getX(), p.getY(), width, higth);
            ImageIO.write(dest, "png", scrFile);
            Thread.sleep(1000);
            File fng = new File("D:/ddd/yzm.png");
            if(fng.exists()){
                fng.delete();
            }
            FileUtils.copyFile(scrFile, fng);
            
            Runtime rt = Runtime.getRuntime();
            rt.exec("cmd.exe /C  tesseract.exe D:\\ddd\\yzm.png  D:\\ddd\\yzm -1 ");
            Thread.sleep(1000);
            File file = new File("D:\\ddd\\yzm.txt");
            if(file.exists()) {
                FileHandler fh = new FileHandler();
                String s = fh.readAsString(file).trim();
                System.out.println(s);
            } else {
                System.out.print("yzm.txt不存在");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }
    @AfterTest
    public void after() {
        dr.quit();
    }
}