package org.selenium.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyFile {

public static String getDataFromProperty(String filePath,String key)
{

String data= null;
try
{

File f = new File(filePath);
FileInputStream fis = new FileInputStream(f);
Properties prop = new Properties();
prop.load(fis);
 data= prop.getProperty(key);
	
	return data;
	}
	catch(Exception e)
	{
return null;
}
}
public static void writeDataToProperty(String filePath,String key,String comment,String value)
{

String data= null;
try
{

File f = new File(filePath);
FileInputStream fis = new FileInputStream(f);
Properties prop = new Properties();
prop.load(fis);
prop.setProperty(key,value);

FileOutputStream fos = new FileOutputStream(f);
prop.store(fos,comment);



}
catch(Exception e)
{

e.printStackTrace();
}
}

}