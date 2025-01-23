import Page_Objects.Cart_Page_Object;
import Page_Objects.LoginUser_Project_Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlaceOrderLoginbeforeCheckout {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","src/test/chromeDriver/chromedriver.exe");
        driver.manage().window().maximize();

        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void LoginBeforeCheckout() throws InterruptedException {
        LoginUser_Project_Object login = new LoginUser_Project_Object(driver);


        login.HomeVerify1();

        login.ClickOnSignLoginBtn();

        login.LoginPageVerify2();

        login.EnterEmail("preksha34@gmail.com");

        login.EnterPassword("preksha34");

        login.ClickLoginBtn();

        login.UserNameVerify3();

        Cart_Page_Object cart = new Cart_Page_Object(driver);

        cart.HomeVerify1();
        cart.ClickOnAddToCartBtn();
        cart.ClickOnContinueShoppingBtn();
        cart.ClickOnCartBtn();

        cart.CartPageVerify();
        cart.CheckoutBtn();
        cart.VerifyAddressDetails();
        cart.VerifyReviewOrder();
        cart.AddDescription("Address Details and Order is correct.");
        cart.ClickOnPlaceOrderBtn();


        cart.NameonCardField("Sandhya2");
        cart.CardNumberField("768543");
        cart.CVCField("234");
        cart.ExpirationFieldMM("03");
        cart.ExpirationFieldYY("2025");
        cart.ClickOnPayandConfirmBtn();
        cart.VerifySuccessOrderMsg();

        login.ClickLogoutBtn();

        login.LoginPageVerify2();
    }
}
