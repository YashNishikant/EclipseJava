import java.util.ArrayList;

public class CarGarage {
	ArrayList<Car> myArrCar = new ArrayList<Car>();
	private int i = 0;

	void Enter(Car car) {
		myArrCar.add(car);
		i++;
	}

	void Exit(Car car) {
		myArrCar.remove(car);
		i--;
	}

	int CountCar() {
		return i;
	}

	void carMakeModel() {
		for (int i = 0; i < myArrCar.size(); i++) {
			Car c = myArrCar.get(i);
			String x = c.GetModel();
			String y = c.GetMake();
			System.out.println(y + " " + x);
		}
	}

	public static void main(String[] args) {

		HondaOdyssey hondaOdyssey = new HondaOdyssey(false, true, "Blue");
		NissanRogue nissanCar = new NissanRogue(true, false, "silver");

		CarGarage garage = new CarGarage();

		garage.Enter(hondaOdyssey);
		garage.Enter(nissanCar);
		garage.Exit(hondaOdyssey);
		garage.Enter(nissanCar);
		garage.Enter(hondaOdyssey);

		garage.carMakeModel();
	}
}
