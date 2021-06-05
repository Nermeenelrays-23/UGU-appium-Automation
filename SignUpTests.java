package Tests;

import Pages.SignUpPage;
import org.testng.annotations.Test;

public class SignUpTests extends TestBase {
    SignUpPage SignUpObj;
    @Test
    public void UserCanSignUp(){
        SignUpObj=new SignUpPage(driver);
        SignUpObj.SignUp(driver);
    }
}
