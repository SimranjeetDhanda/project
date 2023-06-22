package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRmClass;

public class PomLogin extends BaseHRmClass{
@FindBy(id="user-name")
WebElement Username;
@FindBy(id="password") WebElement Password;
@FindBy(css=".submit-button.btn_action")
WebElement loginbtn;
public PomLogin() {
	PageFactory.initElements(driver, this);
	}
public void typeusername(String name) {
	Username.sendKeys(name);
}
public void typepassword(String pass) {
	Password.sendKeys(pass);
	
}
public void clickbtn() {
	loginbtn.click();
}
public String verify() {
	return driver.getTitle();
}
}
