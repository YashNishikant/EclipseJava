import java.util.Scanner;

public class App {
	private static Scanner input;

	public static void main(String[] args) throws InterruptedException {

		HondaOdyssey hondaOdyssey = new HondaOdyssey(false, true, "Blue");
		hondaOdyssey.GetNumberOfSeats();
		System.out.println(" Color:" + hondaOdyssey.GetColor() + " NumberOfSeats:" + hondaOdyssey.GetNumberOfSeats() + " SeatMaterial:" + hondaOdyssey.SeatMaterial() + " Entertainment:" + hondaOdyssey.EntertainmentSystem());
		
		NissanRogue NissanCar = new NissanRogue(true, false, "silver");
		NissanCar.GetTopSpeed();

		input = new Scanner(System.in);
		System.out.println("Which car would you like to purchase? (Honda or Nissan)");

		String value = input.nextLine();

		if (value.equals("Honda")) {
			System.out.println("INFORMATION ON HONDA");
			System.out.println(hondaOdyssey.Color);
			System.out.println(hondaOdyssey.Seats);
			System.out.println("Top Speed: " + hondaOdyssey.GetTopSpeed());
			Thread.sleep(500);
			System.out.println("Would you like to test drive this car?");
		}

		if (value.equals("Nissan")) {
			System.out.println("INFORMATION ON NISSAN");
			System.out.println(NissanCar.Color);
			System.out.println(NissanCar.Seats);
			System.out.println("Top Speed: " + NissanCar.GetTopSpeed());
			Thread.sleep(500);
			System.out.println("Would you like to test drive this car?");

		}

		String value2 = input.nextLine();

		if (value2.equals("Yes")) {
			System.out.println("Ok, lets go! (Type 'END' to stop the test drive) Accelerate/Decelerate");
			System.out.println("_____________________");
		}

		if (value2.equals("No")) {
			System.out.println("Have a nice day, bye!");
			return;
		}

		while (true) {

			String value3 = input.nextLine();

			if (value3.equals("Accelerate")) {
				if (value.equals("Nissan")) {
					NissanCar.Accelerate();
					System.out.println(NissanCar.GetSpeed() + " MPH");
				}

				if (value.equals("Honda")) {
					hondaOdyssey.Accelerate();
					System.out.println(hondaOdyssey.GetSpeed() + " MPH");
				}
			}

			if (value3.equals("Decelerate")) {
				if (value.equals("Honda")) {
					hondaOdyssey.Decelerate();
					System.out.println(hondaOdyssey.GetSpeed() + " MPH");
				}

				if (value.equals("Nissan")) {
					NissanCar.Decelerate();
					System.out.println(NissanCar.GetSpeed() + " MPH");
				}

			}

			if (value3.equals("Brake")) {
				if (value.equals("Nissan")) {
					System.out.println(NissanCar.Brake() + " MPH Car Stopped");
				}
				if (value.equals("Honda")) {
					System.out.println(hondaOdyssey.Brake() + " MPH Car Stopped");
				}
			}

			if (value3.equals("Speed")) {
				if (value.equals("Honda")) {
					System.out.println("Current Speed: " + hondaOdyssey.GetSpeed() + " MPH");
				}
				if (value.equals("Nissan")) {
					System.out.println("Current Speed: " + NissanCar.GetSpeed() + " MPH");
				}
			}

			if (value3.equals("END")) {
				System.out.println("Thank you for test driving this car! Bye!");
				return;
			}
		}
	}
}
