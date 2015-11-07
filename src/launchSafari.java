import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class launchSafari {
	public static void main(String args[]) {
		// Initialize driver
		String baseDirectory = System.getProperty("user.dir");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("safari.options.dataDir", baseDirectory);
		dc.setCapability(
				"safari.System.setProperty(webdriver.safari.noinstall)", "true");

		WebDriver dr = new SafariDriver(dc);

		dr.get(("http://www.google.com"));
		dr.quit();
	}
}