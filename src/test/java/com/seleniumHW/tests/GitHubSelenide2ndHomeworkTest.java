package com.seleniumHW.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.seleniumHW.BaseTest;
import com.seleniumHW.steps.gitHub.WebStepsGitHub;
import com.seleniumHW.steps.herokuapp.WebStepsHeroku;

public class GitHubSelenide2ndHomeworkTest extends BaseTest {
    private static final String GITHUBMOTTO = "Build like the best";
    WebStepsGitHub stepsGitHub = new WebStepsGitHub();
    WebStepsHeroku stepsHeroku = new WebStepsHeroku();

    @Test
    @DisplayName("Text \"Build like the best\" is shown on the enterprise page as header")
    public void checkHeaderEnterprisePage() {
        stepsGitHub.openMainPage();
        stepsGitHub.hoverOnSolutionAndCLickOnEnterprise();
        stepsGitHub.checkGitHubMotto(GITHUBMOTTO);
    }

    @Test
    @DisplayName("Drag&Drop test on the-internet.herokuapp.com")
    public void checkDragAndDropOnHeroku() {
        stepsHeroku.openMainPage();
        stepsHeroku.checkTextBeforeDragAndDrop();
        stepsHeroku.performDragAndDrop();
        stepsHeroku.checkTextAfterDragAndDrop();
    }


}
