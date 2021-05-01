package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends Base {

	public void viewProduct() {
		WebElement fadedTshirt = driver
				.findElement(By.cssSelector("h5[itemprop='name'] [title='Faded Short Sleeve T-shirts']"));
		fadedTshirt.click();
	}

	public void verifyProduct() {
		String productName = driver.findElement(By.cssSelector("h1[itemprop='name']")).getText();
		if (productName.contains("Faded Short Sleeve T-shirts")) {
			System.out.println("Faded Short Sleeve T-shirts is viewed.");
		} else {
			System.out.println("Product Faded Short Sleeve T-shirts is not found.");
		}
	}

	public void setProductQuantity() {
		WebElement productQuantityBox = driver.findElement(By.id("quantity_wanted"));
		productQuantityBox.clear();
		productQuantityBox.sendKeys("2");
		System.out.println("product quantity is set to 2.");
	}

	public void setProductSize() {
		WebElement sizeDropdown = driver.findElement(By.id("group_1"));
		Select sd = new Select(sizeDropdown);
		sd.selectByValue("2");
		System.out.println("product size is set to M.");
	}

	public void selectProductColor() {
		WebElement blueColor = driver.findElement(By.id("color_14"));
		blueColor.click();
		System.out.println("blue color is selected for product.");
	}

	public void addProductsToCart() {
		WebElement AtcButton = driver.findElement(By.cssSelector("p[id='add_to_cart'] [type='submit']"));
		if (AtcButton.isEnabled()) {
			AtcButton.click();
			System.out.println("Add to cart button is clicked.");
		} else {
			System.out.println("Add to cart button is not displayed.");
		}
	}

	public void verifyCart() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[class='layer_cart_product col-xs-12 col-md-6']")));
		WebElement popup = driver.findElement(By.cssSelector("div[class='layer_cart_product col-xs-12 col-md-6']"));
		if (popup.isDisplayed()) {
			// WebElement cartPopup =
			// driver.findElement(By.cssSelector(".layer_cart_product.col-xs-12.col-md-6"));
			String cpText = popup.getText();
			if (cpText.contains("Product successfully added to your shopping cart")) {
				System.out.println("Faded Short Sleeve T-shirts is successfully added to cart.");
			} else {
				System.out.println("Cart popup is not displayed");
			}
		}
	}
	public void clickCheckoutBtn() {
		WebElement checkoutBtn = driver.findElement(By.cssSelector("a[title='Proceed to checkout']"));
		checkoutBtn.click();
		System.out.println("Proceed to Checkout button is clicked");
	}
	
}
