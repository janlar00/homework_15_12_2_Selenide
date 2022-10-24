package com.seleniumHW;

import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;

public class BaseTest {
    @BeforeAll
    static void setUp() {
        //Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        //Configuration.holdBrowserOpen = true;
    }
}