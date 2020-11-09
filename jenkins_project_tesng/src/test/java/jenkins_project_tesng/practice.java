package jenkins_project_tesng;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practice {

	@Test
	@Parameters("Website_URL")
	void abc(String URL) throws InterruptedException
	{
	Initialize initial=new Initialize();
	initial.initialzation(URL);
	
	}
	

}
