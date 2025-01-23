import Page_Objects.Products_Page_Object;
import Page_Objects.Register_Page_Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchProduct {
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
    public void SearchProduct(){
        Register_Page_Object search = new Register_Page_Object(driver);
        Products_Page_Object search1 = new Products_Page_Object(driver);

        search.HomeVerify1();
        search1.ClickProductsBtn();
        search1.AllProductsPageVerify1();

        search1.EnterProductName("Tshirt");
        search1.ClickOnSearchBtn();
        search1.SearchProductPageVerify9();
        search1.BrandProductVisibleVeify10();

    }

}
