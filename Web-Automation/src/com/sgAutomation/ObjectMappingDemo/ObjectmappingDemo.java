package com.sgAutomation.ObjectMappingDemo;

import java.io.FileInputStream;
import java.util.Properties;

public class ObjectmappingDemo {
public Properties prop=null;
public ObjectmappingDemo(String FileName)
{
	FileInputStream fin=null;
	try 
	{
		String path = System.getProperty("user.dir");
		fin=new FileInputStream(path+"\\ObjectMap\\"+FileName);
		
		
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
}
		

	

}
