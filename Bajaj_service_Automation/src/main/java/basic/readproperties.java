/*
 * package basic;
 * 
 * import java.io.FileInputStream; import java.io.IOException; import
 * java.util.Properties; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.edge.EdgeDriver;
 * 
 * 
 * public class readproperties { public static void main(String[] args) throws
 * IOException {
 * 
 * // Load properties file FileInputStream fis = new FileInputStream(
 * "src/test/resources/config.properties");
 * 
 * Properties prop = new Properties(); prop.load(fis);
 * 
 * // Read values String browser = prop.getProperty("browser"); String url =
 * prop.getProperty("url");
 * 
 * System.out.println("Browser: " + browser); System.out.println("URL: " + url);
 * 
 * WebDriver driver= null;
 * 
 * if (browser.equalssIgnoreCase("chrome")) { driver = new ChromeDriver(); }
 * 
 * 
 * driver.manage().window().maximize(); driver.get(url); } }
 */