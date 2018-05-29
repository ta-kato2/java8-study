package optional.store;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import optional.dto.Person;

public class PersonDataStore {

	public List<Person> selectPersonList() {
		List<Person> list = new ArrayList<>();
		DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		try {
			{
				Person person = new Person("のぐち", 27, formatter.parse("1991/10/01"));
				list.add(person);
			}
			{
				Person person = new Person("とつか", 33, null);
				list.add(person);
			}
			{
				Person person = new Person("むらかみ", 27, formatter.parse("1998/09/16"));
				list.add(person);
			}
			{
				Person person = new Person("やなぎ", null, null);
				list.add(person);
			}
			{
				Person person = new Person("かとう", 27, formatter.parse("1982/12/21"));
				list.add(person);
			}
			{
				Person person = new Person("いけだ", null, null);
				list.add(person);
			}
			return list;
		} catch (ParseException e) {
			throw new RuntimeException("error!", e);
		}
	}
}
