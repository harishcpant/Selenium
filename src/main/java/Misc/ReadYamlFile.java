package Misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadYamlFile {

	public static void main(String[] args) throws FileNotFoundException {
	       Yaml yaml = new Yaml();
	        InputStream inputStream = new FileInputStream("config2.yaml");
	        System.out.println(inputStream);

	        HashMap yamlMap = (HashMap) yaml.load(inputStream);
	        for (Object o : yamlMap.entrySet()) {
	            System.out.println(o);
	        }
	        // Access HashMaps and ArrayList by key(s)
	        Object user = yamlMap.get("user");
	        //HashMap name = (HashMap) user.get("name");
	        //System.out.println(((HashMap) user).get("name"));
	}

}
