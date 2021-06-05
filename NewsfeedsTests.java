package Tests;

import Pages.NewsfeedsPage;
import org.testng.annotations.Test;

public class NewsfeedsTests extends TestBase{
    NewsfeedsPage NewsfeedsObj;
    @Test(priority = 9,enabled = true)
    public void UserCanSearch() throws InterruptedException {
        NewsfeedsObj=new NewsfeedsPage(driver);
        NewsfeedsObj.Search(driver);
    }

    @Test(priority = 10,enabled = true)
    public void UserCanAddCommentAndReply() throws InterruptedException {
        NewsfeedsObj=new NewsfeedsPage(driver);
        NewsfeedsObj.addComment(driver);
        NewsfeedsObj.AddReply(driver);
    }
    @Test(priority = 12,enabled = true)
    public void UserCanReactLove() throws InterruptedException {
        NewsfeedsObj=new NewsfeedsPage(driver);
        NewsfeedsObj.addReact(driver);
    }
    @Test(priority = 11,enabled = true)
     public void UserCanDeleteComment() throws InterruptedException {
        NewsfeedsObj=new NewsfeedsPage(driver);
        NewsfeedsObj.DeleteComment(driver);
    }
    @Test(priority = 5,enabled = false)
    public void AddHundredComments()
    {
        NewsfeedsObj=new NewsfeedsPage(driver);
        NewsfeedsObj.addMultiComments(driver);
    }

}
