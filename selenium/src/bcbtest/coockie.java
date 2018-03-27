package bcbtest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class coockie {
	 
			
	public static void main(String[] args) {
		 WebDriver dr=new ChromeDriver();
		  Set<Cookie> cookies = dr.manage().getCookies();
	        for (Cookie cookie : cookies) {
	            System.out.println("name :" + cookie.getName() + "\n" + "value :" + cookie.getValue());
	        }
}

}
