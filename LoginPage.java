package Pages;

import com.sun.javafx.scene.traversal.Direction;
import io.appium.java_client.*;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoginPage extends PageBase {

    public LoginPage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement EmailTxt;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement passwordTxt;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/login_btn")
    MobileElement LoginBtn;
    @FindBy(id="com.humansoftsolution.ugu:id/textinput_error")
    MobileElement ExpectedMessage;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/textinput_error")
    MobileElement EmptyErrorMessage;
    public void InvalidCredentials(AppiumDriver driver){
        EmailTxt.sendKeys("user-5@ugu.com");
        //ScrollDown(driver);
        passwordTxt.sendKeys("S1234s");
        ClickButton(LoginBtn);
        Assert.assertEquals(ExpectedMessage.getText(),"Wrong email or password!");
        System.out.println(ExpectedMessage.getText());
    }
    public void EmptyFields (AppiumDriver driver)
    {
        //ScrollDown(driver);
        ClickButton(LoginBtn);
        Assert.assertEquals(EmptyErrorMessage,"This field cannot be empty");
        System.out.println(EmptyErrorMessage.getText());
    }
    public void SuccessfullyLogin(AppiumDriver driver) throws InterruptedException {
     Random r =new Random();
     int RandomInt=r.nextInt(100);
     //EmailTxt.sendKeys("user-"+RandomInt+"@ugu.com");
       EmailTxt.sendKeys("nermeenrays20@gmail.com");
       // EmailTxt.sendKeys("nermeen@gmail.com");
        //ScrollDown(driver);
        passwordTxt.sendKeys("Yasmeen42014118");
        ClickButton(LoginBtn);
        Thread.sleep(4000);
    }
    public void swipeSplashScreen(AppiumDriver driver) {
      Dimension dimension=driver.manage().window().getSize();
      System.out.println("value x and y are  "+ dimension);
      Double point =dimension.getWidth()*0.45;
      int pointAsAnInteger=point.intValue();
      System.out.println(pointAsAnInteger);
      System.out.println(pointAsAnInteger*2);
      //TouchAction action=new TouchAction(driver);
//      action.press(PointOption.point(0,pointAsAnInteger))
//              .waitAction(new WaitOptions().withDuration(Duration.ofMillis(5000)))
//              .moveTo(PointOption.point(pointAsAnInteger*2,pointAsAnInteger))
//              .release()
//              .perform();
//      action.press(PointOption.point(pointAsAnInteger*2,pointAsAnInteger))
//              .waitAction(new WaitOptions().withDuration(Duration.ofMillis(5000)))
//              .moveTo(PointOption.point(pointAsAnInteger*2,pointAsAnInteger))
//              .release()
//              .perform();
        int startx =1080;
        int endx=1794;
        new TouchAction((PerformsTouchActions)driver)
                .press(PointOption.point(0,startx))
                .moveTo(PointOption.point(0,endx))
                .release()
                .perform();






}
}
