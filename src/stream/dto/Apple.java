package stream.dto;

public class Apple implements Fruit {
	
	private String name = "バナナ";
	
	private String color = "黄色";

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getColor() {
		return this.color;
	}

}
