package jenkins_project_tesng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {
	WebDriver wd;
	
	public void initialzation(String URL) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.get(URL);
		Thread.sleep(5000);
		
	
	}
	
	public void maximize()
	{
		wd.manage().window().maximize();
		wd.close();
	}
	

}
