package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ProfilePage extends PageBase {
    public ProfilePage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @FindBy(id="com.humansoftsolution.ugu:id/settings_update_profile_card")
    MobileElement Pencil;
    @FindBy(id="com.humansoftsolution.ugu:id/update_profile_upload_picture")
    MobileElement UploadImage;
    @FindBy(id="com.humansoftsolution.ugu:id/file_thumbnail")
    MobileElement Image;
    @FindBy(id="com.humansoftsolution.ugu:id/done")
    MobileElement DoneBtn;
    @FindBy(id="com.humansoftsolution.ugu:id/update_profile_reset_password")
    MobileElement ChangePass;
    @FindBy(id="com.humansoftsolution.ugu:id/update_profile_save_btn")
    MobileElement SaveBtn;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_profile")
    MobileElement Profile;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/iv_global_settings")
    MobileElement Settings;



    public void ChangeProfilePic(AppiumDriver driver) {
        ClickButton(Profile);
        ClickButton(Settings);
        ClickButton(Pencil);
        ClickButton(UploadImage);
        //ScrollDown(driver);
        ClickButton(Image);
        ClickButton(DoneBtn);
        ClickButton(SaveBtn);
        driver.navigate().back();
        driver.navigate().back();
    }

        public void swipeAction(AppiumDriver driver) {
        ClickButton(Profile);

//            //get device width and height
//            Dimension dimension = driver.manage().window().getSize();
//            int deviceHeight = dimension.getHeight();
//            int deviceWidth = dimension.getWidth();
//            System.out.println("Height x Width of device is: " + deviceHeight + " x " + deviceWidth);
//        System.out.println("Swipe Right to Left");
//        //define starting and ending X and Y coordinates
//        int startX=deviceWidth - Xcoordinate;
//        int startY=Ycoordinate; // (int) (height * 0.2);
//        int endX=Xcoordinate;
//        int endY=Ycoordinate;
//        //perform swipe from right to left
//        new TouchAction((AppiumDriver) driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
//
            Dimension size = driver.manage().window().getSize();
            System.out.println(size.height+"height");
            System.out.println(size.width+"width");
            System.out.println(size);
            int startPoint = (int) (size.width * 0.99);
            int endPoint = (int) (size.width * 0.15);
            int ScreenPlace =(int) (size.height*0.40);
            int y=(int)size.height*20;

            TouchAction ts = new TouchAction(driver);
            //for(int i=0;i<=3;i++) {
            ts.press(PointOption.point(startPoint,ScreenPlace))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(endPoint,ScreenPlace )).release().perform();

    }
    }


