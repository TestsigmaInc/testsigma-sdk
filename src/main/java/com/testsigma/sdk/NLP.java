package com.testsigma.sdk;


import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

public abstract class NLP {
  private static final int MESSAGE_MAX_SIZE = 500;
  @Getter
  protected String errorMessage;
  @Getter
  protected String successMessage;
  protected abstract void execute() throws Exception;

  protected void setErrorMessage(String errorMessage) {
    this.errorMessage = StringUtils.abbreviate(errorMessage, MESSAGE_MAX_SIZE);
  }

  protected void setSuccessMessage(String successMessage) {
    this.successMessage = StringUtils.abbreviate(successMessage, MESSAGE_MAX_SIZE);
  }

}
