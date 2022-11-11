package FoodHubWebUK.FoodhubWebPages;

import FoodHubWebUK.Base.BaseClass;
import org.openqa.selenium.By;

public class LoginWindow extends BaseClass {

		public LoginWindow clickLogin() {
			driver.findElement(By.id("header-logout")).click();
			return this;
		}
		/*public Homepage clickGoogleLogin() {
			driver.findElement(By.xpath("//button[text()='Sign in with Google']")).click();
			return new Homepage();
		}
		public Homepage clickFacebookLogin() {
			driver.findElement(By.xpath("//button[text()='Sign in with Facebook']")).click();
			return new Homepage();
		}*/
		public LoginPage clickLoginLink(){
			driver.findElement(By.id("sign_up_login")).click();
			return new LoginPage();
		}

}






