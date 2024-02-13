package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfileUtility extends WebDriverUtility {
	public static String PropertyData(String key) throws IOException {
	FileInputStream fis = new FileInputStream (Iconstant.property_path);
	p= new Properties();
	p.load(fis);
	return p.getProperty(key);
}
}
	


