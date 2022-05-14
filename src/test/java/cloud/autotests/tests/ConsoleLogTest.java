package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class ConsoleLogTest extends TestBase {
   
    @Test
    @DisplayName("Console страницы разработчика не должен содержать ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://vp.ru/'", () ->
            open("https://vp.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
