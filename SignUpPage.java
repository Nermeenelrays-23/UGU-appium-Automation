package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageBase {
    public SignUpPage(AppiumDriver driver) {
        super(driver);
    }
    @FindBy(id="com.humansoftsolution.ugu:id/signup_btn")
    MobileElement SignUpBtn;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement FirstNameTxt;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement LastNameTxt;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement EmailTxt;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement PasswordTxt;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement ConfirmPassTxt;
    @FindBy(id="com.humansoftsolution.ugu:id/reg_phone_edit")
    MobileElement PhoneNumberTxt;
    @FindBy(id="com.humansoftsolution.ugu:id/join_now_btn")
    MobileElement JoinNowBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/firstPinView")
    MobileElement VerificationTxt;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/code_verify_btn")
    MobileElement NextBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/btn_confirm_extras_close")
    MobileElement ExitCode;
    public void SignUp(AppiumDriver driver)
    {
        //ScrollDown(driver);
        ClickButton(SignUpBtn);
        FirstNameTxt.sendKeys("Nermeen");
        LastNameTxt.sendKeys("Mahmoud");
        //ScrollDown(driver);
        EmailTxt.sendKeys("Nermeen13@gmail.com");
        PasswordTxt.sendKeys("Yasmeen42014118");
        ConfirmPassTxt.sendKeys("Yasmeen42014118");
       // ScrollDown(driver);
        PhoneNumberTxt.sendKeys("01113153105");
        ClickButton(JoinNowBtn);
        VerificationTxt.sendKeys("");
        ClickButton(NextBtn);
        ClickButton(ExitCode);

    }



}
