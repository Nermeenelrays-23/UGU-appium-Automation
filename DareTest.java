package Tests;

import Pages.DarePage;
import org.testng.annotations.Test;

public class DareTest extends TestBase{
    DarePage dareObj;
    @Test(priority = 7)
    public void UserCanJoinDare() throws InterruptedException {
        dareObj=new DarePage(driver);
        dareObj.JoinDare(driver);
    }
}
