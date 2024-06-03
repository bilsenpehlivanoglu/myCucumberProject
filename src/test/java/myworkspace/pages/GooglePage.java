package myworkspace.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import myworkspace.utilities.Driver;
import myworkspace.utilities.ReusableMethods;

public class GooglePage {

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="APjFqb")
    public WebElement searchbox;



}