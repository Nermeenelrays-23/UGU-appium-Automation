package Tests;

import Pages.LifePage;
import org.testng.annotations.Test;

public class LifeTests extends TestBase {
    LifePage lifeObj;
    @Test(priority = 8)
    public void UserCanSubmitLife() throws InterruptedException {
        lifeObj=new LifePage(driver);
        lifeObj.submitLife(driver);

    }
}

