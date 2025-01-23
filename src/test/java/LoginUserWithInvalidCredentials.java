import Page_Objects.LoginUser_Project_Object;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.WebElement;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.annotations.Test;
import  org.testng.annotations.BeforeClass;
import  org.testng.annotations.AfterClass;

public class LoginUserWithInvalidCredentials {

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
    public void InvalidLogIn(){
        LoginUser_Project_Object invalidlogin = new LoginUser_Project_Object(driver);

        invalidlogin.HomeVerify1();

        invalidlogin.ClickOnSignLoginBtn();

        invalidlogin.EnterEmail("preksha3@gmail.com");

        invalidlogin.EnterPassword("preksha");

        invalidlogin.ClickLoginBtn();

        invalidlogin.InvalidUserVerify4();
    }
}
