import Page_Objects.Register_Page_Object;
import Page_Objects.SubscriptionFooter_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifySubscriptionInHomePage {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void SetUp(){
        //Seting up the path of chrome driver
        System.setProperty("webdriver.chrome.driver","src/test/chromeDriver/chromedriver.exe");
        driver.manage().window().maximize();

        //Open selenium Practice
        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void HomePageSubscription() throws InterruptedException {
        Register_Page_Object subscription = new Register_Page_Object(driver);
        SubscriptionFooter_POM subscription2 = new SubscriptionFooter_POM(driver);

        subscription.HomeVerify1();

        WebElement scrollFooter = driver.findElement(By.cssSelector("footer"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollFooter);
        Thread.sleep(1000);

        subscription2.SubscriptionVerify1();
        subscription2.EnterEmailAddress("preksha34@gmail.com");
        subscription2.ClickOnArrowBtn();

        subscription2.AlertMsg();
    }
}
