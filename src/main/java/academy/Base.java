package academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Base {

	
	public void initializeDriver() throws FileNotFoundException
	{
		
		Properties prop= new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\promonda\\Documents\\DataDriven.xlsx");
		
	}
}
