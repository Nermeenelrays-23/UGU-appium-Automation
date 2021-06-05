package Tests;

import Pages.ProfilePage;
import org.testng.annotations.Test;

public class ProfileTests extends TestBase {
    ProfilePage ProfileObj;


    @Test(priority = 6)
    public void UserCanChangeProfilePic(){
        ProfileObj=new ProfilePage(driver);
        ProfileObj.swipeAction(driver);
    }
}
