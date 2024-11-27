package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Designations {
  SDE_1("Software Developer"), SDE_2("Consultant"), SDE_3("SDE-3"), CONSULTANT("Consultant"), SENIOR_CONSULTANT(
          "Senior Consultant"), SENIOR_ANALYST("Senior Analyst");

  private final String value;

  Designations(String value) {
    this.value = value;
  }

}
