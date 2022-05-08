package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OekPage extends Page {
    public SelenideElement
            accountNumberField = $x("//input[@name='accountNumber']"),
            forwardBtn = $x("//button[text()='Далее']"),
            lastNameField = $x(".//input[contains(@class,'lastName tt-input')]"),
            firstNameField = $x(".//input[contains(@class,'firstName tt-input')]"),
            patronymicField = $x(".//input[contains(@class,'patronymic tt-input')]"),
            energyAmount = $x(".//input[contains(@class,'energy')]"),
            hotWaterAmount = $x(".//input[contains(@class,'hotWater')]"),
            amountFields = $x(".//input[contains(@class,'amountField')]"),
            heatingAmount = $x(".//input[contains(@class,'heating')]"),
            goToPayBtn = $x(".//button[contains(@class,'go-to-pay')]"),
            saveEditBtn = $x(".//button[contains(@class,'save')]"),
            formControlAmountField = $x("//label[starts-with(text(),'Вид платежа и сумма')]/..//input[@class='form-control amountField ']");


    public void pasteData(String account, String amount) {
        type(accountNumberField, account);
        forwardBtn.click();
        type(energyAmount, amount);
        type(hotWaterAmount, amount);
        type(heatingAmount, amount);
        goToPayBtn.click();
    }

    public void pasteData(String account, String lastName, String firstName, String patronymic, String amount) {
        type(accountNumberField, account);
        forwardBtn.click();
        type(lastNameField, lastName);
        type(firstNameField, firstName);
        type(patronymicField, patronymic);
        type(formControlAmountField, amount);
        goToPayBtn.click();
    }

    public void pasteData(String lastName, String firstName, String patronymic) {
        type(lastNameField, lastName);
        type(firstNameField, firstName);
        type(patronymicField, patronymic);
    }

    public String getFirstName(){
        return firstNameField.getAttribute("value");
    }
    public String getLastName(){
        return lastNameField.getAttribute("value");
    }
    public String getPatronymic(){
        return patronymicField.getAttribute("value");
    }

}