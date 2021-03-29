package application.windows.pageObject.popUps;

import framework.base.BaseScreen;
import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class PleaseDoNotForgetPopUp extends BaseScreen {
    private static Label pleaseDoNotForgetLabel = new Label(By.className("android.widget.FrameLayout"), "Please Do Not Forget");
    private Button okButton = new Button(By.id("android:id/button1"), "OK");

    public PleaseDoNotForgetPopUp() {
        super(pleaseDoNotForgetLabel);
    }

    public void accept(){
        okButton.click();
    }
}
