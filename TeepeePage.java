package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class TeepeePage extends PageBase {
    public TeepeePage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }
    @FindBy(id = "com.humansoftsolution.ugu.staging:id/teePeeFragment")
    MobileElement Teepee;
    @FindBy(id = "com.humansoftsolution.ugu.staging:id/iv_fab_add")
    MobileElement plusBtn;
    @FindBy(id = "com.humansoftsolution.ugu.staging:id/cv_tp_image")
    MobileElement chooseTemp;
    @FindBy(id = "com.humansoftsolution.ugu.staging:id/tv_dialog_description")
    MobileElement errorMsg;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/tv_dialog_description")
    MobileElement warningMsg;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/btn_positive")
    MobileElement payNw;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/add_cover")
    MobileElement addCoverTp;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView")
    MobileElement AlbumPhotos;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/iv_photo")
    MobileElement photo;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/crop_image_menu_crop")
    MobileElement cropBtn;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/et_name")
    MobileElement Title;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/et_desc")
    MobileElement Description;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/btn_next")
    MobileElement next;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/img_add_template1")
    MobileElement addTemp;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/img_add_template2")
    MobileElement temp2;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/iv_video_player_3_icon")
    MobileElement temp3;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
    MobileElement chooseVideos;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.ImageView[1]")
    MobileElement Video;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/img_add_template4")
    MobileElement temp4;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/tv_content")
    MobileElement contentTp;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/btn_publish")
    MobileElement publish;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/btn_negative")
    MobileElement TryAgain;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/rb_private")
    MobileElement SpecificUsers;
    @FindBy(id="com.humansoftsolution.ugu.staging:id/add_person")
    MobileElement plusAdd;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.Button")
    MobileElement User1;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.Button")
    MobileElement User2;

    public void AddPubTPPost(AppiumDriver driver) throws InterruptedException {
        ClickButton(Teepee);
        Thread.sleep(1000);
        ClickButton(plusBtn);
        ClickButton(chooseTemp);
        String error = errorMsg.getText();
        if (error.contains("You don’t have enough SUGU in your account to submit your TP")) {
            Assert.assertEquals(errorMsg.getText(),"You don’t have enough SUGU in your account to submit your TP. Please, recharge your account and try again");
            System.out.println("Network error Or No credit");
            ClickButton(TryAgain);
        }
        else
        {
            Assert.assertEquals(errorMsg.getText(),"Submitting a new TP will cost you 100 SUGU. If confirmed, the amount will be deducted from your balance");
            ClickButton(payNw);
            ClickButton(addCoverTp);
            //ThreeAllows();
            ClickButton(AlbumPhotos);
            ClickButton(photo);
            ClickButton(cropBtn);
            Title.sendKeys("Automation Checking..");
            Description.sendKeys("Automation run check TP posts works or not ");
            ClickButton(next);
            ClickButton(addTemp);
            ClickButton(AlbumPhotos);
            ClickButton(photo);
            ClickButton(temp2);
            ClickButton(AlbumPhotos);
            ClickButton(photo);
            ClickButton(temp3);
            ClickButton(chooseVideos);
            ClickButton(Video);
            ClickButton(temp4);
            ClickButton(AlbumPhotos);
            ClickButton(photo);
            contentTp.sendKeys("Automation Testing");
            ClickButton(publish);
            Thread.sleep(5000);
            driver.navigate().back();
            driver.navigate().back();
        }

        driver.navigate().back();
        driver.navigate().back();


    }
    public void specificUserTpPost(AppiumDriver driver) throws InterruptedException {
        ClickButton(Teepee);
        ClickButton(plusBtn);
        ClickButton(chooseTemp);
        String error = errorMsg.getText();
        if (error.contains("You don’t have enough SUGU in your account to submit your TP")) {
            Assert.assertEquals(errorMsg.getText(),"You don’t have enough SUGU in your account to submit your TP. Please, recharge your account and try again");
            System.out.println("Network error Or No credit");
            ClickButton(TryAgain);
        }
        else
        {
            Assert.assertEquals(errorMsg.getText(),"Submitting a new TP will cost you 100 SUGU. If confirmed, the amount will be deducted from your balance");

            ClickButton(payNw);
            ClickButton(addCoverTp);
            ClickButton(AlbumPhotos);
            ClickButton(photo);
            Title.sendKeys("Automation Checking..");
            Description.sendKeys("Automation run check TP posts works or not ");
            ClickButton(SpecificUsers);
            ClickButton(plusAdd);
            ClickButton(User1);
            ClickButton(plusAdd);
            ClickButton(User2);
            ClickButton(next);
            ClickButton(addTemp);
            ClickButton(AlbumPhotos);
            ClickButton(photo);
            ClickButton(temp2);
            ClickButton(AlbumPhotos);
            ClickButton(photo);
            ClickButton(temp3);
            ClickButton(chooseVideos);
            ClickButton(Video);
            ClickButton(temp4);
            ClickButton(AlbumPhotos);
            ClickButton(photo);
            contentTp.sendKeys("Automation Testing");
            ClickButton(publish);
            Thread.sleep(5000);
            driver.navigate().back();
            driver.navigate().back();
        }

        driver.navigate().back();
        driver.navigate().back();
    }

    }

