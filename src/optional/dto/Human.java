package optional.dto;

import java.util.Date;

public class Human {

	private String name;
	
	private Integer age;

	private Date birthday;
	
	public Human(String name, Integer age, Date birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Date getBirthday() {
		return birthday;
	}
}
