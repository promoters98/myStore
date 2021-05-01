package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends Base {

	public void verifyCheckoutPage() {
		WebElement page = driver.findElement(By.id("center_column"));
		String pageTxt = page.getText();
		if (pageTxt.contains("Faded Short Sleeve T-shirts")) {
			System.out.println("Faded Short Sleeve T-shirts is available in checkout list.");
		} else {
			System.out.println("There is a problem with checkout page.");
		}
	}

	public void clickCheckOut() {
		WebElement chkoutBtn = driver
				.findElement(By.cssSelector("p[class='cart_navigation clearfix'] [title='Proceed to checkout']"));
		chkoutBtn.click();
		System.out.println("Checkout button on checkout page is clicked.");
	}

	public void clickAddressCheckout() {
		WebElement addressCheckoutBtn = driver.findElement(By.cssSelector("button[name='processAddress']"));
		addressCheckoutBtn.click();
		System.out.println("Address checkout button is clicked.");
	}

	public void checkAcceptTermsChkBox() {
		WebElement acceptTermsChkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		acceptTermsChkBox.click();
		System.out.println("Terms of use checkbox is checked.");
	}

	public void clickShippingCheckout() {
		WebElement shippingCheckoutBtn = driver.findElement(By.name("processCarrier"));
		shippingCheckoutBtn.click();
		System.out.println("Shipping checkout button is clicked.");
	}

	public void selectPayByWire() {
		WebElement bankwireBtn = driver.findElement(By.className("bankwire"));
		bankwireBtn.click();
		System.out.println("Pay by bank wire button is clicked.");
	}

	public void clickConfirmOrderBtn() {
		WebElement confirmOrderBtn = driver
				.findElement(By.cssSelector("button[class='button btn btn-default button-medium']"));
		confirmOrderBtn.click();
		System.out.println("Confirm order button is clicked.");
	}

	public void verifyOrderCompletion() {
		WebElement orderCompletion = driver.findElement(By.className("cheque-indent"));
		String orderCompleted = orderCompletion.getText();
		if (orderCompleted.equalsIgnoreCase("Your order on My Store is complete.")) {
			System.out.println("Order has been completed successfully.");
		} else {
			System.out.println(orderCompleted);
		}
	}
}
