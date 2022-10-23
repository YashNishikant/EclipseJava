import java.util.ArrayList;

public class FoodRunner {

	public FoodRunner() {
		Food f1 = new Food("Pizza", 300);
		Food f2 = new Food("Hot Dog", 250);
		Food f3 = new Food("Hamburger", 450);
		Fruit f4 = new Fruit("Apple", 75, true);
		Food f5 = new Fruit("Banana", 100, true);
		Food f6 = new Vegetable("Carrot", 20, true);
		Food f7 = new Dairy("Milk", 90, false);
		Cheese f8 = new Cheese("Cheddar", 50, true, 5);
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(f1);
		foods.add(f2);
		foods.add(f3);
		foods.add(f4);
		foods.add(f5);
		foods.add(f6);
		foods.add(f7);
		foods.add(f8);
		System.out.println(foods);
		int calstotal = 0;
		for (Food f : foods) {
			calstotal += f.getCalories();

		}
		System.out.println(calstotal);
	}
}
