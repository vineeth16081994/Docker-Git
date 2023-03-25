package testcase;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
protected WebDriver driver;

@BeforeTest
public void setup() throws MalformedURLException
{
ChromeOptions opt=new ChromeOptions();
    driver=new RemoteWebDriver(new URL("http://13.233.127.83:4444/"),opt);
	driver.get("https://www.google.com/");
	
}

@AfterTest
public void quitDriver()
{
	driver.quit();
}
}
