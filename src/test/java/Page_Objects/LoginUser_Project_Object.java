package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginUser_Project_Object {

    WebDriver driver;

    public LoginUser_Project_Object(WebDriver drivertest){
        this.driver = drivertest;
    }

    private By Home = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    private By SignLoginBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    private By LoginPageVerify = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2");
    private By EmailField = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    private By PasswordField = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    private By LoginBtn = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    private By UserNameVerify = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
    private By LogoutBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

    private By InvalidUser = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p");

    public void HomeVerify1(){
        String actualResults1 = driver.findElement(Home).getText();
        Assert.assertEquals(actualResults1,"Home");
    }
    public  void ClickOnSignLoginBtn(){
        driver.findElement(SignLoginBtn).click();
    }

    public void LoginPageVerify2(){
        String actualResults2 = driver.findElement(LoginPageVerify).getText();
        Assert.assertEquals(actualResults2,"Login to your account");
    }
    public void EnterEmail(String email){
        driver.findElement(EmailField).sendKeys(email);
    }

    public  void EnterPassword(String password){
        driver.findElement(PasswordField).sendKeys((password));
    }
    public void ClickLoginBtn(){
        driver.findElement(LoginBtn).click();
    }
    public void UserNameVerify3(){
        String actualResults3 = driver.findElement(UserNameVerify).getText();
        Assert.assertEquals(actualResults3,"Logged in as Preksha Neupane");
    }
    public void ClickLogoutBtn(){
        driver.findElement(LogoutBtn).click();
    }

    public void InvalidUserVerify4(){
        String actualResults4 = driver.findElement(InvalidUser).getText();
        Assert.assertEquals(actualResults4,"Your email or password is incorrect!");
    }
}
