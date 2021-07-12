package com.testsigma.sdk;

import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class DriverNLP extends NLP {
  @Setter
  protected WebDriver driver;
  public WebElement getElement(UIIdentifier uiIdentifier) {
    return uiIdentifier.getElement();
  }
}
