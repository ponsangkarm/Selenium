package FoodHubWebUK.FoodhubWebPages;

import FoodHubWebUK.Base.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

    public LoginPage enterEmail(){
        driver.findElement(By.id("password_email")).sendKeys("testpro@gmail.com");
        return this;
    }
    public LoginPage enterPassword(){
        driver.findElement(By.id("password_login")).sendKeys("Test@2345");
        return this;
    }
    public HomePage clickLoginButton(){
        driver.findElement(By.id("login_button")).click();
        return new HomePage();
    }
   /* public ForgetPassword clickForgetPassword(){
        driver.findElement(By.id("forgot_password_login")).click();
        return new ForgetPassword();
    }*/
}
