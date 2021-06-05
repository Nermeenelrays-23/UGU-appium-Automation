package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;

public class LifePage extends PageBase{
    public LifePage(AppiumDriver driver) {
        super(driver);

    }
    @FindBy(id="com.humansoftsolution.ugu.debug:id/nav_graph_ugu_world")
    MobileElement uguWorld;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/life_view")
    MobileElement selectLife;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/open_life_thumbnail")
    MobileElement firstLife;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup")
    MobileElement joinBtn;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/tv_dialog_description")
    MobileElement errorMsg;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/btn_negative")
    MobileElement TryAgain;
    @FindBy(id = "com.humansoftsolution.ugu.debug:id/btn_positive")
    MobileElement ContinueBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/layoutRecording")
    MobileElement captureCamera;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/snackbar_text")
    MobileElement videoOnly;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_send")
    MobileElement send;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/et_caption")
    MobileElement captiontxt;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/submit_world")
    MobileElement submitLife;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/checkbox_accept_policy")
    MobileElement TermsAndConditionsBtn;

    public void submitLife(AppiumDriver driver) throws InterruptedException {
        ClickButton(uguWorld);
        ClickButton(selectLife);
        ClickButton(firstLife);
        Thread.sleep(1000);
        ClickButton(TermsAndConditionsBtn);
        ClickButton(joinBtn);

        ClickButton(ContinueBtn);
        ClickButton(captureCamera);
        //String error = errorMsg.getText();
//        if (error.contains("You don’t have enough SUGU in your account ")) {
//            Assert.assertEquals(errorMsg.getText(),error.contains("You don’t have enough SUGU in your account"));
//            System.out.println("Network error Or No credit");
//            ClickButton(TryAgain);
//        }
//        else
//        {
//            Assert.assertEquals(errorMsg.getText(),error.contains("it will cost you"));
//            //ThreeAllows();
//            ClickButton(captureCamera);
//            if(videoOnly.isDisplayed())
//            {
//                System.out.println("This dare is videos only...");
//                Dimension size = driver.manage().window().getSize();
//                System.out.println(size.height+"height");
//                System.out.println(size.width+"width");
//                System.out.println(size);
//                int startPoint = (int) (size.width * 0.99);
//                int endPoint = (int) (size.width * 0.15);
//                int ScreenPlace =(int) (size.height*0.40);
//                //int y=(int)size.height*20;
//                TouchAction ts = new TouchAction(driver);
//                //for(int i=0;i<=3;i++) {
//                ts.press(PointOption.point(startPoint,ScreenPlace))
//                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
//                        .moveTo(PointOption.point(endPoint,ScreenPlace)).release().perform();
//            }
//            else {
//                ClickButton(captureCamera);
//            }
            ClickButton(send);
            captiontxt.sendKeys("It's automation run");
            ClickButton(submitLife);
            Thread.sleep(1000);
            driver.navigate().back();
            //driver.navigate().back();
            Thread.sleep(1000);

        }

    }


