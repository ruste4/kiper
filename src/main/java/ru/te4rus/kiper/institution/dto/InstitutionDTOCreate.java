package ru.te4rus.kiper.institution.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@RequiredArgsConstructor
public class InstitutionDTOCreate {
  @NotBlank
  private String login;

  @NotBlank
  @EqualsAndHashCode.Exclude
  private String name;

  @NotBlank
  @EqualsAndHashCode.Exclude
  private String address;
}
