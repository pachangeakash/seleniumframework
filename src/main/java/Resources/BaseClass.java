package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public Properties Prop;

	public void InitializeDriver() throws IOException {

		// This will access the properties file
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\Data.properties");

		// Read the file-
		 Prop = new Properties();

		Prop.load(fis);
		String BrowserName = Prop.getProperty("Browser");

		if (BrowserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		} else if (BrowserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (BrowserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("please choose valid browser to run your scripts");
		}
	}

	@BeforeMethod
	public void launchBrowser() throws IOException {
		InitializeDriver();
		String url = Prop.getProperty("url");
		driver.get(url);
	}

	@AfterMethod
	public void quitBrowser() {

		driver.quit();

	}

}
