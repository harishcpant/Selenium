package Misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class ReadConfigFile {


	public static void main(String[] args) throws IOException {
		File configFile=new File("config1.properties");		
		FileReader reader=new FileReader(configFile);
		Properties prop=new Properties();
		prop.load(reader);
		System.out.println(prop.getProperty("user.name"));
		prop.setProperty("host", "www.codejava.net");
	}	
}
