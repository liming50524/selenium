package assist;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Snapshot {
	public static void snapshot(TakesScreenshot drivername, String filename)
	  {

	      // String currentPath = System.getProperty("user.dir"); 这个是获取当前项目根目录用的
		Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date); 
        
	    String currentPath = "E:\\Seleniumphoto"; 
	    System.out.println(currentPath);
	    File scrFile = (File) drivername.getScreenshotAs(OutputType.FILE);
	        // 保存路径
	        try {
	            System.out.println("图片存放路径为:"+currentPath+"/"+filename);
	            FileUtils.copyFile(scrFile, new File(currentPath+"\\"+filename));
	        } catch (IOException e) {
	            
	            System.out.println("图片保存失败");
	            e.printStackTrace();
	        } 
	        finally
	        {
	           
	            System.out.println("截图保存成功");
	        }
	  }
}
