package com.seleniumHW.pagesGitHub;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

public class MainPageGitHub {

    private static final SelenideElement SolutionButtonElement = $(byTagAndText("button", "Solutions"));
    private static final SelenideElement EnterpriseItemInSolution = $(byTagAndText("a", "Enterprise"));

    public MainPageGitHub openPage() {
        open("https://github.com/");
        return this;
    }

    public MainPageGitHub solutionsElementHover() {
        SolutionButtonElement.hover();
        return this;
    }

   public MainPageGitHub enterpriseItemClick() {
        EnterpriseItemInSolution.click();
        return this;
    }
/*
    public MainPage searchInputSubmit() {
        searchInput.submit();
        return this;
    }*/
}
