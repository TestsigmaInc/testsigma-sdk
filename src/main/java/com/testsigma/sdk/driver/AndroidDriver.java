package com.testsigma.sdk.driver;


import org.openqa.selenium.Capabilities;

import java.net.URL;

public class AndroidDriver extends io.appium.java_client.android.AndroidDriver {
  public AndroidDriver(URL remoteAddress, Capabilities desiredCapabilities) {
    super(remoteAddress, desiredCapabilities);
  }
}
