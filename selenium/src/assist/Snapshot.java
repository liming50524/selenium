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

	      // String currentPath = System.getProperty("user.dir"); ����ǻ�ȡ��ǰ��Ŀ��Ŀ¼�õ�
		Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date); 
        
	    String currentPath = "E:\\Seleniumphoto"; 
	    System.out.println(currentPath);
	    File scrFile = (File) drivername.getScreenshotAs(OutputType.FILE);
	        // ����·��
	        try {
	            System.out.println("ͼƬ���·��Ϊ:"+currentPath+"/"+filename);
	            FileUtils.copyFile(scrFile, new File(currentPath+"\\"+filename));
	        } catch (IOException e) {
	            
	            System.out.println("ͼƬ����ʧ��");
	            e.printStackTrace();
	        } 
	        finally
	        {
	           
	            System.out.println("��ͼ����ɹ�");
	        }
	  }
}
