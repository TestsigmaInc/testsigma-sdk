package com.testsigma.sdk;

import lombok.Setter;
import org.openqa.selenium.WebDriver;

public abstract class DriverNLP extends NLP {
  @Setter
  private WebDriver driver;
}
