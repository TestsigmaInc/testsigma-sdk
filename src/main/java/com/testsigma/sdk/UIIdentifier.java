package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

@RequiredArgsConstructor
@Data
public class UIIdentifier {
    private final String value;
    private final By by;
    private WebElement element;
    private WebDriver webDriver;
    public void findElement() {
        this.element = webDriver.findElement(by);
    }
    public WebElement getElement() {
        if(element == null) {
            findElement();
        }
        return element;
    }
}
