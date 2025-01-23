import Page_Objects.Cart_Page_Object;
import Page_Objects.Products_Page_Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyProductQuantityInCart {

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void SetUp(){
        //Setting up the path of chrome driver
        System.setProperty("webdriver.chrome.driver","src/test/chromeDriver/chromedriver.exe");
        driver.manage().window().maximize();

        //Open selenium Practice
        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void VerifyProductQuantity() throws InterruptedException {

        Cart_Page_Object cart = new Cart_Page_Object(driver);
        cart.HomeVerify1();

        cart.ClickOnViewProductBtn();

        Products_Page_Object product = new Products_Page_Object(driver);
        product.ProductNameVerify3();
        product.CategoryVerify4();
        product.PriceVerify5();
        product.AvailabilityVerify6();
        product.ConditionVerify7();
        product.BrandVerify8();
        product.IncreaseQuantityOfProduct("4");
        product.ClickOnAddtoCartBtn();
        product.ClickOnViewCartBtn2();
        product.VerifyQuantityEnter();

    }
}
