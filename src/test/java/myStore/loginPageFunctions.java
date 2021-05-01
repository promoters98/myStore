package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPageFunctions extends Base {

	public void clickSignInButton() {
		WebElement SigninButton = driver.findElement(By.cssSelector(".login"));
		SigninButton.click();
		System.out.println("User has clicked sign in button.");
	}

	public void verifySignInPage() {
		String SigninPageUrl = driver.getCurrentUrl();
		Data d = new Data();
		if (d.SigninUrl.equals(SigninPageUrl)) {
			System.out.println("User is on sign in page.");
		} else {
			System.out.println("Sign in page is unreachable.");
		}
	}

	public void loginToAccount() {
		WebElement emailField = driver.findElement(By.id("email"));
		Data d = new Data();
		emailField.sendKeys(d.username);
		WebElement passwordField = driver.findElement(By.id("passwd"));
		passwordField.sendKeys(d.password);
		WebElement SignIn = driver.findElement(By.id("SubmitLogin"));
		SignIn.click();
	}

	public void verifyLoginStatus() {
		String current = driver.getCurrentUrl();
		Data d = new Data();
		if (d.myAccountUrl.equalsIgnoreCase(current)) {
			System.out.println("User is on My Account Page.");
		} else {
			System.out.println("My Account page is unreachable.");
		}
	}

}