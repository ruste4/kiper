package ru.te4rus.kiper.institution.exceptions;

public class InstitutionAlreadyExistException extends RuntimeException {
  public InstitutionAlreadyExistException(String message) {
    super(message);
  }
}
