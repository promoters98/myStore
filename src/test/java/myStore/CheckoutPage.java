package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends Base {
	
	public void verifyCheckoutPage() {
	WebElement page = driver.findElement(By.id("center_column"));
	String pageTxt = page.getText();
	if (pageTxt.contains("Faded Short Sleeve T-shirts")) {
		System.out.println("Faded Short Sleeve T-shirts is available in checkout list.");
	}
	else {
		System.out.println("There is a problem with checkout page.");
	}
	}
	public void clickCheckOut() {
		WebElement chkoutBtn = driver.findElement(By.cssSelector("p[class='cart_navigation clearfix'] [title='Proceed to checkout']"));
		chkoutBtn.click();
		System.out.println("Checkout button on checkout page is clicked.");
	}

}
