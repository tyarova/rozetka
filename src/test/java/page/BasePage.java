package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    /**
     *Declaration of WebDriver variable within base class,
     *for reuse in other classes' methods, that inherit from the base class
     */
    WebDriver driver;

    /**
     * Constructor of GoogleBasePage class which takes WebDriver instance initialized in @BeforeMethod
     * for reuse in GoogleBasePage class methods
     * @param driver - WebDriver instance
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Wait until WebElement is Visible on Web page
     * @param webElement - WebElement to Wait for
     * @param timeOutInSeconds - the time, that we can set in seconds, to wait for needed element
     * @return WebElement we waited for
     */
    public WebElement waitUntilElementIsVisible(WebElement webElement, int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }

    /**
     * Wait until WebElement is Clickable on Web page
     * @param webElement - WebElement to Wait for
     * @param timeOutInSeconds - the time, that we can set in seconds, to wait for needed element
     * @return WebElement we waited for
     */
    public void waitUntilElementIsClickable(WebElement webElement, int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    /**
     * Returns {@code true} if the element, we are waiting for, has been loaded on the Web page.
     * Such an element is defined on the each page separately.
     * We can say that the Web page has been loaded if this element is visible/clickable.
     * @return {@code true} if the element, we are waiting for, has been loaded on the Web page
     */
    public abstract boolean isLoaded();
}
