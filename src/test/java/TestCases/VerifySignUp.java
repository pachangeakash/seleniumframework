package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjModel.LogInPageObj;
import PageObjModel.SignUpPageObj;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constant;

public class VerifySignUp extends BaseClass {

	@Test
	public void SignUp() throws IOException, InterruptedException {
		LogInPageObj LIPO = new LogInPageObj(driver);

		LIPO.ClickOnTryForFree().click();

		SignUpPageObj SUPO = new SignUpPageObj(driver);
		Thread.sleep(5000);

		SUPO.firstname().sendKeys(Constant.firstname);
		SUPO.lastname().sendKeys(Constant.lastname);

		CommonMethods.HandleDropDown(SUPO.SelectEmployee(), 1);

	}

}
