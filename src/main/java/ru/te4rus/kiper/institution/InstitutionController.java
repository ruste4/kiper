package ru.te4rus.kiper.institution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.te4rus.kiper.institution.dto.InstitutionDTO;
import ru.te4rus.kiper.institution.dto.InstitutionDTOCreate;
import ru.te4rus.kiper.institution.dto.InstitutionMapper;

import javax.validation.Valid;

@RestController
@RequestMapping("/institutions")
public class InstitutionController {

  private final InstitutionService institutionService;
  private final InstitutionMapper mapper;

  @Autowired
  public InstitutionController(InstitutionService institutionService, InstitutionMapper mapper) {
    this.institutionService = institutionService;
    this.mapper = mapper;
  }


  @GetMapping("/{id}")
  public InstitutionDTO getInstitution(@PathVariable Long id) {
    return mapper.toDto(
      institutionService.getInstitution(id)
    );
  }

  @PostMapping
  public InstitutionDTO addInstitution(@Valid @RequestBody InstitutionDTOCreate institutionDTOCreate) {
    Institution institution = mapper.toInstitution(institutionDTOCreate);

    return mapper.toDto(
      institutionService.addInstitution(institution)
    );
  }

  @PutMapping
  public InstitutionDTO updateInstitution(@Valid @RequestBody InstitutionDTO institutionDTO) {
    Institution institution = mapper.toInstitution(institutionDTO);

    return mapper.toDto(
      institutionService.updateInstitution(institution)
    );
  }

  @DeleteMapping("/{id}")
  public void deleteInstitution(@PathVariable Long id) {
    institutionService.deleteInstitution(id);
  }
}
