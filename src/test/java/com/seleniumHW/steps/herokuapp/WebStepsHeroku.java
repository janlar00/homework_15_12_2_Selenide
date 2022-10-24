package com.seleniumHW.steps.herokuapp;

import com.seleniumHW.pagesHeroku.MainPageHeroku;
import io.qameta.allure.Step;

public class WebStepsHeroku {

    MainPageHeroku mainPage = new MainPageHeroku();

    @Step("Открываем страницу с Drag&Drop")
    public void openMainPage() {
        mainPage.openPage();
    }

    @Step("Проверяем текст перед Drag&Drop")
    public void checkTextBeforeDragAndDrop() {
        mainPage.checkElementsText("A", "B");
    }

    @Step("Выполняем Drag&Drop")
    public void performDragAndDrop() {
        mainPage.performDragAndDrop();
    }

    @Step("Проверяем текст после Drag&Drop")
    public void checkTextAfterDragAndDrop() {
        mainPage.checkElementsText("B", "A");
    }
}
