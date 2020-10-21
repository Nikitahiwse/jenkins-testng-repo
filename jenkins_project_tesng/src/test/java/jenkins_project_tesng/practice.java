package jenkins_project_tesng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice {

	@Test
	void abc() throws InterruptedException
	{
	WebDriver wd;
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	wd=new ChromeDriver();
	wd.get("http://automationpractice.com/index.php");
	Thread.sleep(5000);
	
	wd.manage().window().maximize();
	
	Thread.sleep(3000);
	
	wd.close();
	}

}
