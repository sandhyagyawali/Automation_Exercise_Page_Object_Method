import Page_Objects.Cart_Page_Object;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class AddtocartfromRecommendeditems {
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
    public void AddToCartfromRecommendation() throws InterruptedException {
        WebElement scrollFooter = driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/div[2]/h2"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollFooter);
        sleep(1000);

        WebElement Recommendation = driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/div[2]/h2"));
        String recommendationitems = Recommendation.getText();
        Assert.assertEquals(recommendationitems ,"RECOMMENDED ITEMS");

        WebElement recommendationAddtoCart = driver.findElement(By.xpath("//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a"));
        recommendationAddtoCart.click();
        sleep(1000);

        WebElement ViewCartBtn = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u"));
        ViewCartBtn.click();

        WebElement ProductDisplayVerify = driver.findElement(By.xpath("//*[@id=\"product-4\"]"));
        Boolean productdisplay = ProductDisplayVerify.isDisplayed();
        Assert.assertTrue(productdisplay);
    }
}
