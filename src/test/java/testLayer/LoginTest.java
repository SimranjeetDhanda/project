package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseHRmClass;
import pompackage.PomLogin;
import testdata.ExcelSheet;

public class LoginTest extends BaseHRmClass {
	PomLogin Log;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("Login");
		Log = new PomLogin();
	}

	@Test(priority = 1)

	public void Title() {
		String actual = Log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "Swag Labs");

	}

	
	  @DataProvider public Object[][] Details() { Object result[][] =
	  ExcelSheet.readdata("Sheet1"); return result; }
	  
	  @Test(priority = 2, dataProvider="Details") public void Login(String
	  name,String password) throws InterruptedException { Log.typeusername(name);
	  Log.typepassword(password);
	  
	  Log.clickbtn();
	  
	  }
	 
	@AfterMethod
	public void close() {
		driver.close();
	}

}
