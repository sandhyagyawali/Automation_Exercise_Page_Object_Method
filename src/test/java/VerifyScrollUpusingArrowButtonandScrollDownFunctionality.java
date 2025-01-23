import Page_Objects.Register_Page_Object;
import Page_Objects.SubscriptionFooter_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class VerifyScrollUpusingArrowButtonandScrollDownFunctionality {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","src/test/chromeDriver/chromedriver.exe");
        driver.manage().window().maximize();

        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void UsingArrow() throws InterruptedException {
        Register_Page_Object subscription = new Register_Page_Object(driver);
        SubscriptionFooter_POM subscription2 = new SubscriptionFooter_POM(driver);

        subscription.HomeVerify1();

        WebElement scrollFooter = driver.findElement(By.cssSelector("footer"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollFooter);
        sleep(1000);

        subscription2.SubscriptionVerify1();

        WebElement Arrow = driver.findElement(By.xpath("//*[@id=\"scrollUp\"]/i"));
        Arrow.click();

        WebElement ScrollUpVerify = driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h2"));
        String textup = ScrollUpVerify.getText();
        Assert.assertEquals(textup,"Full-Fledged practice website for Automation Engineers");

    }
}
