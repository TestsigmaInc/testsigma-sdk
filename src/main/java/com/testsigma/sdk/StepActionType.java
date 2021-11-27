/*
 * *****************************************************************************
 *  Copyright (C) 2020 Testsigma Inc.
 *  All rights reserved.
 *  ****************************************************************************
 */

package com.testsigma.sdk;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum StepActionType {
  NOT_USED(0, "Not Used"),
  IF_CONDITION(1, "If"),
  WHILE_LOOP(2, "While");

  @Getter
  private Integer id;
  @Getter
  private String name;

  public static StepActionType getConditionType(Integer id) {
    switch (id) {
      case 1:
        return IF_CONDITION;
      case 2:
        return WHILE_LOOP;
      default:
        return null;
    }
  }
}
