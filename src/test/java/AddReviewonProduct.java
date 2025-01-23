import Page_Objects.Products_Page_Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddReviewonProduct {
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
    public void AddReviewOnProduct(){
        Products_Page_Object product = new Products_Page_Object(driver);
        product.ClickProductsBtn();
        product.AllProductsPageVerify1();
        product.ClickOnViewDetailsBtn();
        product.ViewDetailsPageVerify2();

        product.WriteYourReviewVerify();
        product.EnterName("Preksha Neupane");
        product.EnterEmail("preksha34@gmail.com");
        product.EnterReview("The product quality is consistently outstanding, exceeding my expectations every time.");
        product.ClickOnSubmitReviewBtn();
        product.ThankReviewVerify();
    }
}
