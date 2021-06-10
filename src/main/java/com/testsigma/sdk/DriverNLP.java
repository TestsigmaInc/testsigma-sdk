package com.testsigma.sdk;

import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class DriverNLP extends NLP {
  @Setter
  protected RemoteWebDriver driver;

  public WebElement getElement(UIIdentifier uiIdentifier) {
    return uiIdentifier.getElement(driver);
  }
}
