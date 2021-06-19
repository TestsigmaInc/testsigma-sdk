package com.testsigma.sdk;


import com.testsigma.sdk.driver.RemoteWebDriver;
import lombok.Setter;

public abstract class IOSNLP extends DriverNLP {
  @Setter
  protected RemoteWebDriver driver;
}
