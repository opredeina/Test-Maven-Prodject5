import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelenideWebTest {

  @Test
  void shouldFindSelenideWebTest() {

    //открыть главную страницу
    open("https://demoqa.com/");
    //кликнуть по банеру
    $("div.home-banner").$("a").click();
    // проверка
    $(".col-auto").shouldHave(text("Home"));

  }

  @Test
  void shouldFindSelenideWebTestTwo() {
    //открыть страницу
    open("https://www.toolsqa.com/selenium-training/");
    //кликнуть по кнопке
    $("a.navbar__tutorial-menu").click();
    //проверка видимости элемента
    $(".first-generation").shouldBe(visible);

  }

  @Test
  void shouldFindSelenideWebTestThree() {
    ////открыть страницу
    open("https://www.toolsqa.com/selenium-training/");
    //клик по тексту
    $(byAttribute("href", "/about")).click();
    //проверка: есть текст Lakshay Sharma
    $(".card").shouldHave(text("Lakshay Sharma"));

  }

  @Test
  void shouldFindSelenideWebTestFour() {
    //открыть страницу
    open("https://www.toolsqa.com/about");
    //возврат на предыдущую страницу
    open("https://demoqa.com/");
    //проверка видимости элемента
    $(".home-banner").shouldBe(visible);

  }
}
