package ru.te4rus.kiper.institution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.te4rus.kiper.institution.exceptions.InstitutionAlreadyExistException;
import ru.te4rus.kiper.institution.exceptions.InstitutionNotFoundException;

@Slf4j
@Service
public class InstitutionService {
  private final InstitutionStorage storage;

  @Autowired
  public InstitutionService(InstitutionStorage storage) {
    this.storage = storage;
  }


  public Institution getInstitution(Long id) {
    log.info("Get institution by id:{}", id);

    Institution institution = storage.findInstitutionById(id);

    if (institution == null) {
      throw new InstitutionNotFoundException("Institution with id:" + id + " not found.");
    }

    return institution;
  }


  public Institution addInstitution(Institution institution) {
    log.info("Add institution {}", institution);

    if (storage.isContain(institution)) {
      throw new InstitutionAlreadyExistException("Institution already exist.");
    }

    return storage.addInstitution(institution);
  }


  public Institution updateInstitution(Institution institution) {
    log.info("Update institution with id {} on {}", institution.getId(), institution);

    if (storage.findInstitutionById(institution.getId()) == null) {
      throw new InstitutionNotFoundException("Institution with id:" + institution.getId() + " not found.");
    }

    return storage.updateInstitution(institution);
  }


  public void deleteInstitution(Long id) {
    log.info("Delete institution with id:{}", id);

    if (storage.findInstitutionById(id) == null) {
      throw new InstitutionNotFoundException("Institution with id:" + id + " not found.");
    }

    storage.deleteInstitution(id);
  }
}
