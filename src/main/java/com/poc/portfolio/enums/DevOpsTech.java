package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum DevOpsTech {
  DOCKER("Docker", ExperienceLevel.PROFESSIONAL.name()), KUBERNETES("Kubernetes", ExperienceLevel.PROFESSIONAL
          .name());

  private final String technology;
  private final String experienceLevel;

  DevOpsTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
