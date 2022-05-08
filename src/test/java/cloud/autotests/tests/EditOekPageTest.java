package cloud.autotests.tests;


import cloud.autotests.config.Project;
import cloud.autotests.pages.OekPage;
import cloud.autotests.pages.ShoppingCartPage;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

@Owner("Dmitriy Khristich")
@Epic("QA-1. Создание демонстрационных автотестов на примере поставщика Всеплатежи. Релиз 1")
@Feature("Добавление платежа в корзину")
@Story("QA-1.1. Актуализация тестовых сценариев при редактировании платежа из корзины")

public class EditOekPageTest extends TestBase{

//     @BeforeAll
//     static void configureBaseUrl() {
//         Configuration.baseUrl = Project.config.webUrl2();
//     }

    @Test
    @DisplayName("Проверка сохранения изменений при редактировании платежа из корзины")
    public void oekPayTest(){

        step("Открытие страницы поставщика", () ->{open(Project.config.webUrl2());});

        OekPage oekPage = new OekPage();

        step("Заполнение основных данных платежа и добавление его в корзину", () ->{
            oekPage.pasteData("85045360160", "К", "О",
                    "Т", "10.10");});

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

        step("Нажатие на кнопку Изменить", () ->{shoppingCartPage.clickEditPayment("ОЭК");});

        step("Изменение данных ФИО", () ->{oekPage.pasteData("С", "О", "Н");});

        step("Сохранение изменений", () ->{oekPage.saveEditBtn.click();});

        step("Добавление платежа в корзину", () ->{oekPage.goToPayBtn.click();});

        step("Нажатие на кнопку Изменить", () ->{shoppingCartPage.clickEditPayment("ОЭК");});

        step("Проверка, что после редактирования платежа FirstName равно ОО ", () -> {
            assertThat(oekPage.getFirstName()).isEqualTo("ОО");
        });

        step("Проверка, что после редактирования платежа LastName равно КС ", () -> {
            assertThat(oekPage.getLastName()).isEqualTo("КС");
        });

        step("Проверка, что после редактирования платежа Patronymic равно ТН ", () -> {
            assertThat(oekPage.getPatronymic()).isEqualTo("ТН");
        });

    }

}
