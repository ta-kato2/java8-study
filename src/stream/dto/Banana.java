package stream.dto;

public class Banana implements Fruit {
	
	private String name = "りんご";
	
	private String color = "赤";

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getColor() {
		return this.color;
	}

}
