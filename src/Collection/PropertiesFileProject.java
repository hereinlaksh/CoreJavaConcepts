package Collection;

import java.io.FileInputStream;

import java.util.Properties;


public class PropertiesFileProject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fs=new FileInputStream("C:\\Users\\vishnu\\eclipse-workspace\\com\\src\\Collection\\test.properties");
		
		Properties p=new Properties();
		p.load(fs);
		
		String uname = p.getProperty("username");
		String pwd = p.getProperty("password");
		
		System.out.println(uname);
		System.out.println(pwd);
		fs.close();

	}

}
