import Page_Objects.Cart_Page_Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RemoveProductsFromCart {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","src/test/chromeDriver/chromedriver.exe");
        driver.manage().window().maximize();

        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void RemoveProduct() throws InterruptedException {
        Cart_Page_Object cart = new Cart_Page_Object(driver);

        cart.HomeVerify1();
        cart.ClickOnAddToCartBtn();
        cart.ClickOnContinueShoppingBtn();
        cart.ClickOnCartBtn();
        cart.CartPageVerify();
        cart.ClickOnXbutton();
        cart.ProductRemoveVerify();
    }
}
