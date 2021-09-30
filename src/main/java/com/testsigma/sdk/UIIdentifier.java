package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RequiredArgsConstructor
@Data
public class UIIdentifier {
    private final String value;
    private final By by;
    private WebElement element;
    private WebDriver driver;

    public void findElement() throws NoSuchElementException {
        try{
            this.element = driver.findElement(by);
        } catch(NoSuchElementException ex){
            throw new NoSuchElementException(String.format("Element could not be found using the given criteria - <b>\"%s:%s\"</b>", this.by, this.value));
        }
    }

    public WebElement getElement() {
        if(element == null) {
            findElement();
        }
        return element;
    }
}
