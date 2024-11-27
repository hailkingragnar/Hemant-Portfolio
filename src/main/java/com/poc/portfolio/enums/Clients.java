package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Clients {
  ORACLE("CAS Total Solutions"), MCQ("Integrasi Solusindo");

  private final String value;

  Clients(String value) {
    this.value = value;
  }

}
