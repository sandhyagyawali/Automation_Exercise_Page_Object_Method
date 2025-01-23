import Page_Objects.Products_Page_Object;
import Page_Objects.Register_Page_Object;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;

import  org.testng.annotations.Test;
import  org.testng.annotations.BeforeClass;
import  org.testng.annotations.AfterClass;

public class VerifyAllProductsandProductdetailPage {
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
    public void VerifyProducts(){
        Register_Page_Object product1 = new Register_Page_Object(driver);
        Products_Page_Object product2 = new Products_Page_Object(driver);

        product1.HomeVerify1();
        product2.ClickProductsBtn();
        product2.AllProductsPageVerify1();
        product2.ClickOnViewDetailsBtn();
        product2.ViewDetailsPageVerify2();
        product2.ProductNameVerify3();

        product2.CategoryVerify4();
        product2.PriceVerify5();
        product2.AvailabilityVerify6();
        product2.ConditionVerify7();
        product2.BrandVerify8();
    }
}
