package ru.te4rus.kiper.institution.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@RequiredArgsConstructor
public class InstitutionDTO {
  @NonNull
  private Long id;

  @NotBlank
  private String login;

  @NotBlank
  @EqualsAndHashCode.Exclude
  private String name;

  @NotBlank
  @EqualsAndHashCode.Exclude
  private String address;
}
