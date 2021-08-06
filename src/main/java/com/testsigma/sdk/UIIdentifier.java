package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RequiredArgsConstructor
@Data
public class UIIdentifier {
    private final String value;
    private final By by;
    private WebElement element;
    private WebDriver driver;

    public void findElement() {
        this.element = driver.findElement(by);
    }

    public WebElement getElement() {
        if(element == null) {
            findElement();
        }
        return element;
    }
}
