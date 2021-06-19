package com.testsigma.sdk;

import com.testsigma.sdk.driver.RemoteWebDriver;
import lombok.Setter;
import org.openqa.selenium.WebElement;

public abstract class DriverNLP extends NLP {
  @Setter
  protected RemoteWebDriver driver;

  public WebElement getElement(UIIdentifier uiIdentifier) {
    return uiIdentifier.getElement(driver.getDriver());
  }
}
