package imc4k.decoratorpattern.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Person {
    private String name;
    private Integer age;
    private Gender gender;

    public String getInfo() {
      return name + " is " + age + " years old";
    }
}
