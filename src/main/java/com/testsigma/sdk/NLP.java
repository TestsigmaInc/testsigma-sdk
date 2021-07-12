package com.testsigma.sdk;


import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public abstract class NLP{
  private static final int MESSAGE_MAX_SIZE = 500;
  @Getter
  protected String errorMessage;
  @Getter
  protected String successMessage;
  @Getter @Setter
  private StringBuffer loggedMessages = new StringBuffer();
  protected abstract void execute() throws Exception;

  protected void setErrorMessage(String errorMessage) {
    this.errorMessage = StringUtils.abbreviate(errorMessage, MESSAGE_MAX_SIZE);
  }

  protected void setSuccessMessage(String successMessage) {
    this.successMessage = StringUtils.abbreviate(successMessage, MESSAGE_MAX_SIZE);
  }
  protected void log(Object message){
    loggedMessages.append(message.toString()+"<br>");
  }
}
