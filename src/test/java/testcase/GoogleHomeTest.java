package testcase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.GoogleHomePage;

public class GoogleHomeTest extends BaseTest 
{

	@Test
	@Parameters("myName")
	public void getCountry(String myName)
{
	GoogleHomePage G=new GoogleHomePage(driver);
	
	System.out.println(G.getCountry());
	System.out.println(myName);
}
}
