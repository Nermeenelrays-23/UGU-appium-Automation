package Pages;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class NewsfeedsPage extends PageBase{




    public NewsfeedsPage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }
//    @FindBy(id="com.humansoftsolution.ugu.staging:id/image_news_feed_content")
//    MobileElement Post;

    @FindBy(id="com.humansoftsolution.ugu.debug:id/love_reaction")
    MobileElement LoveReact;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_search")
    MobileElement SearchBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/et_search_box")
    MobileElement SearchTxt;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    MobileElement NermeenAccount;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_follow")
    MobileElement FollowBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_global_back")
    MobileElement BackArrow;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView[1]")
    MobileElement post2;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/tv_comments_num")
    MobileElement CommentIcon;
    @FindBy(id= "com.humansoftsolution.ugu.debug:id/write_comment_input_edit_text")
    MobileElement writeComment;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/comment_send_btn")
    MobileElement sendBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/btn_share_post")
    MobileElement sharePost;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/et_write_comment")
    MobileElement addComment;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/write_comment_input_edit_text")
    MobileElement commentTxt;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/write_comment_media_preview_btn")
    MobileElement addFromGallery;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView")
    MobileElement albumPhotos;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
    MobileElement Pic1;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/item_comment_picture_reply_btn")
    MobileElement replyBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/write_reply_input_edit_text")
    MobileElement replyTxt;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    MobileElement replyBtnSend;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/write_reply_media_preview_btn")
    MobileElement galleryBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/btn_comments")
    MobileElement commentView;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/ll_posts")
    MobileElement posts;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/image_news_feed_content")
    MobileElement post1;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/bt_share_to_feed")
    MobileElement ShareToFeed;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/item_comment_picture_caption_value")
    MobileElement clickToDelete;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/comments_replies_sheet_delete_action")
    MobileElement deleteOption;
    @FindBy(id="android:id/button1")
    MobileElement confirmDeleting;
    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_snack_message') and @text=\"Comment Deleted Successfully\"]")
    MobileElement successDeleteMessage;


    public void LoveReact(AppiumDriver driver)
    {
        MobileElement post= (MobileElement) driver.findElementsById("com.humansoftsolution.ugu.debug:id/video_news_feed_content").get(0);
        AndroidTouchAction touch = new AndroidTouchAction (driver);
        touch.longPress(LongPressOptions.longPressOptions()
                .withElement (ElementOption.element (post)))
                .perform ();


        System.out.println("Love react tapped");

    }
    //search on "Ahmed"
    public void Search(AppiumDriver driver) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //MobileElement search= (MobileElement) driver.findElement(new MobileBy.ByAccessibilityId("Search"));
        MobileElement search= (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'action_search')[1]]"));
        Thread.sleep(3000);
        ClickButton(search);
        SearchTxt.sendKeys("Ahmed shafik");
        //SearchTxt.click();
        //SearchTxt.click();
        //driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        //driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        MobileElement chooseAccount= (MobileElement) driver.findElementsById("com.humansoftsolution.ugu.debug:id/search_user_container").get(0);
        //Thread.sleep(1000);
        MobileElement Account = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'search_user_full_name') and @text=\"ahmed shafik\"]"));
        //WebDriverWait wait=new WebDriverWait(driver, 20);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        Account.click();
        Thread.sleep(2000);

//        if (FollowBtn.isDisplayed()) {
//            ClickButton(FollowBtn);
//        }
//        else
//        {
//            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//            AndroidTouchAction touch = new AndroidTouchAction (driver);
//            touch.longPress(LongPressOptions.longPressOptions()
//                    .withElement (ElementOption.element (Post)))
//                    .perform ();
//
//        }
    }
    //search on random user to fund him, figure out how important this method first to do it
    public  void searchOnRandomUser(AppiumDriver driver){
        for(int i=0;i<100;i++)
        {
            MobileElement search= (MobileElement) driver.findElement(new MobileBy.ByAccessibilityId("Search"));
            ClickButton(search);
            SearchTxt.sendKeys("user");
            MobileElement user= (MobileElement) driver.findElements(By.id("com.humansoftsolution.ugu.debug:id/search_user_container")).get(i);
            //String users= driver.findElement(By.id("com.humansoftsolution.ugu.staging:id/tv_search_following")).getText();
            MobileElement account=(MobileElement)driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+"new UiSelector().textContains(\"Funding\").instance(0))"));
            if(account.isDisplayed())
            {
                System.out.println("User already funded ");
            }
            else
                {
                    search.click();
                    MobileElement fundBtn= (MobileElement) driver.findElementsByAccessibilityId("Image Description");
                    fundBtn.click();
                }
        }
    }
    public void addComment(AppiumDriver driver) throws InterruptedException
    {
        //MobileElement FirstPostVideo= (MobileElement) driver.findElementsById("com.humansoftsolution.ugu.staging:id/video_news_feed_content").get(0);
        MobileElement FirstPostText= (MobileElement) driver.findElementsById("com.humansoftsolution.ugu.debug:id/video_news_feed_content").get(1);
//        if (FirstPostVideo.isDisplayed())
//        {
//            FirstPostVideo.click();
//        }
        //else if (FirstPostText.isDisplayed())
       // {

            FirstPostText.click();
        //}
//        else {
//            MobileElement FirstPostImage=(MobileElement) driver.findElementsById("com.humansoftsolution.ugu.staging:id/image_news_feed_content").get(0);
//            FirstPostImage.click();
//        }
        //share the first post
        ClickButton(sharePost);
        ClickButton(ShareToFeed);
        Thread.sleep(1000);
        commentView.click();
        commentTxt.sendKeys("automated comment...");
        ClickButton(addFromGallery);
        ClickButton(albumPhotos);
        ClickButton(Pic1);
        ClickButton(sendBtn);
        //Thread.sleep(2000);
        //driver.navigate().back();
    }
    public void AddReply(AppiumDriver driver)
    {
        ClickButton(replyBtn);
        replyTxt.sendKeys("Automated Reply...");
        ClickButton(galleryBtn);
        ClickButton(albumPhotos);
        ClickButton(Pic1);
        replyBtnSend.click();
        driver.navigate().back();
       // driver.navigate().back();
       // driver.navigate().back();

    }
    public void DeleteComment(AppiumDriver driver) throws InterruptedException {

        AndroidTouchAction touch = new AndroidTouchAction (driver);
        touch.longPress(LongPressOptions.longPressOptions()
                .withElement (ElementOption.element (clickToDelete)))
                .perform ();
        ClickButton(deleteOption);
        ClickButton(confirmDeleting);

        //Assert.assertEquals(successDeleteMessage.getText(),"Comment Deleted Successfully");
        driver.navigate().back();
        driver.navigate().back();
        //driver.navigate().back();
    }

    public void addReact(AppiumDriver driver) throws InterruptedException {
        driver.navigate().back();
        //MobileElement post = (MobileElement) driver.findElementsById("com.humansoftsolution.ugu.staging:id/video_news_feed_content").get(0);
        MobileElement post = (MobileElement) driver.findElementsById("com.humansoftsolution.ugu.debug:id/video_news_feed_content").get(1);
        // AndroidTouchAction touch = new AndroidTouchAction (driver);
        // touch.longPress(LongPressOptions.longPressOptions()
        //       .withElement (ElementOption.element (post)))
        //      .perform ();
        ClickButton(post);
        ClickButton(LoveReact);
        Thread.sleep(1000);
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();

    }

    //This function for Test only
    public void addMultiComments(AppiumDriver driver){
        MobileElement profile= (MobileElement) driver.findElement(new MobileBy.ByAccessibilityId("Image Description"));
        ClickButton(profile);
        ClickButton(posts);
        ClickButton(post1);
        ClickButton(CommentIcon);
        for(int i=0;i<100;i++)
        {
            writeComment.sendKeys("Automated comment ...");
            ClickButton(sendBtn);
        }



    }
}
