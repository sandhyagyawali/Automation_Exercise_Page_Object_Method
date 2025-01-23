package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Register_Page_Object {

    WebDriver driver;

    public Register_Page_Object(WebDriver drivertest){
        this.driver = drivertest;
    }

    private By Home = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    private By SignLoginBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    private By SignInPageVerify = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
    private By NameField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private By EmailField  = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    private By SignUpBtn = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
    private By DetailsVerify = By.xpath("//*[@id=\"form\"]/div/div/div/div/h2/b");
    private By TitleField  = By.xpath("//*[@id=\"id_gender2\"]");
    private By PasswordField  = By.xpath("//*[@id=\"password\"]");
    private By DaysField  = By.xpath("//*[@id=\"days\"]");
    private By MonthsField  = By.xpath("//*[@id=\"months\"]");
    private By YearField  = By.xpath("//*[@id=\"years\"]");
    private By NewsletterField = By.xpath("//*[@id=\"newsletter\"]");
    private By OffersField = By.xpath("//*[@id=\"optin\"]");
    private By FirstNameField  = By.xpath("//*[@id=\"first_name\"]");
    private By LastNameField  = By.xpath("//*[@id=\"last_name\"]");
    private By CompanyField  = By.xpath("//*[@id=\"company\"]");
    private By Address1Field  = By.xpath("//*[@id=\"address1\"]");
    private By Address2Field  = By.xpath("//*[@id=\"address2\"]");
    private By CountryField  = By.xpath("//*[@id=\"country\"]");
    private By StateField  = By.xpath("//*[@id=\"state\"]");
    private By CityField  = By.xpath("//*[@id=\"city\"]");
    private By ZipCodeField  = By.xpath("//*[@id=\"zipcode\"]");
    private By MobileNoField  = By.xpath("//*[@id=\"mobile_number\"]");
    private By CreateAccountField  = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button");
    private By AccountCreatedPageVerify = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    private By ContinueBtn1 = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
    private By UserNameVerify = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
    private By DeleteAccountBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    private By AccountDeletePageVerify =By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    private By ContineBtn2 = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");

    private By AlreadyRegisterMsgVerify = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");
    public void HomeVerify1(){
        String actualResults1 = driver.findElement(Home).getText();
        Assert.assertEquals(actualResults1,"Home");
    }
    public  void ClickOnSignLoginBtn(){
        driver.findElement(SignLoginBtn).click();
    }

    public void SignInPageVerify2(){
        String actualResults2 = driver.findElement(SignInPageVerify).getText();
        Assert.assertEquals(actualResults2,"New User Signup!");
    }
    public void EnterName(String name){
        driver.findElement(NameField).sendKeys(name);
    }

    public void EnterEmail(String email){
        driver.findElement(EmailField).sendKeys(email);
    }
    public  void ClickOnSignBtn(){
        driver.findElement(SignUpBtn).click();
    }
    public  void DetailsVerify3(){
        String actualResults3 = driver.findElement(DetailsVerify).getText();
        Assert.assertEquals(actualResults3,"ENTER ACCOUNT INFORMATION");
    }

    public void ClickOnTitle(){
        driver.findElement(TitleField).click();
    }
    public  void EnterPassword(String password){
        driver.findElement(PasswordField).sendKeys((password));
    }
    public  void EnterDays(String day){
        driver.findElement(DaysField).sendKeys((day));
    }
    public  void EnterMonths(String month){
        driver.findElement(MonthsField).sendKeys((month));
    }
    public  void EnterYears(String year){
        driver.findElement(YearField).sendKeys((year));
    }

    public void ClickOnNewsLetter(){
        driver.findElement(NewsletterField).click();
    }
    public void ClickOnOffers(){
        driver.findElement(OffersField).click();
    }

    public void EnterFirstName(String firstname){
        driver.findElement(FirstNameField).sendKeys(firstname);
    }

    public void EnterLastName(String lastname){
        driver.findElement(LastNameField).sendKeys(lastname);
    }

    public void EnterCompany(String company){
        driver.findElement(CompanyField).sendKeys(company);
    }

    public void EnterAddress1(String address1){
        driver.findElement(Address1Field).sendKeys(address1);
    }

    public void EnterAddress2(String address2){
        driver.findElement(Address2Field).sendKeys(address2);
    }

    public void EnterCountry(String country){
        driver.findElement(CountryField).sendKeys(country);
    }
    public void EnterState(String state){
        driver.findElement(StateField).sendKeys(state);
    }
    public void EnterCity(String city){
        driver.findElement(CityField).sendKeys(city);
    }
    public void EnterZipCode(String code){
        driver.findElement(ZipCodeField).sendKeys(code);
    }
    public void EnterMobileNo(String number){
        driver.findElement(MobileNoField).sendKeys(number);
    }
    public void ClickOnCreateAccountField(){
        driver.findElement(CreateAccountField).click();
    }
    public  void AccountCreatedPageVerify4(){
        String actualResults4 = driver.findElement(AccountCreatedPageVerify).getText();
        Assert.assertEquals(actualResults4,"ACCOUNT CREATED!");
    }
    public void ClickOnContinueBtn1(){
        driver.findElement(ContinueBtn1).click();
    }
    public void UserNameVerify5(){
        String actualResults5 = driver.findElement(UserNameVerify).getText();
        Assert.assertEquals(actualResults5,"Logged in as Sandhya Gyawali");
    }
    public void ClickOnDeleteBtn(){
        driver.findElement(DeleteAccountBtn).click();
    }
    public  void AccountDeletePageVerify6(){
        String actualResults6 = driver.findElement(AccountDeletePageVerify).getText();
        Assert.assertEquals(actualResults6,"ACCOUNT DELETED!");
    }
    public void ClickOnContinueBtn2(){
        driver.findElement(ContineBtn2).click();
    }
    public void RegisterAlreadyExistVerify7(){
        String actualResults7 = driver.findElement(AlreadyRegisterMsgVerify).getText();
        Assert.assertEquals(actualResults7,"Email Address already exist!");
    }

}
