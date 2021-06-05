package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AddPostPage extends PageBase {
    public AddPostPage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

    }
//
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.humansoftsolution.ugu.staging:id/nav_graph_content_creator'][2]")
    MobileElement add;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/layoutRecording")
    MobileElement Capture;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_send")
    MobileElement Send;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/et_caption")
    MobileElement Automation_Run;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/btn_send_post")
    MobileElement NormalPost;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/btn_send_story")
    MobileElement Story;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_close")
    MobileElement Close;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_pick_from_gallery")
    MobileElement Gallery;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/action_done")
    MobileElement DoneBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_add_text_content")
    MobileElement TextBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/et_post_text")
    MobileElement PostText;
    @FindBy(className="android.widget.RelativeLayout")
    MobileElement successStoryMessage;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
    MobileElement AlbumPhotos;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
    MobileElement Image1;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_photo")
    MobileElement Image;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/profile_avatar_iv")
    MobileElement profile;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/ll_posts")
    MobileElement posts;
    @FindBy(className = "android.widget.ImageView")
    MobileElement firstPost;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/btn_send_chat")
    MobileElement sentToFriend;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/et_search")
    MobileElement searchInChat;
    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'title') and @text=\"Delete\"]")
    MobileElement delete;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/btn_positive")
    MobileElement confirmDeleting;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_more_actions")
    MobileElement options;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/tv_story_text")
    MobileElement myStoryText;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_story_image")
    MobileElement myStoryImage;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/story_report_btn")
    MobileElement storyOptions;


    public void AddNormalPost(AppiumDriver driver) throws InterruptedException {
        Thread.sleep(1000);
       WebElement Add= driver.findElement(new MobileBy.ByAccessibilityId("Camera"));
        ClickButton((MobileElement) Add);
        ClickButton(Allow1);
        ClickButton(Allow2);
        ClickButton(Allow3);
        ClickButton(Capture);
        ClickButton(Send);
        Automation_Run.sendKeys("Automation Run ");
        ClickButton(NormalPost);
      //  driver.navigate().back();
       // driver.navigate().back();

    }
    public void AddStory(AppiumDriver driver) throws InterruptedException {
//        ClickButton(AddPostBtn);
//        ClickButton(Allow1);
//        ClickButton(Allow2);
//        ClickButton(Allow3);
//        ClickButton(Gallery);
//        ClickButton(Image1);
//        ClickButton(DoneBtn);
//        ClickButton(Send);
//        Automation_Run.sendKeys("Automation Run ");
        WebDriverWait wait = new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu.debug:id/btn_send_story")));
        ClickButton(Story);
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        ClickButton(Close);
        System.out.println(successStoryMessage.getText());
        Assert.assertEquals(successStoryMessage.getText(),"Story added successfully :)");
//        WebDriverWait w = new WebDriverWait(driver,50);
//        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu.staging:id/snackbar_text")));
//        driver.navigate().back();
//        driver.navigate().back();
    }

    public void AddFromGallery(AppiumDriver driver)
    {
        //ClickButton(AddPostBtn);
        ThreeAllows();
        ClickButton(Gallery);
        ClickButton(Image1);
       // ClickButton(Image2);
        ClickButton(DoneBtn);
        ClickButton(Send);
        Automation_Run.sendKeys("Automation Run ");
        ClickButton(NormalPost);
        WebDriverWait wait = new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu:id/btn_send_story")));
        ClickButton(Story);
        driver.navigate().back();
        driver.navigate().back();
    }
    public void AddAll(AppiumDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver,100);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu:id/nav_graph_content_creator")));

        WebElement Add= driver.findElement(new MobileBy.ByAccessibilityId("Camera"));
        ClickButton((MobileElement) Add);
        ThreeAllows();
        ClickButton(Capture);
        ClickButton(Gallery);
        ClickButton(AlbumPhotos);
        ClickButton(Image1);
        ClickButton(DoneBtn);
        ClickButton(Send);
        Automation_Run.sendKeys("Automation Run ");
        ClickButton(NormalPost);
        Thread.sleep(2000);
//        WebDriverWait wait = new WebDriverWait(driver,50);
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu:id/btn_send_story")));
        ClickButton(Story);
        Thread.sleep(2000);
        ClickButton(sentToFriend);
        searchInChat.sendKeys("ahmed");
        MobileElement Chat= (MobileElement) driver.findElementsById("com.humansoftsolution.ugu.debug:id/btn_send").get(3);
        Chat.click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().back();
    }
    public void AddText(AppiumDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        //WebElement Add= driver.findElement(new MobileBy.ByAccessibilityId("Camera"));
        //ClickButton((MobileElement) Add);
        //ClickButton(add);
        WebElement Add= driver.findElement(new MobileBy.ByAccessibilityId("Camera"));
        ClickButton((MobileElement) Add);
        ClickButton(TextBtn);
        PostText.sendKeys("Hello, It's automation Run");
        ClickButton(NormalPost);
        Thread.sleep(1000);
        ClickButton(Story);
        Thread.sleep(1000);
        ClickButton(sentToFriend);
        searchInChat.sendKeys("ahmed");
        MobileElement Chat= (MobileElement) driver.findElementsById("com.humansoftsolution.ugu.debug:id/btn_send").get(3);
        Chat.click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
    }

    public void DeleteMyPost(AppiumDriver driver) throws InterruptedException {
        //MobileElement profile= (MobileElement) driver.findElement(new MobileBy.ByAccessibilityId("Image Description"));
        ClickButton(profile);
        ClickButton(posts);
        MobileElement firstPost= (MobileElement) driver.findElementsById("com.humansoftsolution.ugu.debug:id/video_news_feed_content").get(0);
        firstPost.click();
        for(int i=1;i<10;i++)
        {
           // MobileElement options = (MobileElement) driver.findElementsByAccessibilityId("Image Description");
            Thread.sleep(1000);
            options.click();
            ClickButton(delete);
            ClickButton(confirmDeleting);
        }
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();

    }

    public void DeleteMyStory(AndroidDriver<MobileElement> driver) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        for (int i = 1; i < 2; i++) {
            //delete story text
            Thread.sleep(1000);
            ClickButton(myStoryImage);
            Thread.sleep(1000);
            storyOptions.click();
            ClickButton(delete);
            ClickButton(confirmDeleting);
            Thread.sleep(1000);
            //delete story image
            ClickButton(myStoryText);
            Thread.sleep(1000);
            storyOptions.click();
            ClickButton(delete);
            ClickButton(confirmDeleting);

        }
    }

    }

