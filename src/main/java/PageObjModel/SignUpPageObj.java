package PageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObj {

	public WebDriver driver;

	By firstname = By.xpath("//input[@name='UserFirstName']");

	By lastname = By.xpath("//input[@name='UserLastName']");

	By workemail = By.xpath("//input[@name='UserEmail']");

	By jobtitle = By.xpath("//select[@name='UserTitle']");

	By Employees = By.xpath("//select[@name='CompanyEmployees']");

	public SignUpPageObj(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement firstname() {
		return driver.findElement(firstname);
	}

	public WebElement lastname() {
		return driver.findElement(lastname);
	}

	public WebElement workemail() {
		return driver.findElement(workemail);
	}

	public WebElement jobtitle() {
		return driver.findElement(jobtitle);
	}

	public WebElement SelectEmployee() {

		return driver.findElement(Employees);

	}

}
