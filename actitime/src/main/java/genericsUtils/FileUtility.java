package genericsUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	/**
	 * This method is used to get the data from property file
	 * @param filepath
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyFileData(String key ) throws Throwable {
		FileInputStream file = new FileInputStream(IPathConstants.PROPERTY_FILEPATH);
		Properties properties = new Properties();
		properties.load(file);
		return properties.getProperty(key);	
	}
}
