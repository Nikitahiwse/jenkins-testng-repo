package jenkins_project_tesng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {
	
	public void initialzation(String URL) throws InterruptedException
	{
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.get(URL);
		Thread.sleep(5000);
		
	
	}
	

}
