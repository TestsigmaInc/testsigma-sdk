package com.testsigma.sdk.runners;

import com.testsigma.sdk.DriverNLP;
import com.testsigma.sdk.NLP;
import com.testsigma.sdk.annotation.UIIdentifier;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    private WebDriver driver;

    public Runner(WebDriver driver) throws Exception {
        if(driver == null){
            throw new Exception("Please provide a valid WebDriver object");
        }
        this.driver = driver;
    }

    public void run(DriverNLP nlpObject) throws Exception {
        nlpObject.setDriver(driver);
        List<Field> uiIdentifierFields = new ArrayList<>();
        Field[] declaredFields = nlpObject.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
           if (declaredField.isAnnotationPresent(UIIdentifier.class)) {
                declaredField.setAccessible(true);
                uiIdentifierFields.add(declaredField);
            }
        }
        setDriverToUiIdentifier(nlpObject, uiIdentifierFields);
        Method execute = nlpObject.getClass().getMethod("execute",null);
        execute.setAccessible(true);
        execute.invoke(nlpObject);
    }

    private void setDriverToUiIdentifier(NLP nlpObject, List<Field> uiIdentifierFields) throws Exception {
        for (Field uiIdentifierField : uiIdentifierFields) {
            com.testsigma.sdk.UIIdentifier uiIdentifierObj = (com.testsigma.sdk.UIIdentifier) uiIdentifierField.get(nlpObject);
            uiIdentifierObj.setWebDriver(driver);
            FieldUtils.writeField(uiIdentifierField, nlpObject, uiIdentifierObj, true);
        }
    }
    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }

}
