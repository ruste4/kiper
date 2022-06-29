package ru.te4rus.kiper.institution.dto;

import org.springframework.stereotype.Component;
import ru.te4rus.kiper.institution.Institution;

@Component
public class InstitutionMapper {
  public InstitutionDTO toDto(Institution institution) {
    return InstitutionDTO.builder()
      .login(institution.getLogin())
      .name(institution.getName())
      .address(institution.getAddress())
      .build();
  }

  public Institution toInstitution(InstitutionDTO institutionDTO) {
    return Institution.builder()
      .login(institutionDTO.getLogin())
      .name(institutionDTO.getName())
      .address(institutionDTO.getAddress())
      .build();
  }

  public Institution toInstitution(InstitutionDTOCreate institutionDTOCreate) {
    return Institution.builder()
      .login(institutionDTOCreate.getLogin())
      .name(institutionDTOCreate.getName())
      .address(institutionDTOCreate.getAddress())
      .build();
  }
}
