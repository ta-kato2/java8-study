package stream.store;

import java.util.ArrayList;
import java.util.List;

import stream.dto.Apple;
import stream.dto.Banana;
import stream.dto.Fruit;
import stream.dto.Orange;

public class FruitsDataStore {

	public List<Fruit> selectFruits(){
		ArrayList<Fruit> fruits = new ArrayList<>();
		{
			Banana banana = new Banana();
			fruits.add(banana);
		}
		{
			Orange orange = new Orange();
			fruits.add(orange);
		}
		{
			Apple apple = new Apple();
			fruits.add(apple);
		}
		{
			Banana banana = new Banana();
			fruits.add(banana);
		}
		{
			Orange orange = new Orange();
			fruits.add(orange);
		}
		{
			Apple apple = new Apple();
			fruits.add(apple);
		}
		{
			Apple apple = new Apple();
			fruits.add(apple);
		}
		{
			Orange orange = new Orange();
			fruits.add(orange);
		}
		return fruits;
	}
}
