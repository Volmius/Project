package cloud.autotests.pages;

import static com.codeborne.selenide.Selenide.$x;

public class ShoppingCartPage extends Page {
//
//    @FindBy(id = "vp-shopping-cart")
//    private WebElement shopingCart;
//
//    @FindBy(className = "cart-item-status-checkbox")
//    private WebElement checkboxPayment;
//
//    @FindBy(css = "[data-source-type=\"BONUS\"]")
//    private WebElement btnBonusToPay;
//
//    //    @FindBy(className = "pay-cart")
//    @FindBy(xpath = ".//a[contains(@class,\"pay-cart\")]")
//    private WebElement goToPay;
//
//    @FindBy(className = "modal-inform-head")
//    private WebElement warningPayment;
//
//    @FindBy(className = "modal-inform-body")
//    public WebElement warningMessage;

    private String deletePaymentBtn = ".//div[contains(@class,'item-title')]" +
            "//text()[contains(.,'%s')]/..//i[contains(@class,'icon-delete')]";

    private String btnEditPayment = ".//li[contains(.,'%s')]//a[@id='edit-payment']";

//    @FindBy(className = "item-title")
//    private WebElement titlePayment;
//
//    @FindBy(className = "btn-confirm")
//    private WebElement btnConfirm;


//    public void goToPayByCard() {
//        goToPay.click();
//    }

//    public boolean checkWarning() {
//        try {
//            (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(warningPayment));
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public void deletePayment(String name) {
//        driver.findElement(By.xpath(String.format(deletePaymentBtn, name))).click();
//        btnConfirm.click();
//    }

    public void clickEditPayment(String name) {
        $x(String.format(btnEditPayment,name)).click();
    }
}
