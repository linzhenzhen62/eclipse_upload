package eclipse_upload_git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadGitTest {
		
		public static void main(String[] args){
			WebDriver driver;
			String baseUrl= "https://www.google.com";
			System.setProperty("webdriver.chrome.driver","/Users/Document/Downloads/chromedriver12");
			driver = new ChromeDriver();
			driver.get(baseUrl);
		}
	

}
