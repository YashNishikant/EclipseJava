//car
public class Car {

	String Color;
	protected int Speed;
	int Seats;
	private int TSpeed;
	private int rateOfAcc;
	protected boolean leatherSeatsDefault = true;
	protected boolean entertainmentDefault = true;
	
	public Car(int topSpeed, int rateAcceleration) {
		TSpeed = topSpeed;
		rateOfAcc = rateAcceleration;		
	}
	
	void Accelerate() {
		Speed = Speed + rateOfAcc;
		if (Speed > TSpeed) {
			Speed = TSpeed;
			System.out.println("Top Speed Reached");
		}
	}

	void Decelerate() {
		Speed = Speed - 10;
		if (Speed < 0) {
			Speed = 0;
		}
	}

	int GetSpeed() {
		return Speed;
	}

	int GetTopSpeed() {
		return TSpeed;
	}

	int Brake() {
		Speed = 0;
		return Speed;
	}

	public int GetNumberOfSeats() {
		return Seats;
	}

	public String GetColor() {
		return Color;
	}

	public boolean EntertainmentSystem() {
		return entertainmentDefault;
	}

	public String SeatMaterial() {
		if (leatherSeatsDefault == true) {
			return "leather";
		} else {
			return "cloth";
		}
	}
	
	public String GetMake()
	{
		return "Dont Know";
	}

	public String GetModel()
	{
		return "Dont Know";
	}
}
