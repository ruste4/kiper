package ru.te4rus.kiper.institution;

public interface InstitutionStorage {
  Institution findInstitutionById(Long id);

  Institution addInstitution(Institution institution);

  Institution updateInstitution(Institution institution);

  void deleteInstitution(Long id);

  boolean isContain(Institution institution);
}
