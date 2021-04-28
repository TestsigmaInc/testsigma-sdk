package com.testsigma.sdk.annotation;

import com.testsigma.sdk.ApplicationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NLP {
  String grammar();
  ApplicationType applicationType() default ApplicationType.WEB;
  String description() default "";
  boolean deprecated() default false;
}
