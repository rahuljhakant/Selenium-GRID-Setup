package GridTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		// Define desired capabilities
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.MAC);
		
		
		// chrome options class
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.merge(capabilities);
		
		
		String hub_urlString="http://192.168.1.4:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(hub_urlString),chromeOptions);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
