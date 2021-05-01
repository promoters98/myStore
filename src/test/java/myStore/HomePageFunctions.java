package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageFunctions extends Base {
	
	public void verifyHomePage() {
		String currentUrl = driver.getCurrentUrl();
		Data d = new Data();
		if (d.HomePageUrl.equals(currentUrl)) {
			System.out.println("user is on home page");
		} else {
			System.out.println("home page is unreachable");
		}
	}
	
	public void verifySearchOnHomePage() {
		WebElement searchBox = driver.findElement(By.id("search_query_top"));
		if (searchBox.isDisplayed()) {
			System.out.println("Search Box is available on Home Page.");
		}
		else {
			System.out.println("Search Box is not found on Home Page.");
		}
	}
	
	public void selectWomenTshirts() {
		WebElement women = driver.findElement(By.cssSelector("a[title=Women]"));
		Actions action = new Actions(driver);
		action.moveToElement(women).perform();
		WebElement tshirts = driver.findElement(By.cssSelector("a[title=T-shirts]"));
		tshirts.click();
		System.out.println("User has clicked on T-shirts.");
	}
}


