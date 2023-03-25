package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage 
{
WebDriver driver;
	
	public GoogleHomePage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//div[text()='India']")
	private WebElement country;
	
	public String getCountry() {
		
		return country.getText();
		
	}

}
