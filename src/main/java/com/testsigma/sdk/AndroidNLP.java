package com.testsigma.sdk;

import com.testsigma.sdk.driver.AndroidDriver;
import lombok.Setter;

public abstract class AndroidNLP extends DriverNLP {
  @Setter
  protected AndroidDriver driver;
}
