package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import stream.dto.Fruit;
import stream.store.FruitsDataStore;

public class StreamStudy {

	public static void main(String[] args) {
		FruitsDataStore store = new FruitsDataStore();
		List<Fruit> fruitsList = store.selectFruits();

		List<Fruit> orangeList = new ArrayList<>();
		for (Fruit fruit : fruitsList) {

		}

		List<String> fruitNameList = new ArrayList<>();
		for (Fruit fruit : fruitsList) {

		}

		Map<String, List<Fruit>> colorGroupMap = new HashMap<>();
		for (Fruit fruit : fruitsList) {

		}

	}

}
