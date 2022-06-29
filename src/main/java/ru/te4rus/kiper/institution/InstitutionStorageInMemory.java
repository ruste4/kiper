package ru.te4rus.kiper.institution;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class InstitutionStorageInMemory implements InstitutionStorage {

  Map<Long, Institution> institutions = new HashMap<>();
  AtomicLong idHolder = new AtomicLong(1);

  @Override
  public Institution findInstitutionById(Long id) {
    return institutions.get(id);
  }

  @Override
  public Institution addInstitution(Institution institution) {
    institution.setId(idHolder.getAndIncrement());
    institutions.put(institution.getId(), institution);
    return institution;
  }

  @Override
  public Institution updateInstitution(Institution institution) {
    addInstitution(institution);
    return institution;
  }

  @Override
  public void deleteInstitution(Long id) {
    institutions.remove(id);
  }

  public boolean isContain(Institution institution) {
    return institutions.containsValue(institution);
  }
}
