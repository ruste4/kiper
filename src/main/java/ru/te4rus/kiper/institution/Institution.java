package ru.te4rus.kiper.institution;

import lombok.*;
import ru.te4rus.kiper.employee.Employee;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@RequiredArgsConstructor
public class Institution {
  @NonNull
  @EqualsAndHashCode.Exclude
  private Long id;

  @NotBlank
  private String login;

  @NotBlank
  private String name;

  @NotBlank
  private String address;
}
