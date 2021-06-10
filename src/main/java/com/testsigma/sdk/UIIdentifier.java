package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

@RequiredArgsConstructor
@Data
public class UIIdentifier {
    private final String value;
    private final By by;
    private WebElement element;

    public void findElement(RemoteWebDriver driver) {
        this.element = driver.findElement(by);
    }
    public WebElement getElement(RemoteWebDriver driver) {
        if(element == null) {
            findElement(driver);
        }
        return element;
    }
}
