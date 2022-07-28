package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {

	public POM1(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[24]")
	private WebElement realeasedate;
	
	public void date() {
		realeasedate.getText();
	}
	
	@FindBy(xpath="(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[25]")
	private WebElement country;
	
	public void india() {
		country.getText();
	}
	
	@FindBy(xpath="//a[text()='sequel']")
	private WebElement dropdown;
	
	public void drop(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",dropdown);
	}
	
}
