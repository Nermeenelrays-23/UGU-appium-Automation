package Tests;

import Pages.AddPostPage;
import org.testng.annotations.Test;

public class AddPostTests extends TestBase {
    AddPostPage AddPostObj;

    @Test(priority = 3,enabled = false)
    public void UserCanAddNormalPost() throws InterruptedException {
        AddPostObj= new AddPostPage(driver);
        AddPostObj.AddNormalPost(driver);
    }
    @Test(priority = 4,enabled = false)
    public void UserCanAddStory() throws InterruptedException {
        AddPostObj=new AddPostPage(driver);
        AddPostObj.AddStory(driver);
    }
    @Test(priority = 4,enabled = true)
    public void UserCanAddPhotoAndGallery() throws InterruptedException {
        AddPostObj=new AddPostPage(driver);
        AddPostObj.AddAll(driver);
    }
    @Test(priority = 5,enabled = true)
    public void UserCanAddTextPost() throws InterruptedException {
        AddPostObj=new AddPostPage(driver);
        AddPostObj.AddText(driver);
    }
    @Test(priority = 14,enabled = true)
    public void DeleteMyPosts() throws InterruptedException {
        AddPostObj = new AddPostPage(driver);
        AddPostObj.DeleteMyPost(driver);
    }
    @Test(priority = 13,enabled = true)
    public void DeleteMyStory() throws InterruptedException {
        AddPostObj=new AddPostPage(driver);
        AddPostObj.DeleteMyStory(driver);
    }
}

