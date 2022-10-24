package com.seleniumHW.pagesGitHub;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;

public class EnterprisePageGitHub {

    private static final SelenideElement gitHubHeader = $("h1");

    public EnterprisePageGitHub checkHeaderText(String name) {
        gitHubHeader.shouldHave(text(name));
        return this;
    }
}
