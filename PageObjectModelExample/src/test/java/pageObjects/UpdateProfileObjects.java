package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileObjects {
	
	//Without Using Find By
	/*public static WebElement myprofile(WebDriver driver){
	return driver.findElement(By.
xpath("//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a"));
			
}

public static WebElement phoneNumber(WebDriver driver){
	return driver.findElement(By.name("phone"));
}

public static WebElement city(WebDriver driver){
	return driver.findElement(By.name("city"));
}

public static WebElement sumbit(WebDriver driver){
	return driver.findElement(By.
	xpath("//*[@id='profilefrm']/div/div[3]/div[3]/button"));
}*/
	
	

	@FindBy(xpath="//*[@id=\"fadein\"]/div[2]/div[1]/div/div[2]/ul/li[3]/a")
	public static WebElement myprofile;
	@FindBy(name="phone")
	public static WebElement phoneNumber;
	@FindBy(name="city")
	public static WebElement city;
	@FindBy(xpath="//*[@id=\"profile\"]/div/div[6]/button")
	public static WebElement submitButton;
	
	
	
	
	

}
