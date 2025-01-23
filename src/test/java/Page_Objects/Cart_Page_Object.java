package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class Cart_Page_Object {
    WebDriver driver;

    public Cart_Page_Object(WebDriver driver){
        this.driver = driver;
    }


    private By Home = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    private By CartBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");

    public void HomeVerify1(){
        String actualResults1 = driver.findElement(Home).getText();
        Assert.assertEquals(actualResults1,"Home");
    }

    public void  ClickOnCartBtn(){
        driver.findElement(CartBtn).click();
    }

    /// Test Case 12 : Add Products in Cart
    private By AddtoCartBtn = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a");
    private By AddtoCartBtn2 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a");
    private By ContinueShoppingBtn = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
    private By ViewCartBtn = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");
    private By FirstProductVerify = By.xpath("//*[@id=\"product-1\"]");
    private By SecondProductVerify = By.xpath("//*[@id=\"product-2\"]");
    private By ThirdProductVerify = By.xpath("//*[@id=\"product-3\"]");
    private By FourthProductVerify = By.xpath("//*[@id=\"product-4\"]");

    public void ClickOnAddToCartBtn() throws InterruptedException {
        driver.findElement(AddtoCartBtn).click();
        sleep(1000);
    }
    public void ClickOnContinueShoppingBtn(){
        driver.findElement(ContinueShoppingBtn).click();
    }
    public void ClickOnAddToCartBtn2() throws InterruptedException {
        driver.findElement(AddtoCartBtn2).click();
        sleep(1000);
    }
    public void ClickOnViewCartBtn(){
        driver.findElement(ViewCartBtn).click();
    }

    public void FirstProductverify(){
        Boolean firstproduct = driver.findElement(FirstProductVerify).isDisplayed();
        Assert.assertTrue(firstproduct);
    }
    public void SecondProductVerify(){
        Boolean secondproduct = driver.findElement(SecondProductVerify).isDisplayed();
        Assert.assertTrue(secondproduct);
    }

    public void ThirdProductverify(){
        Boolean thirdproduct = driver.findElement(ThirdProductVerify).isDisplayed();
        Assert.assertTrue(thirdproduct);
    }
    public void FourthProductVerify(){
        Boolean fourthproduct = driver.findElement(FourthProductVerify).isDisplayed();
        Assert.assertTrue(fourthproduct);
    }


    ///// TestCase 13: Verify Product Quantity In Cart

    private By ViewProductBtn = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[4]/div/div[2]/ul/li/a");

    public void ClickOnViewProductBtn(){
        driver.findElement(ViewProductBtn).click();
    }

    /// // Test Case 14: Place Order: Register while Checkout
    private By CartPageverify = By.xpath("//*[@id=\"cart_items\"]/div/div[1]/ol/li[2]");
    private By CheckoutBtn = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");
    private By RegisterLoginBtn = By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u");
    private By AddressDetails = By.xpath("//*[@id=\"cart_items\"]/div/div[2]/h2");
    private By ReviewOrder = By.xpath("//*[@id=\"cart_items\"]/div/div[4]/h2");
    private By DescriptionBox = By.xpath("//*[@id=\"ordermsg\"]/textarea");
    private By PlaceOrderBtn = By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a");


    public void CartPageVerify(){
        String actualResultcart = driver.findElement(CartPageverify).getText();
        Assert.assertEquals(actualResultcart,"Shopping Cart");
    }
    public void CheckoutBtn() throws InterruptedException {
        driver.findElement(CheckoutBtn).click();
        sleep(1000);
    }
    public void ClickOnRegisterLoginBtn(){
        driver.findElement(RegisterLoginBtn).click();
    }
    public void VerifyAddressDetails(){
        String actualverify = driver.findElement(AddressDetails).getText();
        Assert.assertEquals(actualverify,"Address Details");
    }
    public void VerifyReviewOrder(){
        String actualorder = driver.findElement(ReviewOrder).getText();
        Assert.assertEquals(actualorder,"Review Your Order");
    }
    public void AddDescription(String msg){
        driver.findElement(DescriptionBox).sendKeys(msg);
    }
    public void ClickOnPlaceOrderBtn(){
        driver.findElement(PlaceOrderBtn).click();
    }

        ///// Payment Details
    private By Enternameoncard = By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input");
    private By EnterCardNumber = By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input");
    private By EnteCVC = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input");
    private By EnterExpirationMM = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input");
    private By EnterExpirationYYYY = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input");
    private By PayandConfirmOrderBtn = By.xpath("//*[@id=\"submit\"]");
    private By SuccessOrderMsg = By.xpath("//*[@id=\"form\"]/div/div/div/p");

    public void NameonCardField(String name){
        driver.findElement(Enternameoncard).sendKeys(name);
    }
    public void CardNumberField(String cardno){
        driver.findElement(EnterCardNumber).sendKeys(cardno);
    }
    public void CVCField(String cvc){
        driver.findElement(EnteCVC).sendKeys(cvc);
    }
    public void ExpirationFieldMM(String mm){
        driver.findElement(EnterExpirationMM).sendKeys(mm);
    }
    public void ExpirationFieldYY(String yy){
        driver.findElement(EnterExpirationYYYY).sendKeys(yy);
    }
    public void ClickOnPayandConfirmBtn(){
        driver.findElement(PayandConfirmOrderBtn).click();
    }
    public void VerifySuccessOrderMsg(){
        String sucessmsg = driver.findElement(SuccessOrderMsg).getText();
        Assert.assertEquals(sucessmsg,"Congratulations! Your order has been confirmed!");
    }

    //// Remove products from Cart
    private By Xbutton = By.xpath("//*[@id=\"product-1\"]/td[6]/a");
    private By ProductRemoveVerify = By.xpath("//*[@id=\"empty_cart\"]/p/b");

    public  void ClickOnXbutton() throws InterruptedException {
        driver.findElement(Xbutton).click();
        sleep(1000);
    }
    public void ProductRemoveVerify(){
        String empty = driver.findElement(ProductRemoveVerify).getText();
        Assert.assertEquals(empty,"Cart is empty!");
    }


    /// / Dowload Invoice

    private By DowloadBtn = By.xpath("//*[@id=\"form\"]/div/div/div/a");

    public void ClickOnDowloadBtn(){
        driver.findElement(DowloadBtn).click();
    }

}
