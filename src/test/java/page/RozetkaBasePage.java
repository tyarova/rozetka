package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RozetkaBasePage {
    WebDriver driver;

    @FindBy(name = "page_loyalty")
    private WebElement footerPageLoyalty;

    @FindBy(name = "page_gift")
    private WebElement footerPageGift;

    @FindBy(name = "page_gift")
    private WebElement footerReturnPurchase;

    public RozetkaBasePage (WebDriver driver){
        this.driver = driver;
    }


}
