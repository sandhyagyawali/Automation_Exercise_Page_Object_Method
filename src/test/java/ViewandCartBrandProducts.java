import Page_Objects.Products_Page_Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ViewandCartBrandProducts {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","src/test/chromeDriver/chromedriver.exe");
        driver.manage().window().maximize();

        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void ViewCartBrandProducts(){
        Products_Page_Object product = new Products_Page_Object(driver);

        product.ClickProductsBtn();
        product.BrandDisplayedVerify();
        product.BrandNameClick1();
        product.BrandPageVerify();
        product.BrandProductVerify();
        product.BrandNameClick2();
        product.BrandPageVerify();
        product.BrandProductVerify();
    }
}
