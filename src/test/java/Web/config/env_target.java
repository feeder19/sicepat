package Web.config;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class env_target extends  targetPropertiesFile {
    protected static WebDriver driver;
    //private final Properties tfile;
    protected String projectPath = System.getProperty("user.dir");
    protected String os = System.getProperty("os.name");
    //Linux
    //protected String data_env  = System.getProperty("environment");
    protected String data_env = "stage";
    protected Properties tfile = targetPropertiesFile.readPropertiesFile(projectPath + "\\src\\test\\java\\Web\\data\\" + data_env + "-env.properties");


}
