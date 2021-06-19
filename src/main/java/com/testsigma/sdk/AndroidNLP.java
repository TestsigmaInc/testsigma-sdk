package com.testsigma.sdk;

import com.testsigma.sdk.driver.RemoteWebDriver;
import lombok.Setter;

public abstract class AndroidNLP extends DriverNLP {
  @Setter
  protected RemoteWebDriver driver;
}
