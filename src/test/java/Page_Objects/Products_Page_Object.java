package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class Products_Page_Object {

    WebDriver driver;
    public Products_Page_Object(WebDriver drivetest){
        this.driver = drivetest;
    }

    private By ProductBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    private By AllProductPageVerify = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    private By ViewDetailsBtn = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
    private By ViewDetailsPage = By.xpath("/html/body/section/div/div/div[1]/div/h2");
    private By ProductNameVerify =By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
    private By CategoryVerify = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]");
    private By PriceVerify = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span");
    private By AvailabiltyVerify = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b");
    private By ConditionVerify =By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b");
    private By BrandVerify = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b");


    public void ClickProductsBtn(){
        driver.findElement(ProductBtn).click();
    }
    public void AllProductsPageVerify1(){
        String actualResults1 = driver.findElement(AllProductPageVerify).getText();
        Assert.assertEquals(actualResults1,"ALL PRODUCTS");
    }
    public void ClickOnViewDetailsBtn(){
        driver.findElement(ViewDetailsBtn).click();
    }
    public void ViewDetailsPageVerify2(){
        String actualResults2 = driver.findElement(ViewDetailsPage).getText();
        Assert.assertEquals(actualResults2,"CATEGORY");
    }
    public void ProductNameVerify3(){
        Boolean productname = driver.findElement(ProductNameVerify).isDisplayed();
        Assert.assertTrue(productname);
    }
    public void CategoryVerify4(){
        Boolean categoryname = driver.findElement(CategoryVerify).isDisplayed();
        Assert.assertTrue(categoryname);
    }
    public void PriceVerify5(){
        Boolean pricename = driver.findElement(PriceVerify).isDisplayed();
        Assert.assertTrue(pricename);
    }
    public void AvailabilityVerify6(){
        Boolean available = driver.findElement(AvailabiltyVerify).isDisplayed();
        Assert.assertTrue(available);
    }
    public void ConditionVerify7(){
        Boolean condition = driver.findElement(ConditionVerify).isDisplayed();
        Assert.assertTrue(condition);
    }
    public void BrandVerify8(){
        Boolean brand = driver.findElement(BrandVerify).isDisplayed();
        Assert.assertTrue(brand);
    }


    /// Search Products
    private By ProductNameField = By.xpath("//*[@id=\"search_product\"]");
    private By SearchBtn = By.xpath("//*[@id=\"submit_search\"]");
    private By SearchedProductsPageVerify = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    private By BrandProductVisibleVerify =By.xpath("/html/body/section[2]/div/div/div[1]/div/div[3]");

    public void EnterProductName(String productname){
        driver.findElement(ProductNameField).sendKeys(productname);
    }

    public void ClickOnSearchBtn(){
        driver.findElement(SearchBtn).click();
    }
    public void SearchProductPageVerify9(){
        String actualResults9 = driver.findElement(SearchedProductsPageVerify).getText();
        Assert.assertEquals(actualResults9,"SEARCHED PRODUCTS");
    }
    public void BrandProductVisibleVeify10(){
        Boolean brandproduct = driver.findElement(BrandProductVisibleVerify).isDisplayed();
        Assert.assertTrue(brandproduct);
    }

    ///  Increase Quantity of Product

    private By IncreaseQuantity = By.xpath("//*[@id=\"quantity\"]");
    private By AddtoCart = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    private By ViewCartBtn2 = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");
    private By VerifyQuantity = By.xpath("//*[@id=\"product-3\"]/td[4]/button");
    public void IncreaseQuantityOfProduct(String number){
        driver.findElement(IncreaseQuantity).clear();
        driver.findElement(IncreaseQuantity).sendKeys(number);
    }
    public void ClickOnAddtoCartBtn() throws InterruptedException {
        driver.findElement(AddtoCart).click();
        sleep(1000);
    }
    public void ClickOnViewCartBtn2(){
        driver.findElement(ViewCartBtn2).click();
    }
    public void VerifyQuantityEnter(){
        String quantity = driver.findElement(VerifyQuantity).getText();
        Assert.assertEquals(quantity,"4");
    }



    ///////////   View & Cart Brand Products

    private By BrandDisplayedVerify = By.xpath("/html/body/section[2]/div/div/div[1]/div/div[3]");
    private By BrandNameClick1 = By.xpath("/html/body/section[2]/div/div/div[1]/div/div[3]/div/ul/li[2]/a");
    private By BrandPageVerify = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    private By BrandProducts = By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]");
    private By BrandNameClick2= By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/div/ul/li[3]/a");

    public void BrandDisplayedVerify(){
        Boolean branddisplayed = driver.findElement(BrandDisplayedVerify).isDisplayed();
        Assert.assertTrue(branddisplayed);
    }
    public void BrandNameClick1() {
        driver.findElement(BrandNameClick1).click();
    }

    public void BrandPageVerify(){
        Boolean brandname = driver.findElement(BrandPageVerify).isDisplayed();
        Assert.assertTrue(brandname);
    }
    public void BrandProductVerify(){
        Boolean brandproduct = driver.findElement(BrandProducts).isDisplayed();
        Assert.assertTrue(brandproduct);
    }
    public void BrandNameClick2(){
        driver.findElement(BrandNameClick2).click();
    }

    /// / Write Your Review
    private By WriteYourReviewVerify = By.xpath("/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a");
    private By NameField = By.xpath("//*[@id=\"name\"]");
    private By EmailField = By.xpath("//*[@id=\"email\"]");
    private By ReviewField = By.xpath("//*[@id=\"review\"]");
    private By SubmitReviewBtn = By.xpath("//*[@id=\"button-review\"]");
    private By ThankReviewVerify = By.xpath("//*[@id=\"review-section\"]/div/div/span");

    public void WriteYourReviewVerify(){
        String reviewverify = driver.findElement(WriteYourReviewVerify).getText();
        Assert.assertEquals(reviewverify,"WRITE YOUR REVIEW");
    }
    public void EnterName(String name){
        driver.findElement(NameField).sendKeys(name);
    }
    public void EnterEmail(String email){
        driver.findElement(EmailField).sendKeys(email);
    }
    public void EnterReview(String review){
        driver.findElement(ReviewField).sendKeys(review);
    }
    public void ClickOnSubmitReviewBtn(){
        driver.findElement(SubmitReviewBtn).click();
    }
    public void ThankReviewVerify(){
        String thankreview = driver.findElement(ThankReviewVerify).getText();
        Assert.assertEquals(thankreview,"Thank you for your review.");
    }
}
