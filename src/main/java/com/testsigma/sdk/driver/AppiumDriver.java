package com.testsigma.sdk.driver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;

import java.net.URL;

public class AppiumDriver extends io.appium.java_client.AppiumDriver {
  public AppiumDriver(URL remoteAddress, Capabilities desiredCapabilities) {
    super(remoteAddress, desiredCapabilities);
  }
}
