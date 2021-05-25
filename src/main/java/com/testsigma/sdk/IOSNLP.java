package com.testsigma.sdk;


import com.testsigma.sdk.driver.IOSDriver;
import lombok.Setter;

public abstract class IOSNLP extends DriverNLP {
  @Setter
  protected IOSDriver driver;
}
