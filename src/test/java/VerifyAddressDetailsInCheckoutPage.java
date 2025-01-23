import Page_Objects.Cart_Page_Object;
import Page_Objects.Register_Page_Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyAddressDetailsInCheckoutPage {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","src/test/chromeDriver/chromedriver.exe");
        driver.manage().window().maximize();

        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void AddressDetailsVerify() throws InterruptedException {
        Register_Page_Object register = new Register_Page_Object(driver);

        register.HomeVerify1();
        register.ClickOnSignLoginBtn();
        register.SignInPageVerify2();
        register.EnterName("Sandhya Gyawali");
        register.EnterEmail("sandhyagyawali63@gmail.com");
        register.ClickOnSignBtn();
        register.DetailsVerify3();
        register.ClickOnTitle();
        register.EnterPassword("sandhya63");
        register.EnterDays("18");
        register.EnterMonths("December");
        register.EnterYears("2002");
        register.ClickOnNewsLetter();
        register.ClickOnOffers();
        register.EnterFirstName("Sandhya");
        register.EnterLastName("Gyawali");
        register.EnterCompany("TechAxis");
        register.EnterAddress1("DownTown 8");
        register.EnterAddress2("Kathmandu,Kalanki");
        register.EnterCountry("India");
        register.EnterState("Downtown");
        register.EnterCity("Pune");
        register.EnterZipCode("9908");
        register.EnterMobileNo("9876543210");
        register.ClickOnCreateAccountField();
        register.AccountCreatedPageVerify4();
        register.ClickOnContinueBtn1();
        register.UserNameVerify5();

        Cart_Page_Object cart = new Cart_Page_Object(driver);

        cart.HomeVerify1();
        cart.ClickOnAddToCartBtn();
        cart.ClickOnContinueShoppingBtn();
        cart.ClickOnCartBtn();

        cart.CartPageVerify();
        cart.CheckoutBtn();
    }
}
