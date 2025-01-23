import Page_Objects.Contact_Project_Object;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.WebElement;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.annotations.Test;
import  org.testng.annotations.BeforeClass;
import  org.testng.annotations.AfterClass;

public class ContactUsForm {
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
    public void ContactUs(){
        Contact_Project_Object contact = new Contact_Project_Object(driver);

        contact.HomeVerify1();
        contact.ClickOnContactBtn();
        contact.EnterName("Preksha Neupane");
        contact.EnterEmail("preksha34@gmail.com");
        contact.EnterSubject("Project Management");
        contact.EnterMessage("Project management is the application of processes, methods, skills.");
        contact.UploadFile();
        contact.SubmitBtn();

        // Handle the popup message
        Alert alert = driver.switchTo().alert(); // Switch to the popup
        String alertMessage = alert.getText(); // Get the text from the popup
        System.out.println("Popup message: " + alertMessage); // Optional: Print the popup message
        alert.accept(); // Click OK on the popup

        contact.SuccesMsgVerify3();
        contact.ClickHomeBtn();
        contact.HomeVerify1();
    }
}
