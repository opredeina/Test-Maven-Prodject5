import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Registration {

  @Test
  void shouldFillSelenideRegistration() {
    //открыть страницу
    open("https://demoqa.com/automation-practice-form/");
    //ввести имя
    $("[id='firstName']").setValue("Olesya");
    //ввести фамилию
    $("[id='lastName']").setValue("Predeina");
    //ввести почту
    $("[id='userEmail']").setValue("OVpredeina@yandex.ru");
    //заполнить чек-бокс
    $(byAttribute("for", "gender-radio-2")).click();
    //ввести номер телефона
    $("[id='userNumber']").setValue("9630069504");
    //ввести адрес
    $("[id='currentAddress']").setValue("Галкино");
    //кликнуть по кнопке
    $("[type='submit']").click();
    //проверка: во всплывающем окне есть текст Thanks for submitting the form
    $(".modal-header").shouldHave(text("Thanks for submitting the form"));

  }
}
