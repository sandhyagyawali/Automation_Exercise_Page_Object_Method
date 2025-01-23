package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCase_Page_Object {
    WebDriver driver;

    public TestCase_Page_Object (WebDriver drivertest){
        this.driver = drivertest;
    }

    private By TestCaseBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    private By TestCaseVerify = By.xpath("//*[@id=\"form\"]/div/div[1]/div/h2/b");

    public void ClickTestCaseBtn(){
        driver.findElement(TestCaseBtn).click();
    }
    public void TestCaseVerify(){
        String actualResult = driver.findElement(TestCaseVerify).getText();
        Assert.assertEquals(actualResult, "TEST CASES");
    }
}
