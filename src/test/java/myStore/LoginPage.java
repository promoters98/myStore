package myStore;

public class LoginPage extends Base {
	public static void main(String[] args) {

		chromeSetup();
		navigateToHomePage();

		HomePage hp = new HomePage();
		hp.verifyHomePage();
		hp.verifySearchOnHomePage();
		hp.selectWomenTshirts();

		loginPageFunctions lp = new loginPageFunctions();
		lp.clickSignInButton();
		lp.verifySignInPage();
		lp.loginToAccount();
		lp.verifyLoginStatus();

		// tearDown();
	}

}
