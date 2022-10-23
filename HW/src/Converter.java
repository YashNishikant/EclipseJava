
public class Converter {

	public static void main (String [] Args) {
	
		
	//Part I
	int f = 88;
	double c = (f-32)*(5.0/9.0);
		
	System.out.println("If the temperature in Fahrenheit is " + f + " degrees Fahrenheit," + " then temperature in Celsius is: " + c + " degrees Celsius");
	
	//Part II
	
	double pi = 3.1416;
	double T = 2.8;
	double g = 9.8;
	double L = ((T / (2 * pi)) * (T / (2 * pi)) * g);
	
	System.out.println("\nIf the Pendulum period is " + T + " seconds, then the length of the Pendulum is: " + L + " meters");
	
	//Part III
	
	double fl = 20.2; 
	double v = 68.5;
	double U = (fl * v)/(v-fl);
	
	System.out.println("\n" + "If the focal length is 20.2 cm and the image distance is 68.5 cm, then the Optic distance: " + U + " cm");
	}
}