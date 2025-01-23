import Page_Objects.Register_Page_Object;
import Page_Objects.TestCase_Page_Object;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.annotations.Test;
import  org.testng.annotations.BeforeClass;
import  org.testng.annotations.AfterClass;

public class TestCasesPageVerify {
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
    public void TestCasesPage(){
        Register_Page_Object testcases1 = new Register_Page_Object(driver);
        TestCase_Page_Object testcases2 = new TestCase_Page_Object(driver);

        testcases1.HomeVerify1();
        testcases2.ClickTestCaseBtn();
        testcases2.TestCaseVerify();
    }
}
