package ru.te4rus.kiper.employee;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Employee {
  private Long id;
  private String name;
  private String surname;
  private LocalDate birthday;
  private String phone;
  private String login;
  private String password;
  private EmployeeRole role;
}
