public class HondaOdyssey extends Honda {

	public HondaOdyssey(boolean leatherSeats, boolean entertainment, String OdessyColor) {
		leatherSeatsDefault = leatherSeats;
		entertainmentDefault = entertainment;
		Color = OdessyColor;
		Seats = 7;
	}
	
	public String GetMake()
	{
		return "Honda";
	}

	public String GetModel()
	{
		return "Odyssey";
	}
}