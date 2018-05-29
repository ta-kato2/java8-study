package optional.dto;

import java.util.Date;
import java.util.Optional;

public class Person {

	private String name;
	
	private Optional<Integer> age;

	private Optional<Date> birthday;
	
	public Person(String name, Integer age, Date birthday) {
		this.name = name;
		this.age = Optional.ofNullable(age);
		this.birthday = Optional.ofNullable(birthday);
	}

	public String getName() {
		return name;
	}

	public Optional<Integer> getAge() {
		return age;
	}

	public Optional<Date> getBirthday() {
		return birthday;
	}
}
