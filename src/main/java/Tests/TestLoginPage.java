package Tests;

import FoodHubWebUK.Base.BaseClass;
import FoodHubWebUK.FoodhubWebPages.LoginWindow;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseClass {
    @Test
    public void runLogin(){

        new LoginWindow()
                .clickLogin()
                .clickLoginLink()
                .enterEmail()
                .enterPassword()
                .clickLoginButton();

    }
}
