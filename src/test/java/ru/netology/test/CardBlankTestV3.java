package ru.netology.test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardBlankTestV3 {

    @Test
    void invalidNamePhone() {
        open("http://localhost:9999/");
        $("[data-test-id=name] input").setValue("Ёж Валентина");
        $("[data-test-id=phone] input").setValue("+79227961604");
        $("[data-test-id=agreement]").click();
        $("button[type=button]").click();
        $("[data-test-id=phone] span[class=input__sub]").shouldHave(exactText("Имя и Фамилия указаны неверно. Допустимы только русские буквы, пробелы и дефисы."));
    }
}