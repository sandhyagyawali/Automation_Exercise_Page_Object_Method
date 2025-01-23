import Page_Objects.Cart_Page_Object;
import Page_Objects.Products_Page_Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class AddProductsInCart {

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
    public void AddProducts() throws InterruptedException {
        Cart_Page_Object cart = new Cart_Page_Object(driver);
        Products_Page_Object product = new Products_Page_Object(driver);

        cart.HomeVerify1();
        product.ClickProductsBtn();

        cart.ClickOnAddToCartBtn();

        cart.ClickOnContinueShoppingBtn();

        cart.ClickOnAddToCartBtn2();
        cart.ClickOnViewCartBtn();

        cart.FirstProductverify();
        cart.SecondProductVerify();


    }
}
