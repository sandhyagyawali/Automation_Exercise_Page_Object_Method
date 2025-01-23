package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;

public class Contact_Project_Object {
    WebDriver driver;
    public Contact_Project_Object (WebDriver drivertest){
        this.driver = drivertest;
    }
    private By Home = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    private By ContactBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
    private By ContactPageVerify = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2");
    private By NameField =By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input");
    private By EmailField =By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input");
    private By SubjectField = By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
    private By MsgField = By.xpath("//*[@id=\"message\"]");
    private By UploadFileField =By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input");
    private By SubmitBtn = By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");
    private By SuccessMsgVerify = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");
    private By HomeBtn = By.xpath("//*[@id=\"form-section\"]/a");
    public void HomeVerify1(){
        String actualResults1 = driver.findElement(Home).getText();
        Assert.assertEquals(actualResults1,"Home");
    }
    public  void ClickOnContactBtn(){
        driver.findElement(ContactBtn).click();
    }

    public void ContactPageVerify2(){
        String actualResults2 = driver.findElement(ContactPageVerify).getText();
        Assert.assertEquals(actualResults2,"GET IN TOUCH");
    }
    public void EnterName(String name){
        driver.findElement(NameField).sendKeys(name);
    }

    public void EnterEmail(String email){
        driver.findElement(EmailField).sendKeys(email);
    }
    public void EnterSubject(String subject){
        driver.findElement(SubjectField).sendKeys(subject);
    }

    public void EnterMessage(String msg){
        driver.findElement(MsgField).sendKeys(msg);
    }
    public void UploadFile(){
        File uploadFile = new File("src/test/files/thermodynamics.pdf");
        driver.findElement(UploadFileField).sendKeys(uploadFile.getAbsolutePath());
    }
    public void SubmitBtn(){
        driver.findElement(SubmitBtn).click();
    }

    public void SuccesMsgVerify3(){
        String actualResults3 = driver.findElement(SuccessMsgVerify).getText();
        Assert.assertEquals(actualResults3,"Success! Your details have been submitted successfully.");
    }
    public void ClickHomeBtn(){
        driver.findElement(HomeBtn).click();
    }
}
