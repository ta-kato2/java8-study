package optional;

import java.util.List;

import optional.dto.Human;
import optional.store.HumanDataStore;

public class OptionalStudy {

	public static void main(String[] args) {

		HumanDataStore store = new HumanDataStore();
		List<Human> humanList = store.selectHumanList();

		for (Human human : humanList) {
			System.out.println(human);
		}
	}
	
}
