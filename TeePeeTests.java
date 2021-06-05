package Tests;

import Pages.TeepeePage;
import org.testng.annotations.Test;

public class TeePeeTests extends TestBase {
    TeepeePage tpObj;
    @Test(priority = 6)
    public void UserCanAddPublicTp() throws InterruptedException {
        tpObj=new TeepeePage(driver);
        tpObj.AddPubTPPost(driver);
    }
    @Test(priority = 7)
    public void UserCanAddPrivateTP() throws InterruptedException {
        tpObj=new TeepeePage(driver);
        tpObj.specificUserTpPost(driver);
    }
}
