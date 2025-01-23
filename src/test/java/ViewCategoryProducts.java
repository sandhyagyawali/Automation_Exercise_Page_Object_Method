import Page_Objects.Category_Page_Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ViewCategoryProducts {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","src/test/chromeDriver/chromedriver.exe");
        driver.manage().window().maximize();

        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void ViewCategory() throws InterruptedException {
        Category_Page_Object category = new Category_Page_Object(driver);

        category.VerifyCategoryInLeft();
        category.ClickWomenCategory();
        category.ClickOnDressCategory();
        category.CategoryPageVerify2();
        category.ClickMaleCateogory();
        category.ClickOnTshirtCategory();
        category.CategoryPageVerify3();
    }
}
