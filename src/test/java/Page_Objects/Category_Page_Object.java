package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class Category_Page_Object {

    WebDriver driver;
    public Category_Page_Object(WebDriver driver){
        this.driver = driver;
    }

    private By CategoryVerify1 = By.xpath("/html/body/section[2]/div/div/div[1]/div/h2");
    private By WomenCategoryBtn = By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a");
    private By DressBtn = By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a");
    private By CategoryPageVerify2 = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    private By MaleCategoryBtn = By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a");
    private By TshirtBtn = By.xpath("//*[@id=\"Men\"]/div/ul/li[1]/a");

    public void VerifyCategoryInLeft(){
        Boolean category = driver.findElement(CategoryVerify1).isDisplayed();
        Assert.assertTrue(category);
    }
    public void ClickWomenCategory() throws InterruptedException {
        driver.findElement(WomenCategoryBtn).click();
        sleep(1000);
    }
    public void ClickOnDressCategory(){
        driver.findElement(DressBtn).click();
    }
    public void CategoryPageVerify2(){
        Boolean categorypage = driver.findElement(CategoryPageVerify2).isDisplayed();
        Assert.assertTrue(categorypage);
        String confirmtext = driver.findElement(CategoryPageVerify2).getText();
        Assert.assertEquals(confirmtext,"WOMEN - DRESS PRODUCTS");
    }
    public void ClickMaleCateogory() throws InterruptedException {
        driver.findElement(MaleCategoryBtn).click();
        sleep(1000);
    }
    public void ClickOnTshirtCategory(){
        driver.findElement(TshirtBtn).click();
    }
    public void CategoryPageVerify3(){
        Boolean categorypage = driver.findElement(CategoryPageVerify2).isDisplayed();
        Assert.assertTrue(categorypage);
        String confirmtext = driver.findElement(CategoryPageVerify2).getText();
        Assert.assertEquals(confirmtext,"MEN - TSHIRTS PRODUCTS");
    }

}
