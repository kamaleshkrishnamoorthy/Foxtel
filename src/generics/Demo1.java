package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import scripts.AutoConst;

public class Demo1 implements AutoConst{


@Test
	public void TestA()
	{
		String key = "webdriver.chrome.driver";
		String value = "C:/Users/Kamal/workspace/Automation/Source/chromedriver.exe";
		System.setProperty(key, value);
		SoftAssert soft = new SoftAssert();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost");
		String atitle = driver.getTitle();
		String etitle = "actiTIME - Login";
		soft.assertEquals(atitle, etitle);
		soft.assertAll();
	}


}
