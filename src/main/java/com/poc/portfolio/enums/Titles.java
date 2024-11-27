package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Titles {
  SOFTWARE_DEVELOPMENT_ENGINEER("JAVA Backend Developer"), BACKEND_DEVELOPER("Microservices Developer"), JAVA_DEVELOPER(
          "API & Backend Specialist");

  private final String value;

  Titles(String value) {
    this.value = value;
  }

}
