package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum FrontendTech {
  HTML("HTML", ExperienceLevel.PROFESSIONAL.name()), CSS("CSS", ExperienceLevel.PROFESSIONAL.name()),  JS("JavaScript", ExperienceLevel.INTERMEDIATE.name());

  private final String technology;
  private final String experienceLevel;

  FrontendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
