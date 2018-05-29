package stream.dto;

import java.util.Optional;

public class FruitJelly {

	private String name;
	
	public FruitJelly(Fruit fruit) {
		this.name = fruit.getName() + "ゼリー";
	}

	public String getName() {
		return name;
	}
	
}
