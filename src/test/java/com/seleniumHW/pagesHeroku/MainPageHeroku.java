package com.seleniumHW.pagesHeroku;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

public class MainPageHeroku {

    private static final SelenideElement Element1 = $("#column-a");
    private static final SelenideElement Element2 = $("#column-b");

    public MainPageHeroku openPage() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        return this;
    }

    public MainPageHeroku checkElementsText(String a, String b) {
        Element1.shouldHave(text(a));
        Element2.shouldHave(text(b));
        return this;
    }

    public MainPageHeroku performDragAndDrop() {
        Element1.dragAndDropTo(Element2);
        return this;
    }

/*
    public MainPageHeroku searchInputSubmit() {
        searchInput.submit();
        return this;
    }*/
}

