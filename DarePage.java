package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DarePage extends PageBase {
    public DarePage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

    }

//    @AndroidBy(accessibility ="Ugu World")
//    MobileElement DareBtn;

    @FindBy(id = "com.humansoftsolution.ugu.debug:id/nav_graph_ugu_world")
    MobileElement uguWorld;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/dares_view")
    MobileElement ChooseDare;
    @FindBy(className = "androidx.cardview.widget.CardView")
    MobileElement firstDare;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/join_card_btn")
    MobileElement joinDare;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/btn_positive")
    MobileElement join;
    @FindBy(id = "com.humansoftsolution.ugu:id/snackbar_text")
    MobileElement videoOnly;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/layoutRecording")
    MobileElement captureCamera;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/iv_send")
    MobileElement send;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/et_caption")
    MobileElement dareText;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/submit_world")
    MobileElement submitDare;
    @FindBy(id = "com.humansoftsolution.ugu:id/tv_dialog_description")
    MobileElement errorMsg;
    @FindBy(id = "com.humansoftsolution.ugu:id/btn_negative")
    MobileElement TryAgain;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/suggested_world_title")
    MobileElement dareTitle;
    @FindBy(id = "com.humansoftsolution.ugu:id/iv_pick_from_gallery")
    MobileElement Gallery;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
    MobileElement Album;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.ImageView[1]")
    MobileElement selectedVideo;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/btn_positive")
    MobileElement done;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/checkbox_accept_policy")
    MobileElement TermsAndConditionsBtn;


    public void JoinDare(AppiumDriver driver) throws InterruptedException {
//       MobileElement Dare= (MobileElement) driver.findElement(new MobileBy.ByAccessibilityId("Dare"));
//        ClickButton(Dare);
        ClickButton(uguWorld);
        ClickButton(ChooseDare);
        ClickButton(firstDare);
        Thread.sleep(1000);
        ClickButton(TermsAndConditionsBtn);
        ClickButton(joinDare);

        ClickButton(join);
        //String error = errorMsg.getText();
//            if (dareTitle.isDisplayed())
//            {
//                ClickButton(captureCamera);
//                if (videoOnly.isDisplayed())
//                {
//                    System.out.println("This dare is videos only...");
//
//                    ClickButton(Gallery);
//                    ClickButton(Album);
//                    ClickButton(selectedVideo);
//                    // ClickButton(DoneBtn);
//
//                }
//                else {
//
//
//                    ClickButton(captureCamera);
//                }
                ClickButton(captureCamera);
                ClickButton(send);
                dareText.sendKeys("It's automation run");
                ClickButton(submitDare);
                WebDriverWait wait = new WebDriverWait(driver, 100);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu.debug:id/btn_positive")));
                ClickButton(done);
            }

//        else if (errorMsg.isDisplayed())
//        {
//                ClickButton(TryAgain);
//                driver.navigate().back();
//                driver.navigate().back();
//                driver.navigate().back();
//        }
//        }
    }

