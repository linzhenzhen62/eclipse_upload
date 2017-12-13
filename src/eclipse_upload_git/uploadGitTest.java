package eclipse_upload_git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class uploadGitTest {
		
		public static void main(String[] args){
			WebDriver driver;
			String baseUrl= "https://www.google.com";
			String CHROME_PATH = "/Users/Document/Downloads/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",CHROME_PATH);
			driver = new SafariDriver();
			driver.get(baseUrl);
		}
	

}
