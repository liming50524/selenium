package excel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jxl.Sheet;
import jxl.Workbook;
/*
* ��ȡExcel�ļ�������,ʹ��Workbook��ʽ����ȡexcel
*/
public class ExcelWorkBook {
//����list������������ݣ�������ΪString
private List<String> list=new ArrayList <String> ();
//ͨ��Workbook��ʽ����ȡexcel
Workbook book;
String username;
/*
* ��ȡexcel�ļ���һ�е�ֵ������ȡ��ֵΪusername
*/
public List<String> readUsername(String sourceString) throws IOException,Exception{
List<String> userList = new ArrayList<String>();
try {
Workbook book =Workbook.getWorkbook(new File("E:/testt.csv"));
Sheet sheet=book.getSheet(0);
//��ȡ�ļ�������
int rows=sheet.getRows();
//��ȡ�ļ�������
int cols=sheet.getColumns();
//��ȡ��һ�е����ݣ�һ���һ��Ϊ����ֵ������������Ժ���
String col1=sheet.getCell(0,0).getContents().trim();
String col2=sheet.getCell(1,0).getContents().trim();
System.out.println(col1+","+col2);
//�ѵ�һ�е�ֵ����userlist��
for(int z=1;z<rows ;z++){
String username=sheet.getCell(0,z).getContents();
userList.add(username);
}
} catch (Exception e) {
e.printStackTrace();
}
//�ѻ�ȡ��ֵ�Żس�ȥ���������
return userList;
}
/*
* ��ȡexcel�ļ��ڶ��е�ֵ������ȡ��ֵΪpassword
*/
public List<String> readPassword(String sourceString) throws IOException,Exception{
List<String> passList = new ArrayList<String>();
try {
Workbook book =Workbook.getWorkbook(new File("E:/testt.csv"));
Sheet sheet=book.getSheet(0);
int rows=sheet.getRows();
for(int z=1;z<rows ;z++){
String password=sheet.getCell(1,z).getContents();
passList.add(password);
}
} catch (Exception e) {
e.printStackTrace();
}
return passList;
}
public List<String> getList(){
return list;
}
}