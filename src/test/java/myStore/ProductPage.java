package myStore;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends Base {

	public void viewProduct() {
		WebElement fadedTshirt = driver.findElement(By.cssSelector("h5[itemprop='name'] [title='Faded Short Sleeve T-shirts']"));
		fadedTshirt.click();
	}
	
	public void verifyProduct() {
		String productName = driver.findElement(By.cssSelector("h1[itemprop='name']")).getText();
		if (productName.contains("Faded Short Sleeve T-shirts")) {
			System.out.println("Faded Short Sleeve T-shirts is viewed.");
		}
		else {
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("blue color is selected for product.");
	}
	public void addProductsToCart() {
		WebElement AtcButton = driver.findElement(By.id("add_to_cart"));
		AtcButton.click();
		System.out.println("Add to cart button is clicked.");
	}
	public void verifyCart() {
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator <String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		// Now you are in the popup window, perform necessary actions here
		WebElement cartPopup = driver.findElement(By.cssSelector(".layer_cart_product.col-xs-12.col-md-6"));
		String cartPopupText = cartPopup.getText();
		if (cartPopupText.contains("Product successfully added to your shopping cart")) {
			System.out.println("Faded Short Sleeve T-shirts is successfully added to cart.");
		}

		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
	}
	
}
