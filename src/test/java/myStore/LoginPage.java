package myStore;

public class LoginPage extends Base {
	public static void main(String[] args) {
		
		//Chrome browser is setup and user naviagtes to home page
		chromeSetup();
		navigateToHomePage();
		
		//home page test cases are executed		
		HomePageFunctions hpf = new HomePageFunctions();
		hpf.verifyHomePage();
		hpf.verifySearchOnHomePage();
		hpf.selectWomenTshirts();
		
		//product is viewed, verified, quantity and size are set. product page test cases are executed
		ProductPage pp = new ProductPage();
		pp.viewProduct();
		pp.verifyProduct();
		pp.setProductQuantity();
		pp.setProductSize();
		pp.selectProductColor();
		pp.addProductsToCart();
		pp.verifyCart();
		pp.clickCheckoutBtn();
		
		//checkout page test cases are executed
		CheckoutPage cp = new CheckoutPage();
		cp.verifyCheckoutPage();
		cp.clickCheckOut();
		
		//login page test cases are executed
		loginPageFunctions lpf = new loginPageFunctions();
		lpf.clickSignInButton();
		lpf.verifySignInPage();
		lpf.loginToAccount();
		lpf.verifyLoginStatus();
		
		

		// tearDown();
	}

}
