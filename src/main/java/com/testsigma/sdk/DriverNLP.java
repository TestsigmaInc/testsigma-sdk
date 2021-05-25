package com.testsigma.sdk;

import com.testsigma.sdk.driver.RemoteWebDriver;
import lombok.Setter;

public abstract class DriverNLP extends NLP {
  @Setter
  protected RemoteWebDriver driver;
}
