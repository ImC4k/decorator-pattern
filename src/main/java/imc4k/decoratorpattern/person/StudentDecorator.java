package imc4k.decoratorpattern.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDecorator extends Person {
    private Person person;
    private String schoolName;
    private String studentId;

    public StudentDecorator(Person person) {
        this.person = person;
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public Integer getAge() {
        return person.getAge();
    }

    @Override
    public Gender getGender() {
        return person.getGender();
    }

    @Override
    public void setName(String name) {
        person.setName(name);
    }

    @Override
    public void setAge(Integer age) {
        person.setAge(age);
    }

    @Override
    public void setGender(Gender gender) {
        person.setGender(gender);
    }

    @Override
    public String getInfo() {
        return person.getInfo() + "\n" +
                person.getGender().getPronoun() + " is also a student, sid: " + studentId + " studying in " + schoolName;
    }
}
