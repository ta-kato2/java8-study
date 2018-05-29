package optional;

import java.util.List;

import optional.dto.Person;
import optional.store.PersonDataStore;

public class OptionalStudy2 {

	public static void main(String[] args) {
		PersonDataStore store = new PersonDataStore();
		List<Person> personList = store.selectPersonList();

		for (Person person : personList) {
			System.out.println(person);
		}
	
	}

}
