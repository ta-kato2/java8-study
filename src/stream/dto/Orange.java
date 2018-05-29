package stream.dto;

public class Orange implements Fruit {
	
	private String name = "オレンジ";
	
	private String color = "橙色";
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getColor() {
		return this.color;
	}
}
