package optional.store;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import optional.dto.Human;

public class HumanDataStore {

	public List<Human> selectHumanList() {
		List<Human> list = new ArrayList<>();
		DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		try {
			{
				Human human = new Human("のぐち", 27, formatter.parse("1991/10/01"));
				list.add(human);
			}
			{
				Human human = new Human("とつか", 33, null);
				list.add(human);
			}
			{
				Human human = new Human("むらかみ", 27, formatter.parse("1998/09/16"));
				list.add(human);
			}
			{
				Human human = new Human("やなぎ", null, null);
				list.add(human);
			}
			{
				Human human = new Human("かとう", 27, formatter.parse("1982/12/21"));
				list.add(human);
			}
			{
				Human human = new Human("いけだ", null, null);
				list.add(human);
			}
			return list;
		} catch (ParseException e) {
			throw new RuntimeException("error!", e);
		}
	}
}
