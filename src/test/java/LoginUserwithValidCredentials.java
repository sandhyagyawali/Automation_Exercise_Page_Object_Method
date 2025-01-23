import Page_Objects.LoginUser_Project_Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.WebElement;
import  org.openqa.selenium.chrome.ChromeDriver;

import  org.testng.annotations.Test;
import  org.testng.annotations.BeforeClass;
import  org.testng.annotations.AfterClass;

public class LoginUserwithValidCredentials {
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
    public void Login(){

        LoginUser_Project_Object login = new LoginUser_Project_Object(driver);

        login.HomeVerify1();

        login.ClickOnSignLoginBtn();

        login.LoginPageVerify2();

        login.EnterEmail("preksha34@gmail.com");

        login.EnterPassword("preksha34");

        login.ClickLoginBtn();

        login.UserNameVerify3();

        login.ClickLogoutBtn();

         login.LoginPageVerify2();
    }
}
