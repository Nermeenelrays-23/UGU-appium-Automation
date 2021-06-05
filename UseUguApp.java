package Steps;

import Pages.*;
import Tests.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UseUguApp extends TestBase {
    LoginPage LoginObj;
    AddPostPage AddPostObj;
    NewsfeedsPage NewsFeedObj;
    DarePage DareObj;
    LifePage LifeObj;
    LogoutPage LogoutObj;


    @Given("The User Login in the app")
    public void The_User_Login_in_the_app() throws InterruptedException
    {
        LoginObj = new LoginPage(driver);
        LoginObj.SuccessfullyLogin(driver);
    }

    @And("user choose to add image post & image story and sent it to friend")
    public void user_choose_to_add_image_post_image_story_and_sent_it_to_friend() throws InterruptedException
    {
        AddPostObj = new AddPostPage(driver);
        AddPostObj.AddAll(driver);

    }

    @And("choose to add text story and text post and sent it to friend")
    public void choose_to_add_text_story_and_text_post_and_sent_it_to_friend() throws InterruptedException
    {
        AddPostObj = new AddPostPage(driver);
        AddPostObj.AddText(driver);
    }

//    @And("select active dare and submit to it")
//    public void select_active_dare_and_submit_to_it() throws InterruptedException
//    {
//        DareObj=new DarePage(driver);
//        DareObj.JoinDare(driver);
//    }

//    @And("select active life and submit to it")
//    public void select_active_life_and_submit_to_it() throws InterruptedException {
//        LifeObj=new LifePage(driver);
//        LifeObj.submitLife(driver);
//    }

    @And("user search on account and add delete comment reply share react to his post")
    public void user_search_on_account_and_add_delete_comment_reply_share_react_to_his_post() throws InterruptedException
    {
        NewsFeedObj=new NewsfeedsPage(driver);
        NewsFeedObj.Search(driver);
        NewsFeedObj.addComment(driver);
        NewsFeedObj.AddReply(driver);
        NewsFeedObj.DeleteComment(driver);
        NewsFeedObj.addReact(driver);
    }
    @And("user can delete his story")
    public void user_can_delete_his_story() throws InterruptedException {
        AddPostObj=new AddPostPage(driver);
        AddPostObj.DeleteMyStory(driver);
    }
    @And("Go to his profile and delete his posts")
    public void Go_to_his_profile_and_delete_his_posts() throws InterruptedException {
        AddPostObj=new AddPostPage(driver);
        AddPostObj.DeleteMyPost(driver);
    }

    @When("Go to profile to select logout")
    public void Go_to_profile_to_select_logout() throws InterruptedException
    {
        LogoutObj=new LogoutPage(driver);
        LogoutObj.GoToProfile(driver);
    }

    @Then("User should logout successfully")
    public void User_should_logout_successfully() throws InterruptedException
    {
        LogoutObj=new LogoutPage(driver);
        LogoutObj.UserCanLogOut(driver);
    }
}