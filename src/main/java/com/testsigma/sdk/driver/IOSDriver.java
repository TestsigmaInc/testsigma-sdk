package com.testsigma.sdk.driver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;

import java.net.URL;

public class IOSDriver extends io.appium.java_client.ios.IOSDriver {
  public IOSDriver(URL remoteAddress, Capabilities desiredCapabilities) {
    super(remoteAddress, desiredCapabilities);
  }
}
