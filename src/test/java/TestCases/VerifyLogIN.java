package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjModel.LogInPageObj;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constant;

public class VerifyLogIN extends BaseClass {

	@Test
	public void InvalidLogin() throws IOException {

		LogInPageObj LIPO = new LogInPageObj(driver);

		LIPO.enterUsername().sendKeys(Constant.username);
		LIPO.enterPassword().sendKeys(Constant.password);
		LIPO.clickLogin().click();

		String actualText = LIPO.errorText().getText();
		String expctedText = Constant.LogInExpectedMessage;

		CommonMethods.handleAssertions(actualText, expctedText, "error message is not valid");

	}

}
