package com.testsigma.sdk;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@RequiredArgsConstructor
@Data
public class UIIdentifier {
  private final String value;
  private final By by;
  private WebElement element;
}
