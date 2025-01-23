package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SubscriptionFooter_POM {

    WebDriver driver;

    public SubscriptionFooter_POM(WebDriver drivertest){
        this.driver = drivertest;
    }

    private By SubscriptionVerify = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2");
    private By EmailAddressField = By.xpath("//*[@id=\"susbscribe_email\"]");
    private By ClickArrowBtn = By.xpath("//*[@id=\"subscribe\"]");
    private By Alert = By.id("success-subscribe");

    public void SubscriptionVerify1(){
        String actualresult1 = driver.findElement(SubscriptionVerify).getText();
        Assert.assertEquals(actualresult1,"SUBSCRIPTION");
    }
    public void EnterEmailAddress(String email){
        driver.findElement(EmailAddressField).sendKeys(email);
    }
    public void ClickOnArrowBtn(){
        driver.findElement(ClickArrowBtn).click();
    }
    public void AlertMsg(){
        String alertMessage = driver.findElement(Alert).getText();
        Assert.assertEquals(alertMessage,"You have been successfully subscribed!");
    }
}
