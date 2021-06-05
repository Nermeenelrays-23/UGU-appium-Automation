package Tests;

import Pages.LogoutPage;
import org.testng.annotations.Test;

public class LogoutTests extends TestBase {

    LogoutPage LogoutObj;
    @Test(priority = 15)
    public void UserCanLogOut() throws InterruptedException {
        LogoutObj=new LogoutPage(driver);
        LogoutObj.UserCanLogOut(driver);

    }
}
