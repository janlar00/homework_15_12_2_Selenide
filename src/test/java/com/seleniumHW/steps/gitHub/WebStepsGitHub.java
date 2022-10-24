package com.seleniumHW.steps.gitHub;

import com.codeborne.selenide.WebDriverRunner;
import com.seleniumHW.pagesGitHub.EnterprisePageGitHub;
import com.seleniumHW.pagesGitHub.MainPageGitHub;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

public class WebStepsGitHub {
    MainPageGitHub mainPage = new MainPageGitHub();
    EnterprisePageGitHub enterprisePage = new EnterprisePageGitHub();

    @Step("Открываем главную страницу")
    public void openMainPage() {
        mainPage.openPage();
    }

    @Step("Наводим на drop-down Solutions и кликаем на Enterprise внутри")
    public void hoverOnSolutionAndCLickOnEnterprise() {
        mainPage.solutionsElementHover().enterpriseItemClick();
    }

    @Step("Проверяем текст на странице Enterprise")
    public void checkGitHubMotto(String gitHubMotto) {
        enterprisePage.checkHeaderText(gitHubMotto);
    }

    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot)WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }

}
