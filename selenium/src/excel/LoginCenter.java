package excel;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import assist.canshu;
public class LoginCenter {
private WebDriver driver;
private String url;
String sourceFile="���ļ���·�����ļ�����";
@BeforeClass
public void testBefore(){
//����firefox�����
	//�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
    System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
    WebDriver driver = new ChromeDriver();        
    driver.get(canshu.bcbUrl());
}
@Test
public void login() throws Exception{
//��ʼ��ExcelWorkBook Class
ExcelWorkBook excelbook=new ExcelWorkBook();
//���뵽��Ĳ��Խ���
driver.get(url);
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
try{
//��ȡ����username����userlist��������
List<String> userList=excelbook.readUsername(sourceFile);
//��ȡ����password����passlist��������
List<String> passList=excelbook.readPassword(sourceFile);
//��ȡ������ֵ�����뵽������������
int usersize=userList.size();
for(int i=0;i<usersize ;i++){
//ͨ��css��λ��username�����
WebElement username=driver.findElement(By.cssSelector("input[name=\"j_username\"]"));
//ͨ��css��λ��password�����
WebElement password=driver.findElement(By.cssSelector("input[name=\"j_password\"]"));
//ͨ��xpath��λ��¼��ť
WebElement submit=driver.findElement(By.xpath("//button//span[contains(text(),'��¼')]"));
//���username����������
username.clear();
//��list������һ��һ����ȡ����
String name=userList.get(i);
//Ȼ����д��username�����
username.sendKeys(name);
for(int j=0;j<passList.size();j++){
password.clear();
String pass=passList.get(j);
password.sendKeys(pass);
}
//�����¼��ť
submit.click();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//ͨ��xpath��λ�ǳ���ť
WebElement logoutButton=driver.findElement(By.xpath("//button//span[contains(text(),'�ǳ�')]"));
logoutButton.click();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
}catch(Exception e){
e.printStackTrace();
}
}
}