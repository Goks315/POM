package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	
	// Without Using FindBY
		/*public static WebElement userName(WebDriver driver){
			return driver.findElement(By.name("username"));
		}
		
		public static WebElement password(WebDriver driver){
			return driver.findElement(By.name("password"));
		}
		
		public static WebElement loginButton(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
		}
		*/
		
	
	
/*
	@FindBy(how=How.NAME,using="username")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath="//*[@id='loginfrm']/button")
	public static WebElement submit;*/
	
	
	
	@FindBy(name="email")
	public static WebElement userName;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(id = "submitBTN")
	public static WebElement submitButton;
}
