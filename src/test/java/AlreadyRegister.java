import Page_Objects.Register_Page_Object;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.annotations.Test;
import  org.testng.annotations.BeforeClass;
import  org.testng.annotations.AfterClass;

public class AlreadyRegister {

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
    public void RegisterUserAlreadyExist(){

        Register_Page_Object alreadyregister = new Register_Page_Object(driver);

        alreadyregister.HomeVerify1();
        alreadyregister.ClickOnSignLoginBtn();
        alreadyregister.EnterName("Preksha Neupane");
        alreadyregister.EnterEmail("preksha34@gmail.com");
        alreadyregister.ClickOnSignBtn();
        alreadyregister.RegisterAlreadyExistVerify7();
    }
}
