package cloud.autotests.pages;//package cloud.autotests.pages;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class LoginPage extends Page {
//    @FindBy(name = "phone_login")
//    private WebElement phoneLoginField;
//
//    @FindBy(id = "sub")
//    private WebElement btnToPass;
//
//    //    @FindBy(id = "j_password")
//    @FindBy(id = "password")
//    private WebElement passwordField;
//
//    @FindBy(id = "user-auth-phone-by-password-button")
//    private WebElement btnLogin;
//
//    @FindBy(xpath = ".//div[contains(@class,\"modal-auth \")]")
//    private WebElement fade;
//
//    @Override
//    public void open() {
//        driver.get(ConfigProperties.getProperty("urlAuth"));
//    }
//
//    private void init() {
//        PageFactory.initElements(driver, this);
//    }
//
//    public LoginPage(WebDriver driver) {
//        super(driver);
//        init();
//    }
//
//    public void loginUser() {
//        while (!phoneLoginField.getAttribute("value").replaceAll("[^0-9]", "").
//                equals(ConfigProperties.getProperty("loginPhone"))) {
//            type(phoneLoginField, ConfigProperties.getProperty("loginPhone"));
//        }
//        btnToPass.click();
//        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
//        type(passwordField, ConfigProperties.getProperty("password"));
//        btnLogin.click();
//        try {
//            Thread.sleep(1500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
