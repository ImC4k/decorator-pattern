package imc4k.decoratorpattern;

import imc4k.decoratorpattern.person.Gender;
import imc4k.decoratorpattern.person.Person;
import imc4k.decoratorpattern.person.StudentDecorator;
import imc4k.decoratorpattern.person.SuperHeroDecorator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DecoratorPatternApplication {

	/*
	a decorator has a target and is a target
	pros: 	functionalities and attributes are clearly separated into different classes,
			this follows single responsibility principle
	cons:	for each decorator, we will need to override methods (e.g. getter and setters) to reference target
			decoratee instead of calling super

	 */
	public static void main(String[] args) {
		SpringApplication.run(DecoratorPatternApplication.class, args);
		Person peterParker = Person.builder()
				.name("Peter Parker")
				.age(17)
				.gender(Gender.MALE)
				.build();
		log.info(peterParker.getInfo());
		peterParker = StudentDecorator.builder()
				.person(peterParker)
				.schoolName("East High")
				.studentId("0123")
				.build();
		log.info(peterParker.getInfo());
		peterParker = SuperHeroDecorator.builder()
				.person(peterParker)
				.superHeroName("Spiderman")
				.abilities("shoot sticky stuff everywhere")
				.build();

		log.info(peterParker.getInfo());
		peterParker.setName("Peter Porker");
		log.info(peterParker.getInfo());
		log.info(peterParker.getName());
	}

}
