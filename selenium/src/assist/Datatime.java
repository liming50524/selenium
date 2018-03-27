package assist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * 获取当前时间
 * 
 */
public class Datatime{
	  public static String getCurrentTime(){
	Date date=new Date();
	        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HHmmss");
	        String time=format.format(date); 
	return time;
	}
	 
}
