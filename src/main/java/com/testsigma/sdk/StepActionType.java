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
  IF_CONDITION(1, "If"),
  WHILE_LOOP(2, "While");

  @Getter
  private Integer id;
  @Getter
  private String name;
}
