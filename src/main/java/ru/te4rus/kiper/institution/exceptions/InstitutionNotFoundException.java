package ru.te4rus.kiper.institution.exceptions;

public class InstitutionNotFoundException extends RuntimeException {
  public InstitutionNotFoundException(String message) {
    super(message);
  }
}
